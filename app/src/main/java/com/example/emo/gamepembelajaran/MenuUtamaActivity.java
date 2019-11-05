package com.example.emo.gamepembelajaran;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MenuUtamaActivity extends AppCompatActivity {

    ImageButton pindah;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = findViewById(R.id.btn_seting);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtamaActivity.this, MenuSettingActivity.class);
                startActivity(intent);
            }
        });
    }

    public void Close(View view) {
        finish();
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MenuUtamaActivity.this);
        builder.setMessage("Metu?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void kuis(View view) {
        Intent intent = new Intent(MenuUtamaActivity.this, MenuKuisActivity.class);
        startActivity(intent);
    }

    public void bantuan(View view) {
        Intent intent = new Intent(MenuUtamaActivity.this, BantuanActivity.class);
        startActivity(intent);
    }

    public void belajar(View view) {
        Intent intent = new Intent(MenuUtamaActivity.this, MenuActivity.class);
        startActivity(intent);
    }
}
