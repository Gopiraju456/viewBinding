package com.example.bindview.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bindview.R;
import com.example.bindview.databinding.ActivityMainBinding;
import com.example.bindview.databinding.ModelsBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

ActivityMainBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        b.bt1.setOnClickListener(this);


        final  AlertDialog.Builder builder=new AlertDialog.Builder(this);



        b.bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("hiasmf");
                final ModelsBinding o=ModelsBinding.inflate(getLayoutInflater());
                builder.setView(o.getRoot());
                o.title.setText("sjafidgjdfvnahgndacjnakfadknvkldn");
                o.title.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        o.title.setText("snfjdnafndjan");
                    }
                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "goipiraju", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.create();
                builder.show();
            }
        });


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.bt1:
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
        }
    }




}