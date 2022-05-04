package com.example.trapezoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private EditText alpha;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        alpha = findViewById(R.id.alpha);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                double a_value = Double.valueOf(a.getText().toString());
                double b_value = Double.valueOf(b.getText().toString());
                double alpha_value = Double.valueOf(alpha.getText().toString());

                intent.putExtra("a_value", a_value);
                intent.putExtra("b_value", b_value);
                intent.putExtra("alpha_value", alpha_value);

                startActivity(intent);
            }
        });
    }
}