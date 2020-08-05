package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView title = findViewById(R.id.title);
        title.setText("Hello: ");
        Button viewTitle = findViewById(R.id.viewTitle);
        viewTitle.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView inputName = MainActivity.this.findViewById(R.id.inputName);
                title.setText("Hello: " + inputName.getText());
            }
        });

        Button delete = findViewById(R.id.deleteTitle);
        delete.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView inputName = MainActivity.this.findViewById(R.id.inputName);
                inputName.setText(null);
                title.setText("Hello: ");
            }
        });
    }
}