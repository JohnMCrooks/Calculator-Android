package com.cr00keddesigns.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.regex.*;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private TextView textView3;

    private EditText operand1;

    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultip;
    private Button btnModulo;
    private Button btnClear;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPeriod;
    private Button btnMathulate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Links objects created above to layout fields in the XML file
        operand1 = (EditText) findViewById(R.id.edit_operand1);

        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultip = (Button) findViewById(R.id.btnMultip);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnModulo = (Button) findViewById(R.id.btnModulo);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnPeriod = (Button) findViewById(R.id.btnPeriod);
        btnMathulate = (Button) findViewById(R.id.btnMathulate);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        textView3 = (TextView) findViewById(R.id.textView3);
        txtResult = (TextView) findViewById(R.id.txtResult);

        //When clicked, This will verify and evaluate the user input.
        btnMathulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!operand1.equals(null)){
                    if (operand1.length()>1) {

                        //verify the last character isn't an operator so that the equation can be evaluated properly.
                        String last = String.valueOf(operand1.getText().charAt(operand1.length() - 1));
                        String tickertape = ((checkLast(last, operand1, txtResult).getText().toString()) + " = " + txtResult.getText().toString() +  "\n" + textView3.getText().toString());
                        textView3.setText(tickertape);

                    }else{
                        Toast.makeText(MainActivity.this, "That's a nice digit, what would you like to do with it?", Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "You won't get very far doing that...", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //Clearing the user input and the text result field.
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1 != null || !operand1.equals("")){
                    txtResult.setText("");
                    operand1.setText("");
                    operand1.requestFocus();
                    Toast.makeText(MainActivity.this, "Clear!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "There is nothing to clear!", Toast.LENGTH_SHORT).show();
                }

            }
        });


        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("+");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            operand1.append("0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("9");
            }
        });
        btnPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append(".");
            }
        });


        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("-");
            }
        });

        btnMultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("*");
            }
        });

        btnModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("^");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("/");
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public static EditText checkLast(String last, EditText operand1, TextView txtResult){
        //If the last character is an operand, remove it and re-run the check.
        if(last.equals("-") || last.equals("+") ||last.equals("/") || last.equals("*")) {
            operand1.setText(operand1.getText().toString().substring(0,operand1.length()-1));
            last = String.valueOf(operand1.getText().charAt(operand1.length()-1));
            checkLast(last, operand1, txtResult);
        } else {
            //If all is good, evaluate the input.
            double result = eval(operand1.getText().toString());
            txtResult.setText(Double.toString(result));
        }
        return operand1;
    }

/* The Evaluation Code below was found on Stack Overflow originally posted by User 'Boann'.
Thread: http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form     */
    public static double eval(final String str) {
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
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
