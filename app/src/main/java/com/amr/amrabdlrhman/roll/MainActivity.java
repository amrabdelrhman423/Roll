package com.amr.amrabdlrhman.roll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int   [] image = new int[6];
    private ImageView im1;
    private ImageView im2;
    private TextView score ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score =findViewById(R.id.textView3);

        image[0]= R.drawable.ic_d1;
        image[1]= R.drawable.ic_d2;
        image[2]= R.drawable.ic_d3;
        image[3]= R.drawable.ic_d4;
        image[4]= R.drawable.ic_d5;
        image[5]= R.drawable.ic_d6;
        im1=findViewById(R.id.imageView1);
        im2=findViewById(R.id.imageView6);

    }

    public void Roll(View v){
        Random  r = new Random();
        int randomNum1 = r.nextInt(6);
        im1.setImageResource(image[randomNum1]);
        int randomNum2 = r.nextInt(6);
        im2.setImageResource(image[randomNum2]);
        int sum=randomNum1+1+randomNum2+1;
        score.setText("score is : "+sum);
    }


}
