package com.example.emo.gamepembelajaran;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TebakHurufActivity extends AppCompatActivity {
    ImageButton pilih;
    ImageButton jw1,jw2,jw3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int skor=0;

    Huruf huruf = new Huruf();
    int n = huruf.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;
    private String rightAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_huruf);
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
        s = huruf.getrandomhuruf();
        s1 = huruf.getrandomhuruf();
        int i = new Random().nextInt(3) + 1;

        if (i == 1){
            j1 = s;
        }
        else {
            j1 = huruf.getrandomhuruf();
        }

        if (i == 2){
            j2 = s;
        }
        else {
            j2 = huruf.getrandomhuruf();
        }

        if (i == 3){
            j3 = s;
        }
        else {
            j3 = huruf.getrandomhuruf();
        }

        soal.setBackgroundResource(huruf.getimagesoal(s));
        jw1.setBackgroundResource(huruf.getimagejwbn(j1));
        jw2.setBackgroundResource(huruf.getimagejwbn(j2));
        jw3.setBackgroundResource(huruf.getimagejwbn(j3));
    }

    public void isCorrect(final boolean input){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        CharSequence alertTitle = null;
        builder.setTitle(alertTitle);
        builder.setMessage("Answer : " + rightAnswer);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public boolean rightAnswerCount;

            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (input && i<n){
                    Intent intent = new Intent(setApplicationContext(), SkorActivity.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
                    startActivity(intent);
                }else {
                    i++;
                    newlevel();
                }
            }

            private Context setApplicationContext() {
                return null;
            }
        });
        builder.setCancelable(false);
        builder.show();

        /*TextView tampilskor = findViewById(R.id.skor);

        if (input && i < n){
            skor +=10;
            newlevel();
            i++;
        }
        else {
            skor -=5;
        }

        tampilskor.setText("SKOR : "+ skor / 10);*/
    }

    public void kembali(View view) {
        finish();
    }
}
