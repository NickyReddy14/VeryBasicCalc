package com.ninto.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText ip;
    private Button add, sub, mul, div, mod, eq;

    float v1;
    float v2;
    boolean sum, diff, prod, quot, rem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        mod = (Button) findViewById(R.id.mod);
        eq = (Button) findViewById(R.id.eq);
        ip = (EditText) findViewById(R.id.ip);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ip == null) {
                    ip.setText("");
                } else {
                    v1 = Float.parseFloat(ip.getText() + "");
                    sum = true;
                    ip.setText(null);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(ip.getText() + "");
                diff = true;
                ip.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(ip.getText() + "");
                prod = true;
                ip.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(ip.getText() + "");
                quot = true;
                ip.setText(null);
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(ip.getText() + "");
                rem = true;
                ip.setText(null);
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Float.parseFloat(ip.getText() + "");

                if (sum == true) {
                    ip.setText(v1 + v2 + "");
                    sum = false;
                }

                if (diff == true) {
                    ip.setText(v1 - v2 + "");
                    diff = false;
                }

                if (prod == true) {
                    ip.setText(v1 * v2 + "");
                    prod = false;
                }

                if (quot == true) {
                    ip.setText(v1 / v2 + "");
                    quot = false;
                }

                if (rem == true) {
                    ip.setText(v1 % v2 + "");
                    rem = false;
                }
            }
        });
    }
}