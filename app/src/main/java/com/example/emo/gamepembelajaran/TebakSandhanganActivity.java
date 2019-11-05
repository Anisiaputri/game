package com.example.emo.gamepembelajaran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TebakSandhanganActivity extends AppCompatActivity {

    ImageButton pilih;
    ImageButton jw1,jw2,jw3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int skor=0;

    Sandhangan sandhangan = new Sandhangan();
    int n = sandhangan.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_sandhangan);
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

    public void newlevel(){
        s = sandhangan.getrandomhuruf();
        s1 = sandhangan.getrandomhuruf();
        int i = new Random().nextInt(3) + 1;

        if (i == 1){
            j1 = s;
        }
        else {
            j1 = sandhangan.getrandomhuruf();
        }

        if (i == 2){
            j2 = s;
        }
        else {
            j2 = sandhangan.getrandomhuruf();
        }

        if (i == 3){
            j3 = s;
        }
        else {
            j3 = sandhangan.getrandomhuruf();
        }

        soal.setBackgroundResource(sandhangan.getimagesoal(s));
        jw1.setBackgroundResource(sandhangan.getimagejwbn(j1));
        jw2.setBackgroundResource(sandhangan.getimagejwbn(j2));
        jw3.setBackgroundResource(sandhangan.getimagejwbn(j3));
    }

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

        tampilskor.setText("SKOR : "+ skor);
    }


    public void kembali(View view) {
        finish();
    }
}
