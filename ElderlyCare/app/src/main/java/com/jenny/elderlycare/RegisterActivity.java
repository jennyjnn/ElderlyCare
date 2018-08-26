package com.jenny.elderlycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void registerHospital(View view) {
        Intent intent = new Intent(RegisterActivity.this, RegisterHospitalActivity.class);
        startActivity(intent);
    }
}
