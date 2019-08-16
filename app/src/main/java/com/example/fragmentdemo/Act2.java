package com.example.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_2);
        InitialComponent();
    }

    private void InitialComponent() {
        frag  = (Frag2) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkoutId(1);

    }

    Frag2 frag;

}
