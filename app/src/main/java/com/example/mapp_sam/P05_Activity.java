package com.example.mapp_sam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.*;

public class P05_Activity extends AppCompatActivity {
    String msg = "P05_Activity Sam";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p05_);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }


    public	void	launchSecondActivity(View view)	{
        Log.d("MainActivity",	"Button clicked!");
    }

}
