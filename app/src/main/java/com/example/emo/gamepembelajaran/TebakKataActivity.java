package com.example.emo.gamepembelajaran;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TebakKataActivity extends AppCompatActivity {
    ImageButton pilih;
    ImageButton jw1,jw2,jw3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int skor=0;

    Kata kata = new Kata();
    int n = kata.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;
    TextView tampilskor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_kata);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        soal = findViewById(R.id.soal);
        jw1 = findViewById(R.id.jawaban1);
        jw2 = findViewById(R.id.jawaban2);
        jw3 = findViewById(R.id.jawaban3);

        newlevel();

        jw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCorrect(j1 == s);
            }
        });

        jw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCorrect(j2 == s);
            }
        });

        jw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isCorrect(j3 == s);
            }
        });

    }

    public void newlevel() {
        s = kata.getrandomkata();
        s1 = kata.getrandomkata();
        int i = new Random().nextInt(3) + 1;

        if (i == 1) {
            j1 = s;
        } else {
            j1 = kata.getrandomkata();
        }

        if (i == 2) {
            j2 = s;
        } else {
            j2 = kata.getrandomkata();
        }

        if (i == 3) {
            j3 = s;
        } else {
            j3 = kata.getrandomkata();
        }

        soal.setBackgroundResource(kata.getimagesoal(s));
        jw1.setBackgroundResource(kata.getimagejwbn(j1));
        jw2.setBackgroundResource(kata.getimagejwbn(j2));
        jw3.setBackgroundResource(kata.getimagejwbn(j3));

    }

    /*SharedPreferences score = this.getSharedPreferences("tebakgambar", Context.MODE_PRIVATE);
    skor = score.getInt("skor", 0);

    tampilskor.setText("SKOR : "+ skor);*/

    public void isCorrect(boolean input){
        TextView tampilskor = findViewById(R.id.skor);

        if (input && i <n){
            skor +=10;
            newlevel();
            i++;
        }
        else {
            skor -=5;
        }

        SharedPreferences score = getSharedPreferences("tebakgambar", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = score.edit();
        editor.putInt("skor", skor);
        editor.commit();
        tampilskor.setText("SKOR : "+ skor);
    }

    public void kembali(View view) {
        finish();
    }
}
