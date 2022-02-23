package com.example.sudokuloader;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class DifficultyMenuActivity extends AppCompatActivity {
    private  int selectedDifficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        /* get screen size */
        Display display = getWindowManager().getDefaultDisplay();
        Point screenSize = new Point();
        display.getSize(screenSize);
        int width = screenSize.x / 2;

        Typeface defaultFont = Typeface.createFromAsset(getAssets(), getString(R.string.app_font));

        /* resize buttons */
//        LinearLayout btnEasy = findViewById(R.id.btn_easy);
//        btnEasy.setTypeface(defaultFont);
//        btnEasy.setWidth(width);
//
//        Button btnNormal = findViewById(R.id.btn_normal);
//        btnNormal.setTypeface(defaultFont);
//        btnNormal.setWidth(width);
//
//        Button btnHard = findViewById(R.id.btn_hard);
//        btnHard.setTypeface(defaultFont);
//        btnHard.setWidth(width);
//
//        Button btnExtreme = findViewById(R.id.btn_extreme);
//        btnExtreme.setTypeface(defaultFont);
//        btnExtreme.setWidth(width);

        /* set fullscreen */
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void onClickButton(View view) {
        int id = view.getId();
        if (id == R.id.btn_easy) {
            selectedDifficulty = 1;
        } else if (id == R.id.btn_normal) {
            selectedDifficulty = 2;
        } else if (id == R.id.btn_hard) {
            selectedDifficulty = 3;
        } else if (id == R.id.btn_extreme) {
            selectedDifficulty = 4;
        } else {
            selectedDifficulty = 0;
        }
        Intent intent = new Intent(DifficultyMenuActivity.this, GameActivity.class);
        intent.putExtra("difficulty", selectedDifficulty);
        DifficultyMenuActivity.this.startActivity(intent);
    }
}
