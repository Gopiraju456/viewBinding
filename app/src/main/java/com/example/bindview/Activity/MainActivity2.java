package com.example.bindview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.bindview.BlankFragment;
import com.example.bindview.R;
import com.example.bindview.databinding.ActivityMain2Binding;
import com.example.bindview.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(a.getRoot());
       // setContentView(R.layout.activity_main2);
    //    final FrameLayout frameLayout=findViewById(R.id.framlayout);

        a.game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new BlankFragment();

                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction transaction=fm.beginTransaction();
                transaction.replace(R.id.framlayout,fragment);
                transaction.commit();


            }
        });

    }
}