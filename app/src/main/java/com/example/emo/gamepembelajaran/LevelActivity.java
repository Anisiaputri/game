package com.example.emo.gamepembelajaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void kembali(View view) {
        finish();
    }

    public void level1(View view) {
        Intent intent = new Intent(LevelActivity.this, TebakHurufActivity.class);
        startActivity(intent);
    }

    public void level2(View view) {
        Intent intent = new Intent(LevelActivity.this, TebakSandhanganActivity.class);
        startActivity(intent);
    }
}
