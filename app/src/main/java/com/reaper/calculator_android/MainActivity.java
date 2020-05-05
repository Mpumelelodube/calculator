package com.reaper.calculator_android;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button one,two,three,four,five,six,seven,eight,nine,zero,plus,subtraction,devide,multiplication,equals,comma;
    private TextView textView;
    private TextView textView2;
    String numbers = "";
    String answer = "";
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        plus = findViewById(R.id.plus);
        subtraction = findViewById(R.id.subtract);
        devide = findViewById(R.id.devide);
        multiplication = findViewById(R.id.multiply);
        comma = findViewById(R.id.comma);
        equals = findViewById(R.id.equals);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"1";
                    textView2.append("1");
                }

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"2";
                    textView2.append("2");
                }

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){

                }
                if (numbers.length()<10){
                    numbers = numbers+"3";
                    textView2.append("3");
                }

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"4";
                    textView2.append("4");
                }

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"5";
                    textView2.append("5");
                }

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"6";
                    textView2.append("6");
                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"7";
                    textView2.append("7");
                }

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"8";
                    textView2.append("8");
                }

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"9";
                    textView2.append("9");
                }

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+"0";
                    textView2.append("0");
                }

            }
        });
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers.length()<10){
                    numbers = numbers+".";
                    textView2.append(".");
                }

            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator.equals("+")){
                    textView.setText(String.valueOf(Double.parseDouble(answer)+Double.parseDouble(numbers)));
                }
                else if (operator.equals("-")){
                    textView.setText(String.valueOf(Double.parseDouble(answer)-Double.parseDouble(numbers)));
                }
                else if (operator.equals("/")){
                    textView.setText(String.valueOf(Double.parseDouble(answer)/Double.parseDouble(numbers)));
                }
                else if (operator.equals("x")){
                    textView.setText(String.valueOf(Double.parseDouble(answer)*Double.parseDouble(numbers)));
                }

                textView2.setText("");
                answer = "";
                numbers = "";
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtraction();
            }
        });
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                devide();
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplication();
            }
        });


    }

    private void multiplication() {
        if (!numbers.equals("")){
            if (numbers.length()<10){
                textView2.append("x");
                if (answer.equals("")){
                    answer = numbers;
                }else {
                    answer = String.valueOf(Double.parseDouble(answer)*Double.parseDouble(numbers));
                }
                numbers = "";
                operator = "x";
            }
        }
    }

    private void devide() {
        if (!numbers.equals("")){
            if (numbers.length()<10){
                textView2.append("/");
                if (answer.equals("")){
                    answer = numbers;
                }else {
                    answer = String.valueOf(Double.parseDouble(answer)/Double.parseDouble(numbers));
                }
                numbers = "";
                operator = "/";
            }
        }
    }

    private void subtraction() {
        if (!numbers.equals("")){
            if (numbers.length()<10){
                textView2.append("-");
                if (answer.equals("")){
                    answer = numbers;
                }else {
                    answer = String.valueOf(Double.parseDouble(answer)-Double.parseDouble(numbers));
                }
                numbers = "";
                operator = "-";
            }
        }
    }

    private void equals() {
        textView.setText(answer);
    }

    public void add(){
        if (!numbers.equals("")){
            if (numbers.length()<10){
                textView2.append("+");
                if (answer.equals("")){
                    answer = numbers;
                }else {
                    answer = String.valueOf(Double.parseDouble(answer)+Double.parseDouble(numbers));
                }
                numbers = "";
                operator = "+";
            }
        }
    }


}
