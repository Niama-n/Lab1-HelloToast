package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCount = findViewById(R.id.text_count);
        Button btnToast = findViewById(R.id.button_toast);
        Button btnCount = findViewById(R.id.button_count);

        btnToast.setOnClickListener(v -> {
            Toast.makeText(this, "hello to this lab", Toast.LENGTH_SHORT).show();
        });

        btnCount.setOnClickListener(v -> {
            count++;
            textCount.setText(String.valueOf(count));
        });
    }
}