package com.example.fragmentdemo;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Act6 extends AppCompatActivity implements  Frag6_ListFragment.Listener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_6);
    }

    @Override
    public void itemClicked(long id) {
        View FragmentContainer = findViewById(R.id.fragment_container);
        if(FragmentContainer != null){
            Frag6 details = new Frag6();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWorkoutId((int)id);
            ft.replace(R.id.fragment_container,details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }else{
            startActivity( new Intent(this, Act6_2.class).putExtra(Act6_2.EXTRA_WORKOUT_ID, (int)id));
        }
    }

}
