package com.example.mvvmdemo.propertylisting.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.propertylisting.adapter.PropertyListingAdapter;
import com.example.mvvmdemo.propertylisting.model.PropertyListingModel;
import com.example.mvvmdemo.propertylisting.model.ResultItem;
import com.example.mvvmdemo.propertylisting.repository.PropertyRepository;
import com.example.mvvmdemo.propertylisting.viewmodel.PropertyListViewModel;

import java.util.ArrayList;
import java.util.List;

public class PropertyListingActivity extends AppCompatActivity {

    ArrayList<ResultItem> resultItemArrayList = new ArrayList<>();
    PropertyListingAdapter propertyListingAdapter;
    RecyclerView propertyRecyclerView;
    PropertyListViewModel propertyListViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_property_listing);
       propertyRecyclerView  = findViewById(R.id.propertylistingRecyclerView);

        propertyListViewModel = ViewModelProviders.of(this).get(PropertyListViewModel.class);
        propertyListViewModel.init();
        propertyListViewModel.getPropertiesRepository().observe(this, new Observer<PropertyListingModel>() {
            @Override
            public void onChanged(PropertyListingModel newsResponse) {
                List<ResultItem> properties = newsResponse.getResult();
                resultItemArrayList.addAll(properties);
                propertyListingAdapter.notifyDataSetChanged();
            }
        });

        setupRecyclerView();



    }

    private void setupRecyclerView() {

        if (propertyListingAdapter == null) {
            propertyListingAdapter = new PropertyListingAdapter(PropertyListingActivity.this, resultItemArrayList);
            propertyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            propertyRecyclerView.setAdapter(propertyListingAdapter);
            propertyRecyclerView.setItemAnimator(new DefaultItemAnimator());
            propertyRecyclerView.setNestedScrollingEnabled(true);
        } else {
            propertyListingAdapter.notifyDataSetChanged();
        }

    }


}