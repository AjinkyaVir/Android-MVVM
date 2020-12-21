package com.example.mvvmdemo.viewmodel;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.lifecycle.ViewModel;

import com.example.mvvmdemo.BR;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.model.LoginModel;
import com.example.mvvmdemo.network.ApiService;
import com.example.mvvmdemo.network.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ajinkya on 12/21/2020.
 */
public class LoginViewModel extends BaseObservable {

    private LoginModel loginModel;
    public String phoneNumber;

    Context context;

    public LoginViewModel(Context context) {
        this.context = context;
    }

    @Bindable
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        notifyPropertyChanged(BR.phoneNumber);
    }

    public void onButtonClick() {
        if (phoneNumber == null || phoneNumber.equals("")){
            Toast.makeText(context, "Phone number is Invalid", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show();
            generateOtp();
        }
    }

    private void generateOtp() {

            final ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage("Signing In...");
            progressDialog.show();
            ApiService service = RetrofitClientInstance.getRetrofitInstance(context).create(ApiService.class);
            Call<LoginModel> call = service.generateOtp(phoneNumber);
            Log.i("@login","login phone number === >>> " + phoneNumber);
            call.enqueue(new Callback<LoginModel>() {
                @Override
                public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                    if (response.code()==200){
                        progressDialog.dismiss();

                        Log.i("@login","login url=========>"+call.request().url());

                        showCheckOtpDialog(response.body().getOtp());
                    }
                }

                @Override
                public void onFailure(Call<LoginModel> call, Throwable t) {
                    Log.i("@login","login error=========>"+t.getMessage());
                    Log.i("@login","login url=========>"+call.request().url());

                    Toast.makeText(context, "User cannot registered.", Toast.LENGTH_SHORT).show();
                }
            });

        }

    private void showCheckOtpDialog(final int otp){
        final Dialog dialog=new Dialog(context);
        dialog.setContentView(R.layout.check_dialog_otp);
        dialog.setCanceledOnTouchOutside(false);
        final EditText edtOtp=dialog.findViewById(R.id.edtOtp);
        Button btnVerify=dialog.findViewById(R.id.btnOtpVerify);
        TextView txtResendOtp=dialog.findViewById(R.id.txtOtpResendOtp);
        edtOtp.setText(""+otp);
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtOtp.getText().toString().isEmpty() && edtOtp.getText().toString().length()==4){
                    checkOtp(phoneNumber,otp,dialog);
                }
                else {
                    if (edtOtp.getText().toString().isEmpty())
                        Toast.makeText(context, "Enter OTP", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(context, "Invalid OTP", Toast.LENGTH_SHORT).show();

                }

            }
        });
        txtResendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                generateOtp();

            }
        });


        dialog.show();

    }

    private void checkOtp(String username, int otp, final Dialog dialog) {

        ApiService service = RetrofitClientInstance.getRetrofitInstance(context).create(ApiService.class);
        Call<LoginModel> call = service.checkOtp(username,otp);
        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                if (response.code()==200){
                    Log.i("@login","signUp url=========>"+call.request().url());
                    if (response.body().getStatus().equals("success")){
                        dialog.dismiss();
                       /* savePrefsData(response.body().getResult());
                        Intent intent = new Intent(context, MainActivity.class);
                        startActivity(intent);
                        finish();*/
                    }
                    else {
                        Toast.makeText(context, response.body().getMsg(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                Log.i("@signUp","signUp url=========>"+t.getMessage());
                Log.i("@signUp","signUp url=========>"+call.request().url());

                Toast.makeText(context, "Invalid Otp.", Toast.LENGTH_SHORT).show();
            }
        });

    }



}



