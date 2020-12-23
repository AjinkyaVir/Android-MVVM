package com.example.mvvmdemo.propertylisting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.PropertyListingBinding;
import com.example.mvvmdemo.propertylisting.model.PropertyListingModel;
import com.example.mvvmdemo.propertylisting.model.ResultItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ajinkya on 12/22/2020.
 */
public class PropertyListingAdapter extends RecyclerView.Adapter<PropertyListingAdapter.ViewHolder> {


    Context context;
    ArrayList<ResultItem> resultItems;

    public PropertyListingAdapter(Context context, ArrayList<ResultItem> resultItems) {
        this.context = context;
        this.resultItems = resultItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.property_listing,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(resultItems.get(position).getPropertyName());
        holder.txtBuilderName.setText(resultItems.get(position).getPropertyDeveloper().getPropertyDeveloperName());
        holder.txtAddress.setText(resultItems.get(position).getPropertyArea()+", "+
                resultItems.get(position).getPropertyCity());
        holder.txtBhk.setText(resultItems.get(position).getBhkType());
        Picasso.with(context).load(resultItems.get(position).getPropertiesImages().get(0)).into(holder.imgProperty);

    }

    @Override
    public int getItemCount() {
        return resultItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private  PropertyListingBinding propertyListingBinding;

        TextView txtBhk,txtPrice,txtName,txtBuilderName,txtAddress;
        ImageView imgProperty;
        ConstraintLayout mainLayout;

        public ViewHolder(View view) {
            super(view);
            txtBhk = itemView.findViewById(R.id.txtBhk);
            txtPrice = itemView.findViewById(R.id.txtPricing);
            txtName = itemView.findViewById(R.id.txtName);
            txtBuilderName = itemView.findViewById(R.id.txtBuilderName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            imgProperty = itemView.findViewById(R.id.imgProperty);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }


    }
}
