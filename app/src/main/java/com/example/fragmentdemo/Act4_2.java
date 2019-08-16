package com.example.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Act4_2 extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_4_2);
        Frag4 frag =(Frag4) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        //取得intent帶過的if
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        //Activity 再將 id 給 fragment
        frag.setWorkoutId(workoutId);

    }

}
