package com.example.mvvmdemo.propertylisting.repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvmdemo.network.ApiService;
import com.example.mvvmdemo.network.RetrofitClientInstance;
import com.example.mvvmdemo.propertylisting.model.PropertyListingModel;
import com.example.mvvmdemo.propertylisting.model.ResultItem;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ajinkya on 12/22/2020.
 */
public class PropertyRepository {

    private static PropertyRepository propertyRepository;
    Context context;

    public static PropertyRepository getInstance(){
        if (propertyRepository == null){
            propertyRepository = new PropertyRepository();
        }
        return propertyRepository;
    }

    private ApiService apiService;

    public MutableLiveData<PropertyListingModel> getProperties(){
        final MutableLiveData<PropertyListingModel> propertyListingModelMutableLiveData = new MutableLiveData<>();
        apiService = RetrofitClientInstance.getRetrofitInstance(context).create(ApiService.class);
        Call<PropertyListingModel> call = apiService.getAllProperties();
        call.enqueue(new Callback<PropertyListingModel>() {
            @Override
            public void onResponse(Call<PropertyListingModel> call, Response<PropertyListingModel> response) {
                if (response.isSuccessful()){
                    propertyListingModelMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<PropertyListingModel> call, Throwable t) {
                propertyListingModelMutableLiveData.setValue(null);
            }
        });
        return propertyListingModelMutableLiveData;
    }
}
