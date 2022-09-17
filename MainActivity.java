package com.example.calci;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,buttonSub,buttonDivision,buttonMul,buttonC,buttonEqual,button33;
    EditText editText1;
    float mValueOne,mValueTwo;
    boolean addition1,subtract,multiplication1,division1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById (R.id.button0);
        button1 = (Button) findViewById (R.id.button1);
        button2 = (Button) findViewById (R.id.button2);
        button3 = (Button) findViewById (R.id.button3);
        button4 = (Button) findViewById (R.id.button4);
        button5 = (Button) findViewById (R.id.button5);
        button6 = (Button) findViewById (R.id.button6);
        button7 = (Button) findViewById (R.id.button7);
        button8 = (Button) findViewById (R.id.button8);
        button9 = (Button) findViewById (R.id.button9);
        buttonAdd = (Button) findViewById (R.id.buttonAdd);
        buttonSub = (Button) findViewById (R.id.buttonSub);
        buttonMul = (Button) findViewById (R.id.buttonMul);
        buttonDivision = (Button) findViewById (R.id.buttonDivision);
        // button10=(Button)findViewById(R.id.button10);
        buttonC = (Button) findViewById (R.id.buttonC);
        buttonEqual = (Button) findViewById (R.id.buttonEqual);
        button33 = (Button) findViewById (R.id.button33);
        editText1 = (EditText) findViewById(R.id.editText1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"0");
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+".");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1==null){
                    editText1.setText("");
                }else{
                    mValueOne = Float.parseFloat(editText1.getText()+"");
                    addition1 = true;
                    editText1.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1==null){
                    editText1.setText("");
                }else{
                    mValueOne = Float.parseFloat(editText1.getText()+"");
                    subtract = true;
                    editText1.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1==null){
                    editText1.setText("");
                }else{
                    mValueOne = Float.parseFloat(editText1.getText()+"");
                    multiplication1 = true;
                    editText1.setText(null);
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1==null){
                    editText1.setText("");
                }else{
                    mValueOne = Float.parseFloat(editText1.getText()+"");
                    division1 = true;
                    editText1.setText(null);
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(editText1.getText() + "");


                if (addition1 == true) {
                    editText1.setText(mValueOne + mValueTwo + "");
                    addition1 = false;
                }
                if (subtract == true) {
                    editText1.setText(mValueOne - mValueTwo + "");
                    subtract = false;
                }
                if (multiplication1 == true) {
                    editText1.setText(mValueOne * mValueTwo + "");
                    multiplication1 = false;
                }
                if (division1 == true) {
                    editText1.setText(mValueOne / mValueTwo + "");
                    division1 = false;
                }
            }
        });
    }
}