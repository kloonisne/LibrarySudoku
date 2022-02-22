package com.example.librarysudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sudokuloader.SudokuLoader;

public class MainActivity extends AppCompatActivity {
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);

        title.setOnClickListener(view -> {
            SudokuLoader.start(this);
        });
    }
}