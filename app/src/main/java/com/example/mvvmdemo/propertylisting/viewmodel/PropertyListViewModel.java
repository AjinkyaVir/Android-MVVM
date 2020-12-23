package com.example.mvvmdemo.propertylisting.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmdemo.propertylisting.model.PropertyListingModel;
import com.example.mvvmdemo.propertylisting.model.ResultItem;
import com.example.mvvmdemo.propertylisting.repository.PropertyRepository;

import java.util.List;

/**
 * Created by Ajinkya on 12/22/2020.
 */
public class PropertyListViewModel extends ViewModel {

    private MutableLiveData<PropertyListingModel> mutableLiveData;
    private PropertyRepository propertyRepository;

    public void init(){
        if (mutableLiveData != null){
            return;
        }
        propertyRepository = PropertyRepository.getInstance();
        mutableLiveData = propertyRepository.getProperties();
    }

    public LiveData<PropertyListingModel> getPropertiesRepository(){
        return mutableLiveData;
    }

}
