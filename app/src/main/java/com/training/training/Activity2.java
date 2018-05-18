package com.training.training;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

import static android.graphics.Color.YELLOW;
import static com.training.training.R.color.colorAccent;

public class Activity2 extends AppCompatActivity {
TextView textView1;
Button button2, button3, button4, button5;
int t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        textView1= findViewById(R.id.textView1);
        generate();
        definebuttons();
        }
    public void generate(){
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
        t= number;
        TextView mytext = findViewById(R.id.textView1);
        mytext.setText(String.valueOf(number));
    }
    public void definebuttons(){
        findViewById(R.id.button2).setOnClickListener(buttonClickListener);
        findViewById(R.id.button3).setOnClickListener(buttonClickListener);
        findViewById(R.id.button4).setOnClickListener(buttonClickListener);
        findViewById(R.id.button5).setOnClickListener(buttonClickListener);
        findViewById(R.id.button6).setOnClickListener(buttonClickListener);
    }
    public void setbackground1(){

        View view;
        view= getWindow().getDecorView();
        view.setBackgroundColor(Color.YELLOW);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Price Paid!!");
    }
    public void setbackground2(){

        View view1;
        view1= getWindow().getDecorView();
        view1.setBackgroundColor(Color.YELLOW);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("     OOPS!!\n Click RESET\n    to Reset");
    }
    public void setbackground3(){
        View view2;
        view2= getWindow().getDecorView();
        view2.setBackgroundColor(Color.WHITE);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("       ");
    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {//
            TextView textView2 = findViewById(R.id.textView2);
            int intvariable;
            intvariable = Integer.parseInt(textView2.getText().toString());//to set value of textview into intvariable

                //multiple buttons
            if(intvariable<t){
                switch (v.getId()) {
                    case R.id.button2:
                        intvariable = intvariable + 1;
                        textView2.setText(String.valueOf(intvariable));
                        if (intvariable == t)
                            setbackground1();

                        if (intvariable > t)
                            setbackground2();
                        break;
                    case R.id.button3:
                        intvariable = intvariable + 2;
                        textView2.setText(String.valueOf(intvariable));
                        if (intvariable == t)
                            setbackground1();
                        if (intvariable > t)
                            setbackground2();
                        break;
                    case R.id.button4:
                        intvariable = intvariable + 5;
                        textView2.setText(String.valueOf(intvariable));
                        if (intvariable == t)
                            setbackground1();
                        if (intvariable > t)
                            setbackground2();
                        break;
                    case R.id.button5:
                        intvariable = intvariable + 10;
                        textView2.setText(String.valueOf(intvariable));
                        if (intvariable == t)
                            setbackground1();
                        if (intvariable > t)
                            setbackground2();
                        break;
                }

                }
                switch (v.getId()) {
                    case R.id.button6:
                        intvariable = 0;
                        textView2.setText(String.valueOf(intvariable));
                        setbackground3();
                        break;
                }

            }


        };
    }



