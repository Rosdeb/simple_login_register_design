package com.example.project1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

    }

    public void  loginback(View view){

   onBackPressed();

    }
    public void homepae(View view){

        startActivity(new Intent(ForgetActivity.this,HomepageAcitvity.class));

    }
}
