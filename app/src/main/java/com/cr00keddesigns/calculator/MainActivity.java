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

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;

    private EditText operand1;
    private EditText operand2;

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
//        operand2 = (EditText) findViewById(R.id.edit_operand2);

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


        txtResult = (TextView) findViewById(R.id.txtResult);

        //on click listener allows us to click the button and cause an action to occur

        btnMathulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!operand1.equals(null)){

                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1 != null || !operand1.equals("")){
                    txtResult.setText("");
                    operand1.setText("");
                    operand1.requestFocus();
                    Toast.makeText(MainActivity.this, "Numbers have been Cleared.", Toast.LENGTH_LONG);
                }else{
                    Toast.makeText(MainActivity.this, "There is nothing to clear!", Toast.LENGTH_LONG);
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
                operand1.append("%");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.append("/");
            }
        });

//        btnAddition.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(operand1.getText().length()>0 && (operand2.getText().length()>0)){
//                    float op1 = Float.parseFloat(operand1.getText().toString());
//                    float op2 = Float.parseFloat((operand2.getText().toString()));
//                    double theResult = op1;
//                    txtResult.setText(Double.toString(theResult));
//                }
//                else{
//                    Toast.makeText(MainActivity.this, "Hey Hey Hey! Use some numbers dag nabit!", Toast.LENGTH_LONG).show();}
//            }
//        });

//
//        btnSubtraction.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double op1 = Double.parseDouble(operand1.getText().toString());
//                double op2 = Double.parseDouble((operand2.getText().toString()));
//                double theResult = op1 - op2;
//                txtResult.setText(Double.toString(theResult));
//            }
//        });
//
//        btnMultip.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double op1 = Double.parseDouble(operand1.getText().toString());
//                double op2 = Double.parseDouble((operand2.getText().toString()));
//                double theResult = op1*op2;
//                txtResult.setText(Double.toString(theResult));
//            }
//        });
//
//        btnModulo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double op1 = Double.parseDouble(operand1.getText().toString());
//                double op2 = Double.parseDouble((operand2.getText().toString()));
//                int theResult = (int) (op1%op2);
//                txtResult.setText(Double.toString(theResult));
//            }
//        });
//
//        btnDivision.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double op1 = Double.parseDouble(operand1.getText().toString());
//                double op2 = Double.parseDouble((operand2.getText().toString()));
//                double theResult = op1/op2;
//                txtResult.setText(Double.toString(theResult));
//            }
//        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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
