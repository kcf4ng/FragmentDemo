package com.example.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class Frag3_ListFragment extends ListFragment {

    public Frag3_ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        //首先，宣告並實體化一個字串陣列
        String[] name = new String[cWorkout.workouts.length];

        //把運動項目的名稱放入陣列
        for(int i = 0; i<name.length;i++)
        {
            name[i] = cWorkout.workouts[i].getStrName();
        }

        //建立Adapter。由inflater取得context；設定清單樣式為simple_list_item_1；放入陣列
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(),android.R.layout.simple_list_item_1,name);

        //直接把adapter放進去
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
