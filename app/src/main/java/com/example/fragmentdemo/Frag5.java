package com.example.fragmentdemo;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Frag5 extends Fragment {
    long workoutId;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null){
            workoutId = savedInstanceState.getLong("workoutId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_5, container, false);
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

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState .putLong("workoutId", workoutId);
    }
}
