package com.ninto.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText ip;
    private Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, pt, add, sub, mul, div, mod, pm, eq, clr;

    float v1, v2, eql;

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
                    v1 = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mSubtract = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyDivision = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });
    }
}