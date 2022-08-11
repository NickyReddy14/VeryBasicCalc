package com.ninto.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText ip;
    private Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, pt, add, sub, mul, div, mod, pm, eq, clr;

    float v1, v2, eql;
    boolean sum, diff, prod, quot, rem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n0 = (Button) findViewById(R.id.n0);
        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);
        pt = (Button) findViewById(R.id.pt);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        mod = (Button) findViewById(R.id.mod);
        pm = (Button) findViewById(R.id.pm);
        eq = (Button) findViewById(R.id.eq);
        clr = (Button) findViewById(R.id.clr);
        ip = (EditText) findViewById(R.id.ip);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "1");
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "9");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "9");
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + "0");
            }
        });

        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText(ip.getText() + ".");
            }
        });

        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText("");
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText("");
            }
        });

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