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

    private EditText operand1;
    private EditText operand2;

    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultip;
    private Button btnModulo;
    private Button btnClear;

    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Links objects created above to layout fields in the XML file
        operand1 = (EditText) findViewById(R.id.edit_operand1);
        operand2 = (EditText) findViewById(R.id.edit_operand2);

        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultip = (Button) findViewById(R.id.btnMultip);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnModulo = (Button) findViewById(R.id.btnModulo);
        btnClear = (Button) findViewById(R.id.btnClear);


        txtResult = (TextView) findViewById(R.id.txtResult);

        //on click listener allows us to click the button and cause an action to occur
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && (operand2.getText().length()>0)){
                    double op1 = Double.parseDouble(operand1.getText().toString());
                    double op2 = Double.parseDouble((operand2.getText().toString()));
                    double theResult = op1+op2;
                    txtResult.setText(Double.toString(theResult));
             }
                else{
                    Toast.makeText(MainActivity.this, "Hey Hey Hey! Use some numbers dag nabit!", Toast.LENGTH_LONG).show();}
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
                operand1.setText("0.0");
                operand2.setText("0.0");
                operand1.requestFocus();
                Toast.makeText(MainActivity.this, "Numbers have been Cleared.", Toast.LENGTH_LONG);
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble((operand2.getText().toString()));
                double theResult = op1 - op2;
                txtResult.setText(Double.toString(theResult));
            }
        });

        btnMultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble((operand2.getText().toString()));
                double theResult = op1*op2;
                txtResult.setText(Double.toString(theResult));
            }
        });

        btnModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble((operand2.getText().toString()));
                int theResult = (int) (op1%op2);
                txtResult.setText(Double.toString(theResult));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble((operand2.getText().toString()));
                double theResult = op1/op2;
                txtResult.setText(Double.toString(theResult));
            }
        });

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
