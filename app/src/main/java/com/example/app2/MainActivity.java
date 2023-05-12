package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  Button btn = (Button)findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent in;

                in = new Intent(MainActivity.this, second_Activity.class);
                in.putExtra("r","Welcome Rubab");
                startActivity(in);


            }
        });

       */

       /* Button bt10 = (Button)findViewById(R.id.button10);
        bt10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {;

                Intent intent = new Intent();
                intent.setComponent(new ComponentName(packageName, activityName));
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"HELLO");
                intent.setType("text/plain");
                startActivity(intent);


            }

        });

        */


        Button btn= (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/");
                Intent int1;

                int1 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(int1);
               // Toast.makeText(context, "Going to Github", Toast.LENGTH_SHORT).show();


            }
        });



}



}