package com.example.emo.gamepembelajaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MenuKuisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kuis);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void kembali(View view) {
        finish();
    }

    public void tbkhuruf(View view) {
        Intent intent = new Intent(MenuKuisActivity.this, LevelActivity.class);
        startActivity(intent);
    }

    public void tbkkata(View view) {
        Intent intent = new Intent(MenuKuisActivity.this, TebakKataActivity.class);
        startActivity(intent);
    }
}
