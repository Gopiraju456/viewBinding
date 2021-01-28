package com.example.bindview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bindview.databinding.ModelsBinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.GopiViewHoldder>  {
   List<String> titlegopi;

    public AdapterClass(List<String> titlegopi) {
        this.titlegopi = titlegopi;
    }

    @NonNull
    @Override
    public GopiViewHoldder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        ModelsBinding modelsBinding=ModelsBinding.inflate(layoutInflater,parent,false);
        return new GopiViewHoldder(modelsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull GopiViewHoldder holder, int position) {
        holder.modelsBinding.title.setText(titlegopi.get(position));


    }

    @Override
    public int getItemCount() {
        return titlegopi.size();
    }

    class GopiViewHoldder extends RecyclerView.ViewHolder{

        ModelsBinding modelsBinding;
        

        public GopiViewHoldder( ModelsBinding item) {
            super(item.getRoot());
            modelsBinding=item;
        }



    }
}
