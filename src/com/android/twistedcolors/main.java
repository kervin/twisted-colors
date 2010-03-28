package com.android.twistedcolors;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.twistedcolors.sequence;

public class main extends Activity {

    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Capture the red button from layout
        Button buttonRed = (Button)findViewById(R.id.ButtonRed);
        // Register the onClick listener with the implementation above
        buttonRed.setOnClickListener(readInput);
        
       
        
    }
    
    
    // Create an anonymous implementation of OnClickListener
    private OnClickListener readInput = new OnClickListener() {
        public void onClick(View v) {
          // Display a message to the user
        	Context context = getApplicationContext();
        	int duration = Toast.LENGTH_SHORT;
        	
        	Toast toast = Toast.makeText(context, "You clicked Red", duration);
        	toast.show();	
        }
    };
    
    
    private void displaySequence() {
    	
    }

    
}