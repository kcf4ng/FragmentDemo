package com.example.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Frag2 extends Fragment {
    long workoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_2, container, false);

    }


    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if( view != null){
            TextView title =view.findViewById(R.id.textTitle);
            TextView description = view.findViewById(R.id.textDescription);
            cWorkout workout = cWorkout.workouts[(int)workoutId];

            title.setText(workout.getStrName());
            description.setText(workout.getStrDescription());
        }
    }



    public void setWorkoutId(long id) {
        this.workoutId = id;
    }



}
