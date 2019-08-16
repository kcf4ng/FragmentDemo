package com.example.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Act6_2 extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID ="id" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_6_2);
        Frag6 frag =(Frag6) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int workoutId = (int)getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag.setWorkoutId(workoutId);
    }
}
