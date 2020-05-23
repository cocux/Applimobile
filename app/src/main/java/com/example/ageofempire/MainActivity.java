package com.example.ageofempire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuMe(View view){
        Intent randomIntent = new Intent(this, MyActivity.class); // Create an Intent to start the second activity

        startActivity(randomIntent); // Start the new activity.
    }

}
