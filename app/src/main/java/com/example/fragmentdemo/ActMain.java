package com.example.fragmentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
    }

    public void btn1_click(View view) {
        startActivity(new Intent(this, Act1.class));
    }

    public void btn2_click(View view) {
        startActivity(new Intent(this, Act2.class));
    }

    public void btn3_click(View view) {
        startActivity(new Intent(this, Act3.class));
    }

    public void btn4_click(View view) {
        startActivity(new Intent(this, Act4.class));
    }

    public void btn5_click(View view) {
        startActivity(new Intent(this, Act5.class));
    }

    public void btn6_click(View view) {
        startActivity(new Intent(this, Act6.class));
    }
}
