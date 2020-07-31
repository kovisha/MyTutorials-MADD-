package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tvMsg2); //getting the textview to  object
        tv.setText(R.string.Msg2); //assigning a message to the textview through string resource file

        //log

        Log.i( "Lifecycle",   "OnCreate invoked..."); //view log info when app launches


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle" , "onStart() called...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecycle" , "onResume() called...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle" , "onPause() called...");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle" , "onStop() called...");
    }

    @Override
    protected void onDestroy() { //After user login all sessions cleared done here
        super.onDestroy();

        Log.i("Lifecycle" , "onDestroy() called...");
    }
}