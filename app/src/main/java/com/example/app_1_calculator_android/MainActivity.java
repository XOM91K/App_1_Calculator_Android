package com.example.app_1_calculator_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText editTextAnswer = findViewById(R.id.editTextNumber);
        Button buttonAnswer = findViewById(R.id.button);
        TextView correctText = findViewById(R.id.CorrectAnswer);
        TextView incorrectText = findViewById(R.id.IncorrectAnswer);

        buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editTextAnswer.getText().toString();
                if (text.equals("15")) {
                    correctText.setVisibility(View.VISIBLE);
                    incorrectText.setVisibility(View.INVISIBLE);
                } else {
                    incorrectText.setVisibility(View.VISIBLE);
                    correctText.setVisibility(View.INVISIBLE);
                    //
                }
            }
        });
    }
}
