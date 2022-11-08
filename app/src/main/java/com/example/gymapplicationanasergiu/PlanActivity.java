package com.example.gymapplicationanasergiu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PlanActivity extends AppCompatActivity {
    private static final String TAG = "PlanActivity";

    private RecyclerView mondayRecView, tuesdayRecView, wednesdayRecView, thursdayRecView, fridayRecView, saturdayRecView, sundayRecView;
    private RelativeLayout notAddedAPlanRelLayout;
    private Button btnAddAPlan;
    private NestedScrollView nestedScrollView;
    private TextView mondayEdit, tuesdayEdit, wednesdayEdit, thursdayEdit, fridayEdit, saturdayEdit, sundayEdit;

    private PlanRecViewAdapter mondayAdapter, tuesdayAdapter, wednesdayAdapter, thursdayAdapter, fridayAdapter, saturdayAdapter, sundayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        initViews();
        initAdapters();
        initRecViews();

        if (Utils.getUsersPlans().size()>0)
        {
            notAddedAPlanRelLayout.setVisibility(View.GONE);
            nestedScrollView.setVisibility(View.VISIBLE);
        }else{
            notAddedAPlanRelLayout.setVisibility(View.VISIBLE);
            nestedScrollView.setVisibility(View.GONE);
        }

    }

    private void initRecViews() {
        Log.d(TAG, "initRecViews: started");

        mondayRecView.setAdapter(mondayAdapter);
        mondayRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        tuesdayRecView.setAdapter(tuesdayAdapter);
        tuesdayRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        wednesdayRecView.setAdapter(wednesdayAdapter);
        wednesdayRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        thursdayRecView.setAdapter(thursdayAdapter);
        thursdayRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        fridayRecView.setAdapter(fridayAdapter);
        fridayRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        saturdayRecView.setAdapter(saturdayAdapter);
        saturdayRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        sundayRecView.setAdapter(sundayAdapter);
        sundayRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void initAdapters() {
        Log.d(TAG, "initAdapters: strated");
        mondayAdapter = new PlanRecViewAdapter(this);
        tuesdayAdapter = new PlanRecViewAdapter(this);
        wednesdayAdapter = new PlanRecViewAdapter(this);
        thursdayAdapter = new PlanRecViewAdapter(this);
        fridayAdapter = new PlanRecViewAdapter(this);
        saturdayAdapter = new PlanRecViewAdapter(this);
        sundayAdapter = new PlanRecViewAdapter(this);

    }

    private void initViews() {
        Log.d(TAG, "initViews: started");

        mondayRecView = (RecyclerView) findViewById(R.id.mondayRecView);
        tuesdayRecView = (RecyclerView) findViewById(R.id.tuesdayRecView);
        wednesdayRecView = (RecyclerView) findViewById(R.id.wednesdayRecView);
        thursdayRecView = (RecyclerView) findViewById(R.id.thursdayRecView);
        fridayRecView = (RecyclerView) findViewById(R.id.fridayRecView);
        saturdayRecView = (RecyclerView) findViewById(R.id.saturdayRecView);
        sundayRecView = (RecyclerView) findViewById(R.id.sundayRecView);

        notAddedAPlanRelLayout = (RelativeLayout) findViewById(R.id.notAddedAPlanRelLayout);
        btnAddAPlan = (Button) findViewById(R.id.btnAddToPlan);
        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);

        mondayEdit = (TextView) findViewById(R.id.editMondayPlan);
        tuesdayEdit = (TextView) findViewById(R.id.editTuesdayPlan);
        wednesdayEdit = (TextView) findViewById(R.id.editWednesdayPlan);
        thursdayEdit = (TextView) findViewById(R.id.editThursdayPlan);
        fridayEdit = (TextView) findViewById(R.id.editFridayPlan);
        saturdayEdit = (TextView) findViewById(R.id.editSaturdayPlan);
        sundayEdit = (TextView) findViewById(R.id.editSundayPlan);




    }
}