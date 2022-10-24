package com.example.gymapplicationanasergiu;

import android.util.Log;

import java.util.ArrayList;

public class Utils {
    private static final String TAG = "Utils";

    private static ArrayList<GymTraining> allTrainings;

    public Utils() {
    }

    public static void initializedAll(){
        Log.d(TAG, "initializedAll: called");

        if (null == allTrainings){
            allTrainings = new ArrayList<>();

        }

        GymTraining squat = new GymTraining();
        squat.setName("Squat");
        squat.setShortDesc("short Description for squat");
        squat.setLongDesk(" ");
        squat.setImageURL("");
        allTrainings.add(squat);

        GymTraining pushUp = new GymTraining();
        pushUp.setName("Push Up");
        pushUp.setShortDesc("short Description for push up");
        pushUp.setLongDesk(" ");
        pushUp.setImageURL("");
        allTrainings.add(pushUp);

        GymTraining chestFly = new GymTraining();
        chestFly.setName("Chest Fly");
        chestFly.setShortDesc("short Description for chest fly");
        chestFly.setLongDesk(" ");
        chestFly.setImageURL("");
        allTrainings.add(chestFly);

        GymTraining legPress = new GymTraining();
        legPress.setName("Leg Press");
        legPress.setShortDesc("short Description for leg press");
        legPress.setLongDesk(" ");
        legPress.setImageURL("");
        allTrainings.add(legPress);
    }
}

