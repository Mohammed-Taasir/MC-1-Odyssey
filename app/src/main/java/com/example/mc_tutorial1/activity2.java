package com.example.mc_tutorial1;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class activity2 extends AppCompatActivity {

    CheckBox musicC, danceC, playC, fashionC, foodC;
    RatingBar musicR, danceR, playR, fashionR, foodR;
    Button submit, clear;

    boolean prevStop, prevPause, prevRestart, prevCreate, prevStart;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

//        Toast.makeText(activity2.this, "onCreate state <Activity2>", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "onCreate state <Activity2>");
        if (prevStop) {
            Log.i("taginfo", "State of <Activity2>: changed from onStop() to onCreate()");
            Toast.makeText(this, "State of <Activity2>: changed from onStop() to onCreate()", Toast.LENGTH_SHORT).show();
            prevStop = false;
        } else if (prevPause){
            Log.i("taginfo", "State of <Activity2>: changed from onPause() to onCreate()");
            Toast.makeText(this, "State of <Activity2>: changed from onPause() to onCreate()", Toast.LENGTH_SHORT).show();
            prevPause = false;

        }else {
            Log.i("taginfo", "State of <Activity2>: Launched and started with onCreate()");
            Toast.makeText(this, "State of <Activity2>: Launched and started with onCreate()", Toast.LENGTH_SHORT).show();

        }
        prevCreate = true;

        musicC = findViewById(R.id.music);
        danceC = findViewById(R.id.dance);
        playC = findViewById(R.id.play);
        fashionC = findViewById(R.id.fashion);
        foodC = findViewById(R.id.food);

        musicR = findViewById(R.id.ratingBarMusic);
        danceR = findViewById(R.id.ratingBarDance);
        playR = findViewById(R.id.ratingBarPlay);
        fashionR = findViewById(R.id.ratingBarFashion);
        foodR = findViewById(R.id.ratingBarFood);

        submit = findViewById(R.id.submit);
        clear = findViewById(R.id.clear);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String role = intent.getStringExtra("role");

        musicR.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(!musicC.isChecked()){
                    musicR.setRating(0);
                }
            }
        });
        danceR.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(!danceC.isChecked()){
                    danceR.setRating(0);
                }
            }
        });
        playR.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(!playC.isChecked()){
                    playR.setRating(0);
                }
            }
        });
        fashionR.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(!fashionC.isChecked()){
                    fashionR.setRating(0);
                }
            }
        });
        foodR.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(!foodC.isChecked()){
                    foodR.setRating(0);
                }
            }
        });



        musicC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!musicC.isChecked()){
                    musicR.setRating(0);
                }
            }
        });
        danceC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!danceC.isChecked()){
                    danceR.setRating(0);
                }
            }
        });
        playC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!playC.isChecked()){
                    playR.setRating(0);
                }
            }
        });
        fashionC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!fashionC.isChecked()){
                    fashionR.setRating(0);
                }
            }
        });
        foodC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!foodC.isChecked()){
                    foodR.setRating(0);
                }
            }
        });




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(activity2.this, activity3.class);
                i.putExtra("name", name);
                i.putExtra("role", role);

                if(musicC.isChecked()){
                    String r1 = String.valueOf(musicR.getRating());
//                    float r1 = musicR.getRating();
                    if(r1.equalsIgnoreCase("0.0")){
                        String foo = null;
                        i.putExtra("r1", foo);
                    }else{
                        i.putExtra("r1", r1);
                    }
//                    i.putExtra("r1", r1);
                }
                if(danceC.isChecked()){
                    String r2 = String.valueOf(danceR.getRating());
//                    float r2 = danceR.getRating();
                    if(r2.equalsIgnoreCase("0.0")){
                        String foo = null;
                        i.putExtra("r2", foo);
                    }else{
                        i.putExtra("r2", r2);
                    }
//                    i.putExtra("r2", r2);
                }
                if(playC.isChecked()){
                    String r3 = String.valueOf(playR.getRating());
//                    float r3 = playR.getRating();
                    if(r3.equalsIgnoreCase("0.0")){
                        String foo = null;
                        i.putExtra("r3", foo);
                    }else{
                        i.putExtra("r3", r3);
                    }
//                    i.putExtra("r3", r3);
                }
                if(fashionC.isChecked()){
                    String r4 = String.valueOf(fashionR.getRating());
//                    float r4 = fashionR.getRating();
                    if(r4.equalsIgnoreCase("0.0")){
                        String foo = null;
                        i.putExtra("r4", foo);
                    }else{
                        i.putExtra("r4", r4);
                    }
//                    i.putExtra("r4", r4);
                }
                if(foodC.isChecked()){
                    String r5 = String.valueOf(foodR.getRating());
//                    float r5 = foodR.getRating();
                    if(r5.equalsIgnoreCase("0.0")){
                        String foo = null;
                        i.putExtra("r5", foo);
                    }else{
                        i.putExtra("r5", r5);
                    }
//                    i.putExtra("r5", r5);
                }
                Toast.makeText(activity2.this, "Entry has been recorded !!", Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musicR.setRating(0);
                danceR.setRating(0);
                playR.setRating(0);
                fashionR.setRating(0);
                foodR.setRating(0);

                if(musicC.isChecked()) musicC.toggle();
                if(danceC.isChecked()) danceC.toggle();
                if(playC.isChecked()) playC.toggle();
                if(fashionC.isChecked()) fashionC.toggle();
                if(foodC.isChecked()) foodC.toggle();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        if (prevCreate) {
            Log.i("taginfo", "State of <Activity2>: changed from onCreate() to onStart()");
            Toast.makeText(this, "State of <Activity2>: changed from onCreate() to onStart()", Toast.LENGTH_SHORT).show();
            prevCreate = false;
        } else if (prevRestart){
            Log.i("taginfo", "State of <Activity2>: changed from onRestart() to onStart()");
            Toast.makeText(this, "State of <Activity2>: changed from onRestart() to onStart()", Toast.LENGTH_SHORT).show();
            prevRestart = false;
        }
        prevStart = true;
    }
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(activity2.this, "State of activity <Activity2> changed from onCreate() OR onRestart() to onStart()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity2> changed from onCreate() OR onRestart() to onStart()");
////        Log.i(TAG, "onStart state <MainActivity>");
//    }

    @Override
    public void onRestart() {
        super.onRestart();

        Log.i("taginfo", "State of <Activity2>: changed from onStop() to onRestart()");
        Toast.makeText(this, "State of <Activity2>: changed from onStop() to onRestart()", Toast.LENGTH_SHORT).show();
        prevRestart = true;
        prevStop = false;
    }
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(activity2.this, "State of activity <Activity2> changed from onStop() to onRestart()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity2> changed from onStop() to onRestart()");
////        Log.i(TAG, "onRestart state <MainActivity>");
//    }

    @Override
    public void onResume() {
        super.onResume();

        if (prevStart) {
            Log.i("taginfo", "State of <Activity2>: changed from onStart() to onResume()");
            Toast.makeText(this, "State of <Activity2>: changed from onStart() to onResume()", Toast.LENGTH_SHORT).show();
            prevStart = false;
        } else if (prevPause){
            Log.i("taginfo", "State of <Activity2>: changed from onPause() to onResume()");
            Toast.makeText(this, "State of <Activity2>: changed from onPause() to onResume()", Toast.LENGTH_SHORT).show();
            prevPause = false;
        }
    }
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(activity2.this, "State of activity <Activity2> changed from onStart() OR onPause() to onResume()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity2> changed from onStart() OR onPause() to onResume()");
////        Log.i(TAG, "onResume state <MainActivity>");
//    }

    @Override
    public void onPause() {
        super.onPause();

        Log.i("taginfo", "State of <Activity2>: changed from Activity Running to onPause()");
        Toast.makeText(this, "State of <Activity2>: changed from Activity Running to onPause()", Toast.LENGTH_SHORT).show();
        prevPause = true;
    }
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(activity2.this, "State of activity <Activity2> changed from onResume() to onPause()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity2> changed from onResume() to onPause()");
////        Log.i(TAG, "onPause state <MainActivity>");
//    }

    @Override
    public void onStop() {
        super.onStop();

        Log.i("taginfo", "State of <Activity2>: changed from onPause() to onStop()");
        Toast.makeText(this, "State of <Activity2>: changed from onPause() to onStop()", Toast.LENGTH_SHORT).show();
        prevStop = true;
    }
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(activity2.this, "State of activity <Activity2> changed from onPause() to onStop()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity2> changed from onPause() to onStop()");
////        Log.i(TAG, "onStop state <MainActivity>");
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.i("taginfo", "State of <Activity2>: changed from onStop() to onDestroy()");
        Toast.makeText(this, "State of <Activity2>: changed from onStop() to onDestroy()", Toast.LENGTH_SHORT).show();
        prevStop = false;
    }
//    p rotected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(activity2.this, "State of activity <Activity2> changed from onStop() to onDestroy()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity2> changed from onStop() to onDestroy()");
////        Log.i(TAG, "onDestroy state <MainActivity>");
//    }
}
