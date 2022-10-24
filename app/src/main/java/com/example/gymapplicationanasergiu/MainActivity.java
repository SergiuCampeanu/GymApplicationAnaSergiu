package com.example.gymapplicationanasergiu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button seeYourPlanBTN, seeAllActivitiesBTN, aboutUsBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        Log.d(TAG,"initViews: started");
        seeYourPlanBTN = (Button) findViewById(R.id.seeYourPlanBTN);
        seeAllActivitiesBTN = (Button) findViewById(R.id.seeAllActivitiesBTN);
        aboutUsBTN = (Button) findViewById(R.id.aboutUsBTN);
    }
}