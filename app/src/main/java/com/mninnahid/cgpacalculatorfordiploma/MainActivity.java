package com.mninnahid.cgpacalculatorfordiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber,editTextNumber2,editTextNumber3,editTextNumber4,editTextNumber5,editTextNumber6,editTextNumber7,editTextNumber8;
    private TextView textView2;
    private Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        editTextNumber3 = (EditText) findViewById(R.id.editTextNumber3);
        editTextNumber4 = (EditText) findViewById(R.id.editTextNumber4);
        editTextNumber5 = (EditText) findViewById(R.id.editTextNumber5);
        editTextNumber6 = (EditText) findViewById(R.id.editTextNumber6);
        editTextNumber7 = (EditText) findViewById(R.id.editTextNumber7);
        editTextNumber8 = (EditText) findViewById(R.id.editTextNumber8);

        textView2 = (TextView) findViewById(R.id.textView2);

        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
    }

    public void nahid(View view) {
        try {
            double sub1 = Double.parseDouble(editTextNumber.getText().toString());
            double sub2 = Double.parseDouble(editTextNumber2.getText().toString());
            double sub3 = Double.parseDouble(editTextNumber3.getText().toString());
            double sub4 = Double.parseDouble(editTextNumber4.getText().toString());
            double sub5 = Double.parseDouble(editTextNumber5.getText().toString());
            double sub6 = Double.parseDouble(editTextNumber6.getText().toString());
            double sub7 = Double.parseDouble(editTextNumber7.getText().toString());
            double sub8 = Double.parseDouble(editTextNumber8.getText().toString());
            if (sub1 <= 4.00 && sub2 <=4.00 && sub3 <= 4.00 && sub4 <=4.00 && sub5 <= 4.00 && sub6 <=4.00 && sub7 <= 4.00 && sub8 <=4.00 ){
                double result = ((sub1 * 5) + (sub2 * 5) + (sub3 * 5) + (sub4 *
                        10) + (sub5 * 15) + (sub6 * 20) + (sub7 * 25) + (sub8 * 15)) / 100;
                textView2.setText(String.valueOf("CGPA : "+ result));
            }
            else {
                Toast.makeText (MainActivity.this,"Enter Correct " + "Value of GPA",Toast.LENGTH_SHORT).show();
            }

        }
        catch (Exception e) {
            Toast.makeText (MainActivity.this,"Enter Correct " + "Value",Toast.LENGTH_SHORT).show();
        }
    }

    public void nayan(View view) {
        List<EditText> asList;
        asList = Arrays.asList(editTextNumber, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8);
        int asListsize = asList.size();
        for (int i = 0; i<asListsize; i++) {
            EditText tite = asList.get(i);
            Objects.requireNonNull(tite.getText()).clear();
            textView2.setText("CGPA :");
        }
    }
}