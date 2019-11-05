package com.example.emo.gamepembelajaran;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarSandhanganActivity extends AppCompatActivity {

    ImageButton wulu,suku,taling,pepet,talingtarung,layar,wigyan,cecak,pangkon,cakra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_sandhangan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        wulu = findViewById(R.id.btn_wulu);

        wulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wulu();
            }
        });

        suku = findViewById(R.id.btn_suku);

        suku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suku();
            }
        });

        taling = findViewById(R.id.btn_taling);

        taling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taling();
            }
        });

        pepet = findViewById(R.id.btn_pepet);

        pepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pepet();
            }
        });

        talingtarung = findViewById(R.id.btn_talingtarung);

        talingtarung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                talingtarung();
            }
        });

        layar = findViewById(R.id.btn_layar);

        layar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layar();
            }
        });

        wigyan = findViewById(R.id.btn_wigyan);

        wigyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wigyan();
            }
        });

        cecak = findViewById(R.id.btn_cecak);

        cecak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cecak();
            }
        });

        pangkon = findViewById(R.id.btn_pangkon);

        pangkon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pangkon();
            }
        });

        cakra = findViewById(R.id.btn_cakra);

        cakra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cakra();
            }
        });
    }

    public void wulu(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupwulu, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void suku(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupsuku, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void taling(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuptaling, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void pepet(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppepet, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void talingtarung(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuptalingtarung, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void layar(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuplayar, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void wigyan(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupwigyan, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void cecak(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupcecak, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void pangkon(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppangkon, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void cakra(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupcakra, viewGroup, false);

        builder.setView(view);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void kembali(View view) {
        finish();
    }
}
