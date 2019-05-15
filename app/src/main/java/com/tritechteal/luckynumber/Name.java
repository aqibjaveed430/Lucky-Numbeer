package com.tritechteal.luckynumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Name extends AppCompatActivity {
    TextView RandomNumber;
    EditText In;
    Button GenRan;
    Button result;
    ImageView facebook;
    ImageView twitter;
    ImageView instagram;
    Random Number;
    int Rnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        RandomNumber = (TextView)findViewById(R.id.textView1);
        GenRan = (Button)findViewById(R.id.button1);
        facebook = (ImageView) findViewById(R.id.facebook_img_view);
        twitter =(ImageView)findViewById(R.id.twitter_image_View);
        instagram =(ImageView)findViewById(R.id.instagram_image_View);


       /* facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Name.this, Result.class);
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Name.this, MainActivity.class);
                startActivity(intent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Name.this, Result.class);
                startActivity(intent);
            }
        });*/

        GenRan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Number = new Random();
                Rnumber = Number.nextInt(100);
                RandomNumber.setText(Integer.toString(Rnumber));
                GenRan.setVisibility(View.INVISIBLE);
                GenRan.setEnabled(false);

            }
        });
    }
}
