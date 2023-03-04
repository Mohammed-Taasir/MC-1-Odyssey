package com.example.mc_tutorial1;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.TypefaceCompatApi28Impl;

public class activity3 extends AppCompatActivity {
    TextView t1, t2, t3, t4, t5, t6, t7;
    TextView t8, t9, t10, t11, t12, t13, t14;

    boolean prevStop, prevPause, prevRestart, prevCreate, prevStart;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

//        Toast.makeText(activity3.this, "onCreate state <Activity3>", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "onCreate state <Activity3>");
        if (prevStop) {
            Log.i("taginfo", "State of <Activity3>: changed from onStop() to onCreate()");
            Toast.makeText(this, "State of <Activity3>: changed from onStop() to onCreate()", Toast.LENGTH_SHORT).show();
            prevStop = false;
        }else if (prevPause){
            Log.i("taginfo", "State of <Activity3>: changed from onPause() to onCreate()");
            Toast.makeText(this, "State of <Activity3>: changed from onPause() to onCreate()", Toast.LENGTH_SHORT).show();
            prevPause = false;

        } else {
            Log.i("taginfo", "State of <Activity3>: Launched and started with onCreate()");
            Toast.makeText(this, "State of <Activity3>: Launched and started with onCreate()", Toast.LENGTH_SHORT).show();

        }
        prevCreate = true;

        t1 = findViewById(R.id.textView4);
        t2 = findViewById(R.id.textView5);
        t3 = findViewById(R.id.textView12);
        t4 = findViewById(R.id.textView13);
        t5 = findViewById(R.id.textView14);
        t6 = findViewById(R.id.textView19);
        t7 = findViewById(R.id.textView20);

        t8 = findViewById(R.id.textView7);
        t9 = findViewById(R.id.textView8);
        t10 = findViewById(R.id.textView9);
        t11 = findViewById(R.id.textView10);
        t12 = findViewById(R.id.textView11);


        Intent intent = getIntent();
        String tex1 = intent.getStringExtra("name");
        String tex2 = intent.getStringExtra("role");
        String tex3 = intent.getStringExtra("r1");
        String tex4 = intent.getStringExtra("r2");
        String tex5 = intent.getStringExtra("r3");
        String tex6 = intent.getStringExtra("r4");
        String tex7 = intent.getStringExtra("r5");

        t1.setText(tex1);
        t2.setText(tex2);
//        double temp1=Double.parseDouble(tex3);
//        if(temp1>0){
//            t8.setText("Music");
//
//            t3.setText(""+tex3);
//        }
        if(tex3 == null){
            tex3 = "You did'nt attend this event.";
        }else if(tex3.equalsIgnoreCase("1.0")){
            tex3 = "*";
        }else if(tex3.equalsIgnoreCase("2.0")){
            tex3 = "* *";
        }else if(tex3.equalsIgnoreCase("3.0")){
            tex3 = "* * *";
        }else if(tex3.equalsIgnoreCase("4.0")){
            tex3 = "* * * *";
        }else if(tex3.equalsIgnoreCase("5.0")){
            tex3 = "* * * * *";
        }

        if(tex4 == null){
            tex4 = "You did'nt attend this event";
        }else if(tex4.equalsIgnoreCase("1.0")){
            tex4 = "*";
        }else if(tex4.equalsIgnoreCase("2.0")){
            tex4 = "* *";
        }else if(tex4.equalsIgnoreCase("3.0")){
            tex4 = "* * *";
        }else if(tex4.equalsIgnoreCase("4.0")){
            tex4 = "* * * *";
        }else if(tex4.equalsIgnoreCase("5.0")){
            tex4 = "* * * * *";
        }

        if(tex5 == null){
            tex5 = "You did'nt attend this event";
        }else if(tex5.equalsIgnoreCase("1.0")){
            tex5 = "*";
        }else if(tex5.equalsIgnoreCase("2.0")){
            tex5 = "* *";
        }else if(tex5.equalsIgnoreCase("3.0")){
            tex5 = "* * *";
        }else if(tex5.equalsIgnoreCase("4.0")){
            tex5 = "* * * *";
        }else if(tex5.equalsIgnoreCase("5.0")){
            tex5 = "* * * * *";
        }

        if(tex6 == null){
            tex6 = "You did'nt attend this event";
        }else if(tex6.equalsIgnoreCase("1.0")){
            tex6 = "*";
        }else if(tex6.equalsIgnoreCase("2.0")){
            tex6 = "* *";
        }else if(tex6.equalsIgnoreCase("3.0")){
            tex6 = "* * *";
        }else if(tex6.equalsIgnoreCase("4.0")){
            tex6 = "* * * *";
        }else if(tex6.equalsIgnoreCase("5.0")){
            tex6 = "* * * * *";
        }

        if(tex7 == null){
            tex7 = "You did'nt attend this event";
        }else if(tex7.equalsIgnoreCase("1.0")){
            tex7 = "*";
        }else if(tex7.equalsIgnoreCase("2.0")){
            tex7 = "* *";
        }else if(tex7.equalsIgnoreCase("3.0")){
            tex7 = "* * *";
        }else if(tex7.equalsIgnoreCase("4.0")){
            tex7 = "* * * *";
        }else if(tex7.equalsIgnoreCase("5.0")){
            tex7 = "* * * * *";
        }

        if(tex3 != null){
            t8.setText("Music");
            t3.setText(tex3);
        }

        if(tex4 != null){
            t9.setText("Dance");
            t4.setText(tex4);
        }

        if(tex5 != null){
            t10.setText("Play");
            t5.setText(tex5);
        }

        if(tex6 != null){
            t11.setText("Fashion");
            t6.setText(tex6);
        }

        if(tex7 != null){
            t12.setText("Food");
            t7.setText(tex7);
        }

//        t3.setText(tex3);
//        t4.setText(tex4);
//        t5.setText(tex5);
//        t6.setText(tex6);
//        t7.setText(tex7);
    }

    @Override
    public void onStart() {
        super.onStart();

        if (prevCreate) {
            Log.i("taginfo", "State of <Activity3>: changed from onCreate() to onStart()");
            Toast.makeText(this, "State of <Activity3>: changed from onCreate() to onStart()", Toast.LENGTH_SHORT).show();
            prevCreate = false;
        } else if (prevRestart){
            Log.i("taginfo", "State of <Activity3>: changed from onRestart() to onStart()");
            Toast.makeText(this, "State of <Activity3>: changed from onRestart() to onStart()", Toast.LENGTH_SHORT).show();
            prevRestart = false;
        }
        prevStart = true;
    }
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(activity3.this, "State of activity <Activity3> changed from onCreate() OR onRestart() to onStart()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity3> changed from onCreate() OR onRestart() to onStart()");
////        Log.i(TAG, "onStart state <MainActivity>");
//    }

    @Override
    public void onRestart() {
        super.onRestart();

        Log.i("taginfo", "State of <Activity3>: changed from onStop() to onRestart()");
        Toast.makeText(this, "State of <Activity3>: changed from onStop() to onRestart()", Toast.LENGTH_SHORT).show();
        prevRestart = true;
        prevStop = false;
    }
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(activity3.this, "State of activity <Activity3> changed from onStop() to onRestart()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity3> changed from onStop() to onRestart()");
////        Log.i(TAG, "onRestart state <MainActivity>");
//    }

    @Override
    public void onResume() {
        super.onResume();

        if (prevStart) {
            Log.i("taginfo", "State of <Activity3>: changed from onStart() to onResume()");
            Toast.makeText(this, "State of <Activity3>: changed from onStart() to onResume()", Toast.LENGTH_SHORT).show();
            prevStart = false;
        } else if (prevPause){
            Log.i("taginfo", "State of <Activity3>: changed from onPause() to onResume()");
            Toast.makeText(this, "State of <Activity3>: changed from onPause() to onResume()", Toast.LENGTH_SHORT).show();
            prevPause = false;
        }
    }
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(activity3.this, "State of activity <Activity3> changed from onStart() OR onPause() to onResume()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity3> changed from onStart() OR onPause() to onResume()");
////        Log.i(TAG, "onResume state <MainActivity>");
//    }

    @Override
    public void onPause() {
        super.onPause();

        Log.i("taginfo", "State of <Activity3>: changed from Activity Running to onPause()");
        Toast.makeText(this, "State of <Activity3>: changed from Activity Running to onPause()", Toast.LENGTH_SHORT).show();
        prevPause = true;
    }
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(activity3.this, "State of activity <Activity3> changed from onResume() to onPause()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity3> changed from onResume() to onPause()");
////        Log.i(TAG, "onPause state <MainActivity>");
//    }

    @Override
    public void onStop() {
        super.onStop();

        Log.i("taginfo", "State of <Activity3>: changed from onPause() to onStop()");
        Toast.makeText(this, "State of <Activity3>: changed from onPause() to onStop()", Toast.LENGTH_SHORT).show();
        prevStop = true;
    }
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(activity3.this, "State of activity <Activity3> changed from onPause() to onStop()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity3> changed from onPause() to onStop()");
////        Log.i(TAG, "onStop state <MainActivity>");
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.i("taginfo", "State of <Activity3>: changed from onStop() to onDestroy()");
        Toast.makeText(this, "State of <Activity3>: changed from onStop() to onDestroy()", Toast.LENGTH_SHORT).show();
        prevStop = false;
    }
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(activity3.this, "State of activity <Activity3> changed from onStop() to onDestroy()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <Activity3> changed from onStop() to onDestroy()");
////        Log.i(TAG, "onDestroy state <MainActivity>");
//    }
}
