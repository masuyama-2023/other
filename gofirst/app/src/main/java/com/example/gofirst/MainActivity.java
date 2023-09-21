package com.example.gofirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            flag = true;
        }
        else if(v.getId() == R.id.button2) {
            flag = false;
        }

        if(flag){
            Random random = new Random();
            int r = random.nextInt(2);
            if (r == 0){
                TextView tv1 = findViewById(R.id.id2);
                String text1 = getString(R.string.text2_2);
                tv1.setText(text1);
            }else {
                TextView tv1 = findViewById(R.id.id2);
                String text2 = getString(R.string.text2_3);
                tv1.setText(text2);
            }

        }
        else{
            TextView tv1 = findViewById(R.id.id2);
            String text3 = getString(R.string.text2_1);
            tv1.setText(text3);
        }
    }
}