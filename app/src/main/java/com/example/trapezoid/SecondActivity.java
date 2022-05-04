package com.example.trapezoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView perimeter;
    private TextView square;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        perimeter = findViewById(R.id.perimeter);
        square = findViewById(R.id.square);
        Bundle arguments = getIntent().getExtras();

        if(arguments !=  null){
            double a = arguments.getDouble("a_value");
            double b = arguments.getDouble("b_value");
            double alpha = arguments.getDouble("alpha_value");

            double d = Math.abs(b - a)/Math.cos(alpha);
            double h = d * Math.sin(alpha);

            double per = a + b + d + h;
            double sq = ((b + a)/2) * h;

            perimeter.setText("Периметр: " + Double.toString(per));
            square.setText("Площадь: " + Double.toString(sq));
        }
    }
}