package com.example.fragmentdemo;

public class cWorkout {
    String strName;
    String strDescription;

    public static final cWorkout[] workouts = {
            new cWorkout("The Limb Loosener","5 Handstand push-ups\n10 1-legged squets\n15 Pull-ups"),
            new cWorkout("Core Agony","100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new cWorkout("The Wimp Special","5 Pull-ups\n10 Push-ups\n15 Squats"),
            new cWorkout("Strength and Length","500 meter run\n21x1.5 pood kettleball swing\n21 x pill-ups")
    };


    public cWorkout(String strName, String strDescription) {
        this.strName = strName;
        this.strDescription = strDescription;
    }

    public String getStrName() {
        return strName;
    }

    public String getStrDescription() {
        return strDescription;
    }

    @Override
    public String toString() {
        return this.strName;
    }
}
