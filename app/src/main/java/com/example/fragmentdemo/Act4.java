package com.example.fragmentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Act4 extends AppCompatActivity implements Frag4_ListFragment.Listener{

    /*ListFragment 通過實作 interface 和 Act4 互動，告訴他按下了哪一個項目(id)；
        接著把 id 帶到 Act 4_2，Act4_2 再把 id 給 fragment 秀出對應的內容。
        因此，首先得先在 ListFragment 宣告 interface(一個listener)，以及按下要執行的onclick方法，
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_4);
    }

    @Override
    public void itemClicked(long id) {
        startActivity( new Intent(this, Act4_2.class).putExtra(Act4_2.EXTRA_WORKOUT_ID, (int)id));
    }
}
