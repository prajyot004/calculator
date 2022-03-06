package com.example.scicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Selection;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.*;
import java.lang.String;


public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    TextView ans;
    EditText input;

    int mulcount=0;
    int divcount = 0;
    int plcount = 0;
    int sub = 0;


    int size = 50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans = findViewById(R.id.output);
        input = findViewById(R.id.input);

        Selection.setSelection(input.getText(), input.getText().toString().length());


        b1 = findViewById(R.id.swap);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });

        b2 = findViewById(R.id.dateCon);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        b3 = findViewById(R.id.cancel);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString();

                if(!temp.isEmpty()) {
                    int strlen = temp.length();
                    String ns = temp.substring(0, strlen - 1);
                    input.setText(ns);
                }
                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });

        b4 = findViewById(R.id.clear);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                ans.setText("");
                mulcount=0;
                divcount = 0;
                plcount = 0;
                sub = 0;

            }
        });

        b5 = findViewById(R.id.opbracket);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"(");
                Selection.setSelection(input.getText(), input.getText().toString().length());


            }
        });



        b6 = findViewById(R.id.clbracket);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    String temp = input.getText().toString();

                    int count=0;

                    for(int i=0;i<temp.length();i++){
                        if(temp.charAt(i) == '('){
                            count++;
                        }else if(temp.charAt(i) == ')'){
                            count--;
                        }

                    }

                    if(count>0) {
                        char ch = temp.charAt(temp.length() - 1);
                        if (ch == '+') {
                            input.setText(temp);
                        } else if (ch == '-') {
                            input.setText(temp);
                        } else if (ch == 'X') {
                            input.setText(temp);
                        } else if (ch == '/') {
                            input.setText(temp);
                        } else if (ch == '%') {
                            input.setText(temp);
                        } else if (ch == '.') {
                            input.setText(temp);
                        } else if (ch == '(') {
                            input.setText(temp);
                        } else {
                            input.setText(temp + ")");
                        }
                        count--;

                    }

                Selection.setSelection(input.getText(), input.getText().toString().length());



            }
        });


        b7 = findViewById(R.id.mod);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                char ch = temp.charAt(temp.length()-1);
                if(ch == '+'){
                    input.setText(temp);
                }else if(ch == '-'){
                    input.setText(temp);
                }
                else if(ch == 'X'){
                    input.setText(temp);
                }
                else if(ch == '/'){
                    input.setText(temp);
                }
                else if(ch == '%'){
                    input.setText(temp);
                }
                else if(ch == '.'){
                    input.setText(temp);
                }
                else if(ch == '('){
                    input.setText(temp);
                }


                else{
                    input.setText(temp+"%");
                }

                Selection.setSelection(input.getText(), input.getText().toString().length());



            }
        });


        b8 = findViewById(R.id.divide);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divcount +=1;
                String temp = input.getText().toString();
                char ch = temp.charAt(temp.length()-1);
                if(ch == '+'){
                    input.setText(temp);
                }else if(ch == '-'){
                    input.setText(temp);
                }
                else if(ch == 'X'){
                    input.setText(temp);
                }
                else if(ch == '/'){
                    input.setText(temp);
                }
                else if(ch == '%'){
                    input.setText(temp);
                }
                else if(ch == '.'){
                    input.setText(temp);
                }
                else if(ch == '('){
                    input.setText(temp);
                }
                else{
                    input.setText(temp+"/");
                }

                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });


        b9 = findViewById(R.id.no7);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString();
                input.setText(temp+"7");

                Selection.setSelection(input.getText(), input.getText().toString().length());


            }
        });



        b10 = findViewById(R.id.no8);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"8");

                Selection.setSelection(input.getText(), input.getText().toString().length());
            }
        });


        b11 = findViewById(R.id.no9);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"9");
                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });


        b12 = findViewById(R.id.multiply);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mulcount = mulcount+1;
                String temp = input.getText().toString();
                char ch = temp.charAt(temp.length()-1);
                if(ch == '+'){
                    input.setText(temp);
                }else if(ch == '-'){
                    input.setText(temp);
                }
                else if(ch == 'X'){
                    input.setText(temp);
                }
                else if(ch == '/'){
                    input.setText(temp);
                }
                else if(ch == '%'){
                    input.setText(temp);
                }
                else if(ch == '.'){
                    input.setText(temp);
                }
                else if(ch == '('){
                    input.setText(temp);
                }

                else{
                    input.setText(temp+"X");
                }

                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });


        b13 = findViewById(R.id.no4);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"4");

                Selection.setSelection(input.getText(), input.getText().toString().length());
            }
        });

        b14 = findViewById(R.id.no5);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"5");

                Selection.setSelection(input.getText(), input.getText().toString().length());
            }
        });


        b15 = findViewById(R.id.no6);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"6");

                Selection.setSelection(input.getText(), input.getText().toString().length());
            }
        });

        b16 = findViewById(R.id.subtraction);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub +=1;
                String temp = input.getText().toString();
                char ch = temp.charAt(temp.length()-1);
                if(ch == '+'){
                    input.setText(temp);
                }else if(ch == '-'){
                    input.setText(temp);
                }
                else if(ch == 'X'){
                    input.setText(temp);
                }
                else if(ch == '/'){
                    input.setText(temp);
                }
                else if(ch == '%'){
                    input.setText(temp);
                }
                else if(ch == '.'){
                    input.setText(temp);
                }
                else if(ch == '('){
                    input.setText(temp);
                }
                else{
                    input.setText(temp+"-");
                }

                Selection.setSelection(input.getText(), input.getText().toString().length());
            }
        });


        b17 = findViewById(R.id.no1);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"1");
                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });


        b18 = findViewById(R.id.no2);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"2");
                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });

        b19 = findViewById(R.id.no3);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"3");
                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });


        b20 = findViewById(R.id.addition);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plcount +=1;
                String temp = input.getText().toString();
                char ch = temp.charAt(temp.length()-1);
                if(ch == '+'){
                    input.setText(temp);
                }else if(ch == '-'){
                    input.setText(temp);
                }
                else if(ch == 'X'){
                    input.setText(temp);
                }
                else if(ch == '/'){
                    input.setText(temp);
                }
                else if(ch == '%'){
                    input.setText(temp);
                }
                else if(ch == '.'){
                    input.setText(temp);
                }
                else if(ch == '('){
                    input.setText(temp);
                }


                else{
                    input.setText(temp+"+");
                }

                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });


        b21 = findViewById(R.id.priority);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        b22 = findViewById(R.id.Zero);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+"0");
                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });


        b23 = findViewById(R.id.dot);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = input.getText().toString();
                input.setText(temp+".");
                Selection.setSelection(input.getText(), input.getText().toString().length());

            }
        });

        b24 = findViewById(R.id.equalto);

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString();
                char[] arr = new char[temp.length()];
                for(int i=0;i<arr.length;i++){
                    arr[i] = temp.charAt(i);
                }

                for(int j=0;j<mulcount;j++) {
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i) == 'X'){
                            temp = mul(temp, i);
                            break;
                        }
                    }
                }

                for(int j=0;j<divcount;j++) {
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i) == '/') {
                            temp = div(temp, i);
                            break;
                        }
                    }
                }

                for(int i=0;i<plcount;i++){
                    for(int j=0;j<temp.length();j++){
                        if(temp.charAt(j) == '+'){
                            temp = plus(temp,j);
                            break;
                        }
                    }
                }

                for(int i=0;i<sub;i++){
                    for(int j=0;j<temp.length();j++){
                        if(temp.charAt(j) == '-'){
                            temp = sub(temp,j);
                            break;
                        }
                    }
                }
                ans.setText(temp);

            }

            private String sub(String st, int index) {
                String s1="";
                String s2="";
                for(int i=index+1;i<st.length();i++){
                    if(st.charAt(i) == '+' ||st.charAt(i) == '*' || st.charAt(i) == '-' || st.charAt(i) == '/' || st.charAt(i) == '(' || st.charAt(i) == ')'){

                        break;
                    }
                    else {
                        s2 = s2 + st.charAt(i)+"";
                    }
                }


                for (int i = index-1;i>=0;i--){
                    if(st.charAt(i) == '+' ||st.charAt(i) == '*' || st.charAt(i) == '-' || st.charAt(i) == '/' || st.charAt(i) == '(' || st.charAt(i) == ')'){
                        break;
                    }
                    else {
                        s1 = s1+st.charAt(i);
                    }
                }

                StringBuilder sb = new StringBuilder(s1);
                sb.reverse();
                s1 = sb.toString();


                double n1 = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                double ans = n1-n2;
                String answer = String.valueOf(ans);
                String nstr = st.replace(s1+"-"+s2,answer);


                return nstr;


            }

            private String plus(String st, int index) {
                String s1="";
                String s2="";
                for(int i=index+1;i<st.length();i++){
                    if(st.charAt(i) == '+' ||st.charAt(i) == '*' || st.charAt(i) == '-' || st.charAt(i) == '/' || st.charAt(i) == '(' || st.charAt(i) == ')'){

                        break;
                    }
                    else {
                        s2 = s2 + st.charAt(i)+"";
                    }
                }


                for (int i = index-1;i>=0;i--){
                    if(st.charAt(i) == '+' ||st.charAt(i) == '*' || st.charAt(i) == '-' || st.charAt(i) == '/' || st.charAt(i) == '(' || st.charAt(i) == ')'){
                        break;
                    }
                    else {
                        s1 = s1+st.charAt(i);
                    }
                }

                StringBuilder sb = new StringBuilder(s1);
                sb.reverse();
                s1 = sb.toString();


                double n1 = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                double ans = n1+n2;
                String answer = String.valueOf(ans);
                String nstr = st.replace(s1+"+"+s2,answer);


                return nstr;
            }

            private String div(String st, int index) {
                String s1="";
                String s2="";
                for(int i=index+1;i<st.length();i++){
                    if(st.charAt(i) == '+' ||st.charAt(i) == '*' || st.charAt(i) == '-' || st.charAt(i) == '/' || st.charAt(i) == '(' || st.charAt(i) == ')'){
                        break;
                    }
                    else {
                        s2 = s2 + st.charAt(i)+"";
                    }
                }


                for (int i = index-1;i>=0;i--){
                    if(st.charAt(i) == '+' ||st.charAt(i) == '*' || st.charAt(i) == '-' || st.charAt(i) == '/' || st.charAt(i) == '(' || st.charAt(i) == ')'){
                        break;
                    }
                    else {
                        s1 = s1+st.charAt(i);
                    }
                }

                StringBuilder sb = new StringBuilder(s1);
                sb.reverse();
                s1 = sb.toString();


                double n1 = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                double ans = n1/n2;
                String answer = String.valueOf(ans);
                String nstr = st.replace(s1+"/"+s2,answer);


                return nstr;


            }

            private String mul(String st,int index){
                String s1="";
                String s2="";
                for(int i=index+1;i<st.length();i++){
                    if(st.charAt(i) == '+' || st.charAt(i) == '-' || st.charAt(i) == '/' || st.charAt(i) == '(' || st.charAt(i) == ')' || st.charAt(i) == 'X'){

                        break;
                    }
                    else {
                        s2 = s2 + st.charAt(i)+"";
                    }
                }

                for (int i = index-1;i>=0;i--){
                    if(st.charAt(i) == 'X' || st.charAt(i) == '+' || st.charAt(i) == '-' || st.charAt(i) == '/' || st.charAt(i) == '(' || st.charAt(i) == ')'){
                        break;
                    }
                    else {
                        s1 = s1+st.charAt(i);
                    }
                }


                StringBuilder sb = new StringBuilder(s1);
                sb.reverse();
                s1 = sb.toString();

                double n1 = Double.parseDouble(s1);
                double n2 = Double.parseDouble(s2);
                double ans = n1*n2;
                String answer = String.valueOf(ans);
                String nstr = st.replace(s1+"X"+s2,answer);

                return nstr;
            }
        });



    }




}
