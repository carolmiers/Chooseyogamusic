package com.example.android.chooseyogamusic;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to use the activity_main_xml layout file
        setContentView(R.layout.activity_main);

        //Make a new object of TextView type called mKriyas which takes in the view with the Kriyas id
     TextView medit = (TextView) findViewById(R.id.Meditation);
        // run the method setOnClickListener on mkriyas taking the abstract class object implemented with OnClickListener
          medit.setOnClickListener(new View.OnClickListener()
          {
              // The code in this method will be executed when the numbers category is clicked on.
              @Override
              public void onClick(View view) {
                  // Create a new intent to open the {@link NumbersActivity}
                  Intent meditIntent = new Intent(MainActivity.this, MeditationActivity.class);

                  // Start the new activity
                  startActivity(meditIntent);
                  //create a toast
                  Toast.makeText(view.getContext(),"Open the list of Meditations", Toast.LENGTH_SHORT).show();
              }
          });

        //Make a new object of TextView type called pranayama which takes in the view with the Pranayama id
        TextView pranayama = (TextView) findViewById(R.id.Pranayama);
        // run the method setOnClickListener on mkriyas taking the abstract class object implemented with OnClickListener
        pranayama.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent pranayamaIntent = new Intent(MainActivity.this, PranayamaActivity.class);

                // Start the new activity
                startActivity(pranayamaIntent);
                //create a toast
                Toast.makeText(view.getContext(),"Open the list of Pranayamas", Toast.LENGTH_SHORT).show();
            }
        });
      //Make a new object of TextView type called mKriyas which takes in the view with the Kriyas id
        TextView kriya = (TextView) findViewById(R.id.Kriyas);
        // run the method setOnClickListener on mkriyas taking the abstract class object implemented with OnClickListener
        kriya.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent kriyaIntent = new Intent(MainActivity.this, KriyaActivity.class);

                // Start the new activity
                startActivity(kriyaIntent);
                //create a toast
                Toast.makeText(view.getContext(),"Open the list of Kriyas", Toast.LENGTH_SHORT).show();
            }
        });

        //Make a new object of TextView type called Relax which takes in the view with the Relaxation id
        TextView relax = (TextView) findViewById(R.id.Relaxation);
        // run the method setOnClickListener on mkriyas taking the abstract class object implemented with OnClickListener
        relax.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent relaxIntent = new Intent(MainActivity.this, RelaxationActivity.class);

                // Start the new activity
                startActivity(relaxIntent);
                //create a toast
                Toast.makeText(view.getContext(),"Open the list of Relaxations", Toast.LENGTH_SHORT).show();
            }
        });

        //Make a new object of TextView type called Add which takes in the view with the Add id
        TextView addto = (TextView) findViewById(R.id.Add);
        // run the method setOnClickListener on mkriyas taking the abstract class object implemented with OnClickListener
        addto.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent addtoIntent = new Intent(MainActivity.this, AddActivity.class);

                // Start the new activity
                startActivity(addtoIntent);
                //create a toast
                Toast.makeText(view.getContext(),"Woud you like to buy a yoga music track", Toast.LENGTH_SHORT).show();
            }
        });

    }
}