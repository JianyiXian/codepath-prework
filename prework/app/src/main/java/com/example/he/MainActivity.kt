package com.example.he

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// This Kotlin file is where we'r going to be hadling useer interaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //show this layout file:  activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from {name}'
        //user can tap a button to change the text color of the label
        //1.Add a button to our layout

        //get a reference to button
        //2. set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {

            //handle button tap

           Log.i("Jianyi", "Tapped on button")
            // get a reference to the text view
            // set the color of the text
           findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

    }
}