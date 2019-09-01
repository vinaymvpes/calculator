package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         {







                                  }

        num1=(EditText)findViewById(R.id.etNum1);
        num2=(EditText)findViewById(R.id.etNum2);
        add=(Button)findViewById(R.id.btnAdd);
        sub=(Button)findViewById(R.id.btnSub);
        result=(TextView)findViewById(R.id.tvAnswer);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number1=Integer.parseInt(num1.getText().toString());
                int Number2=Integer.parseInt(num2.getText().toString());
                int Sum=Number1+Number2;
                result.setText("ANSWER: " + String.valueOf(Sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number1=Integer.parseInt(num1.getText().toString());
                int Number2=Integer.parseInt(num2.getText().toString());
                int Sum=Number1-Number2;
                result.setText("ANSWER: " + String.valueOf(Sum));
            }
        });




    }

}
