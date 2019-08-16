package com.example.fragmentdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Frag6_ListFragment extends ListFragment {

    //先定義一個 Interface ,也就是listener
    static interface Listener{
        void itemClicked(long id);
    }

    //接著宣告一個Listener
    Frag6_ListFragment.Listener listener;

    public Frag6_ListFragment() {
        // Required empty public constructor
    }

    //當fragment 被 activity 連接時，就會執行 onAttach。把 context 當成 listener。
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener =(Frag6_ListFragment.Listener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
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

    //覆寫ListView中的項目點選時的動作,當被點擊時通知listener
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(listener != null){
            listener.itemClicked(id);
        }
    }

}
