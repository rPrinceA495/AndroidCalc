package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bsin, bcos, btan, bdot,bpi,bequal,bplus,bmin, bmul,bdiv,binv,bsquare,bsqrt,blog,bln,bfact, bc, bac, bb1, bb2;
    TextView tvMain, tvSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        bdot = findViewById(R.id.bdot);
        bpi = findViewById(R.id.bpi);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsquare = findViewById(R.id.bsquare);
        bsqrt = findViewById(R.id.bsqrt);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bfact = findViewById(R.id.bfact);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        tvMain = findViewById(R.id.tvMain);
        tvSec = findViewById(R.id.tvSec);

        /**
         *  BUTTON ON CLICK LISTENERS FOR NUMBERS
         */
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s1", tvMain.getText()));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s2", tvMain.getText()));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s3", tvMain.getText()));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s4", tvMain.getText()));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s5", tvMain.getText()));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s6", tvMain.getText()));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s7", tvMain.getText()));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s8", tvMain.getText()));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s9", tvMain.getText()));
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s0", tvMain.getText()));
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s.", tvMain.getText()));
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s(", tvMain.getText()));
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s)", tvMain.getText()));
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSec.setText(bpi.getText());
                tvMain.setText(String.format("%s3.141592654", tvMain.getText()));
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s^-1", tvMain.getText()));
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%ssin", tvMain.getText()));
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%scos", tvMain.getText()));
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%stan", tvMain.getText()));
            }
        });
        /**
         * ********** CLEAR BUTTONS
         */
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText("");
                tvSec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = tvMain.getText().toString();
                if(val.isEmpty()) {
                    return;
                }else {
                    val = val.substring(0, val.length() - 1);
                    tvMain.setText(val);
                }

            }
        });
        /**
         * ********** OPERATION BUTTONS
         */
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s+", tvMain.getText()));
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s+", tvMain.getText()));
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s*", tvMain.getText()));
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(String.format("%s/", tvMain.getText()));
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvMain.setText(String.valueOf(r));
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvMain.getText().toString());
                int fact = factorial(val);
                tvMain.setText(String.valueOf(fact));
                tvSec.setText(String.format("%d!", val));
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvMain.getText().toString());
                double square = d * d;
                tvMain.setText(String.valueOf(square));
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setText(tvMain.getText()+"log");
            }
        });
        /**
         *  EQUALs EVALUATION
         */
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvMain.getText().toString();
                double result = evaluate(val);
                tvMain.setText(String.valueOf(result));
                tvSec.setText(val);
            }
        });
    }

    // Factorial function
    int factorial(int n) {
        return (n==1 || n==0) ? 1 : n * factorial(n - 1);
    }

    // Equals evaluation
    public static double evaluate(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}