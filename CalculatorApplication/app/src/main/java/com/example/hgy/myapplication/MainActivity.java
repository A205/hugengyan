package com.example.hgy.myapplication;
import android.os.Bundle;
import android.R.bool;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;
import android.view.View.OnClickListener;
public class MainActivity extends Activity {
    public Button button;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_0;
    Button btn_add;
    Button btn_sub;
    Button btn_mul;
    Button btn_div;
    Button btn_eq;
    Button btn_dot;
    Button btn_clear;
    OnClickListener listener0=null;
    OnClickListener listener1=null;
    OnClickListener listener2=null;
    OnClickListener listener3=null;
    OnClickListener listener4=null;
    OnClickListener listener5=null;
    OnClickListener listener6=null;
    OnClickListener listener7=null;
    OnClickListener listener8=null;
    OnClickListener listener9=null;
    OnClickListener listenerEqu=null;
    OnClickListener listenerAdd=null;
    OnClickListener listenerSub=null;
    OnClickListener listenerMul=null;
    OnClickListener listenerDiv=null;;
    OnClickListener listenerPoint=null;
    CharSequence input_text=null;
    EditText displayText;


    double num1=0;
    double num2=0;
    double result=0;
    int CalType=0;
    boolean EquBtnDownFlag=false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(intent);
            }
        });
        setTitle("计算器");
        displayText=(EditText)findViewById(R.id.result);
        displayText.setText(null);

        btn_0=(Button)findViewById(R.id.btn_0);
        btn_1=(Button)findViewById(R.id.btn_1);
        btn_2=(Button)findViewById(R.id.btn_2);
        btn_3=(Button)findViewById(R.id.btn_3);
        btn_4=(Button)findViewById(R.id.btn_4);
        btn_5=(Button)findViewById(R.id.btn_5);
        btn_6=(Button)findViewById(R.id.btn_6);
        btn_7=(Button)findViewById(R.id.btn_7);
        btn_8=(Button)findViewById(R.id.btn_8);
        btn_9=(Button)findViewById(R.id.btn_9);
        btn_add=(Button)findViewById(R.id.btn_add);
        btn_sub=(Button)findViewById(R.id.btn_sub);
        btn_mul=(Button)findViewById(R.id.btn_mul);
        btn_div=(Button)findViewById(R.id.btn_div);
        btn_dot=(Button) findViewById(R.id.btn_dot);
        btn_eq=(Button)findViewById(R.id.btn_eq);
        listener0= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="0";
                displayText.setText(myString);
            }
        };
        listener1= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="1";
                displayText.setText(myString);
            }
        };
        listener2= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="2";
                displayText.setText(myString);
            }
        };
        listener3= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="3";
                displayText.setText(myString);
            }
        };
        listener4= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="4";
                displayText.setText(myString);
            }
        };
        listener5= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="5";
                displayText.setText(myString);
            }
        };
        listener6= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="6";
                displayText.setText(myString);
            }
        };
        listener7= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="7";
                displayText.setText(myString);
            }
        };
        listener8= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="8";
                displayText.setText(myString);
            }
        };
        listener9= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="9";
                displayText.setText(myString);
            }
        };

        listenerPoint= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (EquBtnDownFlag) {
                    displayText.setText(null);
                    EquBtnDownFlag=false;
                }
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+=".";
                displayText.setText(myString);
            }
        };
        listenerAdd= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                CharSequence temp=displayText.getText();
                if (temp.equals(null)) {
                    return;
                }
                String myString=temp.toString();
                num1=Double.parseDouble(myString);
                CalType=1;
                displayText.setText(null);
            }
        };
        listenerSub= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                CharSequence temp=displayText.getText();
                if (temp.equals(null)) {
                    return;
                }
                String myString=temp.toString();
                num1=Double.parseDouble(myString);
                CalType=2;
                displayText.setText(null);
            }
        };
        listenerMul= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                CharSequence temp=displayText.getText();
                if (temp.equals(null)) {
                    return;
                }
                String myString=temp.toString();
                num1=Double.parseDouble(myString);
                CalType=3;
                displayText.setText(null);
            }
        };
        listenerDiv= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                CharSequence temp=displayText.getText();
                if (temp.equals(null)) {
                    return;
                }
                String myString=temp.toString();
                num1=Double.parseDouble(myString);
                CalType=4;
                displayText.setText(null);
            }
        };
        listenerEqu= new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                CharSequence temp=displayText.getText();
                if (temp.equals(null)) {
                    return;
                }
                String myString=temp.toString();
                num2=Double.parseDouble(myString);
                switch(CalType)
                {
                    case 0:
                        result=num2;
                        break;
                    case 1:
                        result=num1+num2;
                        break;
                    case 2:
                        result=num1-num2;
                        break;
                    case 3:
                        result=num1*num2;
                        break;
                    case 4:
                        result=num1/num2;
                        break;
                    default:
                        result=0;
                        break;
                }
                String temp_result=String.valueOf(result);
                displayText.setText(temp_result);
                EquBtnDownFlag=true;
            }
        };
        btn_clear=(Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                displayText.setText("");
                num1 = 0;
                num2 = 0;
                CalType = 0;
                EquBtnDownFlag = false;
                CharSequence temp=displayText.getText();
                String myString=temp.toString();
                myString+="0";
            }
        });
        btn_0.setOnClickListener(listener0);
        btn_1.setOnClickListener(listener1);
        btn_2.setOnClickListener(listener2);
        btn_3.setOnClickListener(listener3);
        btn_4.setOnClickListener(listener4);
        btn_5.setOnClickListener(listener5);
        btn_6.setOnClickListener(listener6);
        btn_7.setOnClickListener(listener7);
        btn_8.setOnClickListener(listener8);
        btn_9.setOnClickListener(listener9);
        btn_dot.setOnClickListener(listenerPoint);
        btn_add.setOnClickListener(listenerAdd);
        btn_sub.setOnClickListener(listenerSub);
        btn_mul.setOnClickListener(listenerMul);
        btn_div.setOnClickListener(listenerDiv);
        btn_eq.setOnClickListener(listenerEqu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}

