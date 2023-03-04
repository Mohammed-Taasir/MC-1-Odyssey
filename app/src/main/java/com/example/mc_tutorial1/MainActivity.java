package com.example.mc_tutorial1;


import androidx.appcompat.app.AppCompatActivity;
import static android.content.ContentValues.TAG;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText name, role;
    Button nextbtn;
    boolean prevStop, prevPause, prevRestart, prevCreate, prevStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editName);
        role = findViewById(R.id.editRole);
        nextbtn = findViewById(R.id.next);

//        Toast.makeText(MainActivity.this, "onCreate state <MainActivity>", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "onCreate state <MainActivity>");

        if (prevStop) {
            Log.i("taginfo", "State of <MainActivity>: changed from onStop() to onCreate()");
            Toast.makeText(MainActivity.this, "State of <MainActivity>: changed from onStop() to onCreate()", Toast.LENGTH_SHORT).show();
            prevStop = false;
        } else if (prevPause){
            Log.i("taginfo", "State of <MainActivity>: changed from onPause() to onCreate()");
            Toast.makeText(MainActivity.this, "State of <MainActivity>: changed from onPause() to onCreate()", Toast.LENGTH_SHORT).show();
            prevPause = false;

        } else {
            Log.i("taginfo", "State of <MainActivity>: Launched and started with onCreate()");
            Toast.makeText(MainActivity.this, "State of <MainActivity>: Launched and started with onCreate()", Toast.LENGTH_SHORT).show();

        }
        prevCreate = true;



        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = String.valueOf(name.getText());
                String r = String.valueOf(role.getText());
                n = n.toLowerCase();
                r = r.toLowerCase();
                r = r.trim();
                Log.d(TAG, r);

                if((r.equalsIgnoreCase("active participant") || r.equalsIgnoreCase("audience")) && (n.length() > 0)){
                    Intent i = new Intent(MainActivity.this, activity2.class);
                    i.putExtra("name", n);
                    i.putExtra("role", r);
                    startActivity(i);
                }else{
                    if(n.length() == 0){
                        Toast.makeText(MainActivity.this, "Name field cannot be empty", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Please enter your role correctly (audience / active participant)", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        if (prevCreate) {
            Log.i("taginfo", "State of <MainActivity>: changed from onCreate() to onStart()");
            Toast.makeText(this, "State of <MainActivity>: changed from onCreate() to onStart()", Toast.LENGTH_SHORT).show();
            prevCreate = false;
        } else if (prevRestart){
            Log.i("taginfo", "State of <MainActivity>: changed from onRestart() to onStart()");
            Toast.makeText(this, "State of <MainActivity>: changed from onRestart() to onStart()", Toast.LENGTH_SHORT).show();
            prevRestart = false;
        }
        prevStart = true;
    }
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(MainActivity.this, "State of activity <MainActivity> changed from onCreate() OR onRestart() to onStart()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <MainActivity> changed from onCreate() OR onRestart() to onStart()");
////        Log.i(TAG, "onStart state <MainActivity>");
//    }

    @Override
    public void onRestart() {
        super.onRestart();

        Log.i("taginfo", "State of <MainActivity>: changed from onStop() to onRestart()");
        Toast.makeText(this, "State of <MainActivity>: changed from onStop() to onRestart()", Toast.LENGTH_SHORT).show();
        prevRestart = true;
        prevStop = false;
    }
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(MainActivity.this, "State of activity <MainActivity> changed from onStop() to onRestart()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <MainActivity> changed from onStop() to onRestart()");
////        Log.i(TAG, "onRestart state <MainActivity>");
//    }

    @Override
    public void onResume() {
        super.onResume();

        if (prevStart) {
            Log.i("taginfo", "State of <MainActivity>: changed from onStart() to onResume()");
            Toast.makeText(this, "State of <MainActivity>: changed from onStart() to onResume()", Toast.LENGTH_SHORT).show();
            prevStart = false;
        } else if (prevPause){
            Log.i("taginfo", "State of <MainActivity>: changed from onPause() to onResume()");
            Toast.makeText(this, "State of <MainActivity>: changed from onPause() to onResume()", Toast.LENGTH_SHORT).show();
            prevPause = false;
        }
    }
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(MainActivity.this, "State of activity <MainActivity> changed from onStart() OR onPause() to onResume()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <MainActivity> changed from onStart() OR onPause() to onResume()");
////        Log.i(TAG, "onResume state <MainActivity>");
//    }

    @Override
    public void onPause() {
        super.onPause();

        Log.i("taginfo", "State of <MainActivity>: changed from Activity Running to onPause()");
        Toast.makeText(this, "State of <MainActivity>: changed from Activity Running to onPause()", Toast.LENGTH_SHORT).show();
        prevPause = true;
    }
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(MainActivity.this, "State of activity <MainActivity> changed from onResume() to onPause()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <MainActivity> changed from onResume() to onPause()");
////        Log.i(TAG, "onPause state <MainActivity>");
//    }

    @Override
    public void onStop() {
        super.onStop();

        Log.i("taginfo", "State of <MainActivity>: changed from onPause() to onStop()");
        Toast.makeText(this, "State of <MainActivity>: changed from onPause() to onStop()", Toast.LENGTH_SHORT).show();
        prevStop = true;
    }
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(MainActivity.this, "State of activity <MainActivity> changed from onPause() to onStop()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <MainActivity> changed from onPause() to onStop()");
////        Log.i(TAG, "onStop state <MainActivity>");
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.i("taginfo", "State of <MainActivity>: changed from onStop() to onDestroy()");
        Toast.makeText(this, "State of <MainActivity>: changed from onStop() to onDestroy()", Toast.LENGTH_SHORT).show();
        prevStop = false;
    }
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(MainActivity.this, "State of activity <MainActivity> changed from onStop() to onDestroy()", Toast.LENGTH_LONG).show();
//        Log.i(TAG, "State of activity <MainActivity> changed from onStop() to onDestroy()");
////        Log.i(TAG, "onDestroy state <MainActivity>");
//    }
}