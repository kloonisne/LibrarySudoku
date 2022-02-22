package com.example.sudokuloader;

import android.content.Context;
import android.content.Intent;

public class SudokuLoader {
    public static void start(Context context){
        context.startActivity(new Intent(context,MainMenuActivity.class));
    }
}
