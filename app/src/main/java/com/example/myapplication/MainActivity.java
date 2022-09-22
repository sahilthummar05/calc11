package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a,b;
    TextView t1;
    RadioButton sum,abs,mul,mod;
    Button ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        t1=findViewById(R.id.t1);
        sum=findViewById(R.id.sum);
        abs=findViewById(R.id.abs);
        mul=findViewById(R.id.mul);
        mod=findViewById(R.id.mod);
        ans=findViewById(R.id.ans);

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sum.isChecked()) {
                    sum();
                } else if (abs.isChecked()) {
                    abs();
                } else if (mul.isChecked()) {
                    mul();
                }
            }

        });

    }
    int A,B,E;
    public void sum() {
        int A=Integer.parseInt(a.getText().toString());
        int B=Integer.parseInt(b.getText().toString());
        int E=A/B;
        t1.setText(String.valueOf(E));
    }

    public void abs() {
    }

    public void mul() {
    }
}