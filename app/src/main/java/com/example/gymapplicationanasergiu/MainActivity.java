package com.example.gymapplicationanasergiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button seeYourPlanBTN, seeAllActivitiesBTN, aboutUsBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.initializedAll();

        initViews();
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        Log.d(TAG, "setOnClickListeners: started");
        seeAllActivitiesBTN.setOnClickListener( (v)-> {
                Intent intent = new Intent(MainActivity.this, AllTrainingActivity.class);
                startActivity(intent);
        });

        seeYourPlanBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlanActivity.class);
                startActivity(intent);

            }
        });
    }

    private void initViews() {
        Log.d(TAG,"initViews: started");
        seeYourPlanBTN = (Button) findViewById(R.id.seeYourPlanBTN);
        seeAllActivitiesBTN = (Button) findViewById(R.id.seeAllActivitiesBTN);
        aboutUsBTN = (Button) findViewById(R.id.aboutUsBTN);
    }
}