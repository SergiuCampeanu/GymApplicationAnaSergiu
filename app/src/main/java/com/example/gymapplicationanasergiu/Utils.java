package com.example.gymapplicationanasergiu;

import android.util.Log;

import java.util.ArrayList;

public class Utils {
    private static final String TAG = "Utils";

    private static ArrayList<GymTraining> allTrainings;
    private static ArrayList<Plan> usersPlans;


    public Utils() {
    }

    public static void initializedAll(){
        Log.d(TAG, "initializedAll: called");

        if (null == allTrainings){
            allTrainings = new ArrayList<>();

        }

        if (null == usersPlans){
            usersPlans = new ArrayList<>();
        }

        GymTraining squat = new GymTraining();
        squat.setName("Squat");
        squat.setShortDesc("short Description for squat");
        squat.setLongDesk("A squat is a strength exercise in which the trainee lowers their hips from " +
                "a standing position and then stands back up. During the descent of a squat, the hip " +
                "and knee joints flex while the ankle joint dorsiflexes; ");
        squat.setImageURL("");
        allTrainings.add(squat);

        GymTraining pushUp = new GymTraining();
        pushUp.setName("Push Up");
        pushUp.setShortDesc("short Description for push up");
        pushUp.setLongDesk("Push-up is a conditioning exercise performed in a prone position by raising " +
                "and lowering the body with the straightening and bending of the arms while keeping the back " +
                "straight and supporting the body on the hands and toes ");
        pushUp.setImageURL("https://s36370.pcdn.co/wp-content/uploads/2012/03/How-to-Do-More-Push-Ups.jpg");
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

        GymTraining crunch = new GymTraining();
        crunch.setName("Crunch");
        crunch.setShortDesc("short Description for Crunch");
        crunch.setLongDesk("The crunch is an abdominal exercise that works the rectus abdominis muscle." +
                "It enables both building \"six-pack\" abs and tightening the belly. Crunches use the exerciser's" +
                " own body weight to tone muscle");
        crunch.setImageURL("");
        allTrainings.add(crunch);

        GymTraining plank  = new GymTraining();
        plank.setName("Plank");
        plank.setShortDesc("short Description for plank");
        plank.setLongDesk("Plank also called a front hold, hover, or abdominal bridge) is an isometric core strength " +
                "exercise that involves maintaining a position similar to a push-up for the maximum possible time; " +
                "it strengthens the abdominals, back and shoulders. ");
        plank.setImageURL("");
        allTrainings.add(plank);

        GymTraining lunge = new GymTraining();
        lunge.setName("Lunge");
        lunge.setShortDesc("short Description for lunge");
        lunge.setLongDesk("A lunge can refer to any position of the human body where one leg is positioned forward " +
                "with knee bent and foot flat on the ground while the other leg is positioned behind. ");
        lunge.setImageURL("");
        allTrainings.add(lunge);
    }

    public static ArrayList<GymTraining> getAllTrainings() {
        return allTrainings;
    }

    public static void setAllTrainings(ArrayList<GymTraining> allTrainings) {
        Utils.allTrainings = allTrainings;
    }

    public static ArrayList<Plan> getUsersPlans() {
        return usersPlans;
    }

    public static void setUsersPlans(ArrayList<Plan> usersPlans) {
        Utils.usersPlans = usersPlans;
    }

    public static boolean addToUsersPlan (Plan plan){
        Log.d(TAG, "addToUSersPlan: started");
        return usersPlans.add(plan);
    }

    public static boolean removeUsersPlan (Plan plan){
        Log.d(TAG, "addToUSersPlan: started");
        return usersPlans.remove(plan);
    }
}

