package com.example.fragmentdemo;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Act5 extends AppCompatActivity  implements Frag4_ListFragment.Listener{

    // act5   重複利用 act4 的 ListFragment 和說明 Fragment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_5);
    }

    @Override
    public void itemClicked(long id) {
        //確認fragment_container的 View 是不是存在，存在的話執行堆疊
        View FragmentContainer = findViewById(R.id.fragment_container);
        if(FragmentContainer != null){
        Frag5 details = new Frag5();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        details.setWorkoutId((int)id);
         ft.replace(R.id.fragment_container,details)   ;
         ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
         ft.addToBackStack(null);
         ft.commit();

        }else{
            startActivity( new Intent(this, Act4_2.class).putExtra(Act4_2.EXTRA_WORKOUT_ID, (int)id));
        }

    }
}
