package com.example.bindview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.bindview.AdapterClass;
import com.example.bindview.databinding.ActivityMain3Binding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity3 extends AppCompatActivity {
ActivityMain3Binding binding;
AdapterClass adapterClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
        binding=ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(linearLayoutManager);
        List<String> ti=new ArrayList<>();
        ti.add(("gopiaas"));
        ti.add(("ghdfjajfaskf"));
        ti.add(("dfashphfkn"));
        ti.add(("ahfdajfjkfjk"));

        adapterClass=new AdapterClass(ti);
        binding.recyclerview.setAdapter(adapterClass);


    }

}