/*package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button b1 = (Button)findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
               public void onClick(View view){

                   Intent in = getIntent();
                   String data = in.getStringExtra("r");
                   b1.setText(data);

               }

        });


    }
}

 */

