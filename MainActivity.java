package com.example.anthony.anthonyroncacandidate; //Hi CodePath!

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attaches button "changeText" to change color
        findViewById(R.id.changeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Message correlated to listener
                Log.i("Anthony", "Button Clicked");
                //sets color to specified color "colorAccent" in colors.xml
                ((TextView) findViewById(R.id.Hello)).setTextColor(
                        getResources().getColor(R.color.colorAccent));
            }
        }); // end changeTextColor

        // Attaches changeView button to Listener
        findViewById(R.id.changeView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When Listener is activated the color is changed
                findViewById(R.id.rootView).setBackgroundColor
                        //Color forstGreen specified in colors.xml
                        (getResources().getColor(R.color.forestGreen));
                }


            }); // end changeView

        findViewById(R.id.androidButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Changes text to Android is Awesome to fulfill user story # 2
                ((TextView) findViewById(R.id.Hello)).setText("Android is AWESOME");
            }
        }); // end AwesomeButton


        findViewById(R.id.replaceText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // retrieve user's input
                String newText = ((EditText)findViewById(R.id.editText)).getText().
                        toString();
                // if statement to  allow a default String
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.Hello)).setText("Hello from Anthony :-)");
                    //Catch statement to validate user entry
                } else {
                    ((TextView) findViewById(R.id.Hello)).setText(newText);
                }
            }
        }); // end changeText

        // Attaches onClickListener to the background
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // resets the text color
                ((TextView) findViewById(R.id.Hello)).setTextColor(
                        getResources().getColor(R.color.black));

                // resets background color
                findViewById(R.id.rootView).setBackgroundColor
                        (getResources().getColor(R.color.colorPrimaryDark));

                // resets text back to "Hello from Anthony :-) "
                ((TextView) findViewById(R.id.Hello)).setText("Hello From Anthony! :-)");
            }
        }); //end reset block

    } // end onCreate=
    
} // end main

