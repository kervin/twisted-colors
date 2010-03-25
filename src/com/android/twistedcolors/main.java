package com.android.twistedcolors;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Capture the red button from layout
        ImageButton imageButtonRed = (ImageButton)findViewById(R.id.ImageButtonRed);
        // Register the onClick listener with the implementation above
        imageButtonRed.setOnClickListener(readInput);
        
       
        
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

    
}