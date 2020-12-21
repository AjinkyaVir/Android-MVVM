package com.example.mvvmdemo.network;

import com.example.mvvmdemo.model.LoginModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ajinkya on 12/21/2020.
 */
public interface ApiService {

    @GET("api/user/generateOtp")
    Call<LoginModel> generateOtp(@Query("mobileNumber")String mobileNumber);

    @GET("api/user/checkOtp")
    Call<LoginModel> checkOtp(@Query("mobileNumber")String mobileNumber,
                                        @Query("otp")int otp);

}
