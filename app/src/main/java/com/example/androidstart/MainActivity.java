package com.example.androidstart;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digit_comparator);

        EditText firstDigit = findViewById(R.id.first_digit);
        EditText secondDigit = findViewById(R.id.second_digit);

        Button compare = findViewById(R.id.compare);

        TextView result = findViewById(R.id.result);


        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtFirstDigitValue = firstDigit.getText().toString();
                String txtSecondDigitValue = secondDigit.getText().toString();

                try {

                    Integer firstValue = Integer.valueOf(txtFirstDigitValue);
                    Integer secondValue = Integer.valueOf(txtSecondDigitValue);

                    Log.v("Comparator", "Input one " + firstValue + " and input two " + secondValue);

                    if (firstValue.equals(secondValue)) {
                        result.setText("Equal");
                    } else {
                        result.setText("Not Equal");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Error");

                }
            }

        });
    }
}