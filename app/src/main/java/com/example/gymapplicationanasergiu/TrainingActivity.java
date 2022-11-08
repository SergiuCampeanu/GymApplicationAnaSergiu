package com.example.gymapplicationanasergiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class TrainingActivity extends AppCompatActivity {

    private static final String TAG = "TrainingActivity";

    private Button btnAddToPlan;
    private TextView trainingName, trainingLongDesc;
    private ImageView trainingImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        initViews();

        Intent intent = getIntent();
        try {
            GymTraining incomingTraining = intent.getParcelableExtra("training");
            trainingName.setText(incomingTraining.getName());
            trainingLongDesc.setText(incomingTraining.getLongDesk());
            Glide.with(this)
                    .asBitmap()
                    .load(incomingTraining.getImageURL())
                    .into(trainingImage);

            btnAddToPlan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AskForDetailsDialog askForDetailsDialog = new AskForDetailsDialog();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("Training", incomingTraining);
                    askForDetailsDialog.setArguments(bundle);
                    askForDetailsDialog.show(getSupportFragmentManager(), "ask for details");
                }
            });

        }catch (NullPointerException e) {
            e.getMessage();
        }

    }

    private void initViews(){
        Log.d(TAG, "initViews: started");
        btnAddToPlan = (Button) findViewById(R.id.btnAddToPlan);
        trainingName = (TextView) findViewById(R.id.trainingName);
        trainingLongDesc = (TextView) findViewById(R.id.trainingLongDesc);
        trainingImage = (ImageView) findViewById(R.id.trainingImage);

    }
}