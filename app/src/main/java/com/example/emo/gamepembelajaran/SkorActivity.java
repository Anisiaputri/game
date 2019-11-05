package com.example.emo.gamepembelajaran;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SkorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView result = (TextView) findViewById(R.id.result);
        TextView totalskor = (TextView) findViewById(R.id.totalskor);

        int skor = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);

        SharedPreferences settings = getSharedPreferences("tebak gambar", Context.MODE_PRIVATE);
        int total = settings.getInt("totalskor", 0);
        total += skor;

        result.setText(skor + " /5");
        totalskor.setText("Total skor : " + total);

        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("totalskor", total);
        editor.commit();
    }
}
