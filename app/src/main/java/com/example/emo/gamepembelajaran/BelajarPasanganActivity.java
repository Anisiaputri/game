package com.example.emo.gamepembelajaran;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarPasanganActivity extends AppCompatActivity {

    ImageButton pasha,pasna,pasca,pasra,paska,pasda,pasta,passa,paswa,pasla,paspa,pasdha,pasja,pasya,pasnya,pasma,pasga,pasba,pastha,pasnga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_pasangan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pasha = findViewById(R.id.btn_ha);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.ha);

        pasha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasha();
                SuaraHa.start();
            }
        });

        pasna = findViewById(R.id.btn_na);
        final MediaPlayer SuaraNa = MediaPlayer.create(this, R.raw.na);

        pasna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasna();
                SuaraNa.start();
            }
        });

        pasca = findViewById(R.id.btn_ca);
        final MediaPlayer SuaraCa = MediaPlayer.create(this, R.raw.ca);

        pasca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasca();
                SuaraCa.start();
            }
        });

        pasra = findViewById(R.id.btn_ra);
        final MediaPlayer SuaraRa = MediaPlayer.create(this, R.raw.ra);

        pasra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasra();
                SuaraRa.start();
            }
        });

        paska = findViewById(R.id.btn_ka);
        final MediaPlayer SuaraKa = MediaPlayer.create(this, R.raw.ka);

        paska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paska();
                SuaraKa.start();
            }
        });

        pasda = findViewById(R.id.btn_da);
        final MediaPlayer SuaraDa = MediaPlayer.create(this, R.raw.da);

        pasda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasda();
                SuaraDa.start();
            }
        });

        pasta = findViewById(R.id.btn_ta);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);

        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasta();
                SuaraTa.start();
            }
        });

        passa = findViewById(R.id.btn_sa);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.sa);

        passa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passa();
                SuaraSa.start();
            }
        });

        paswa = findViewById(R.id.btn_wa);
        final MediaPlayer SuaraWa = MediaPlayer.create(this, R.raw.wa);

        paswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paswa();
                SuaraWa.start();
            }
        });

        pasla = findViewById(R.id.btn_la);
        final MediaPlayer SuaraLa = MediaPlayer.create(this, R.raw.la);

        pasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasla();
                SuaraLa.start();
            }
        });

        paspa = findViewById(R.id.btn_pa);
        final MediaPlayer SuaraPa = MediaPlayer.create(this, R.raw.pa);

        paspa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paspa();
                SuaraPa.start();
            }
        });

        pasdha = findViewById(R.id.btn_dha);
        final MediaPlayer SuaraDha = MediaPlayer.create(this, R.raw.dha);

        pasdha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasdha();
                SuaraDha.start();
            }
        });

        pasja = findViewById(R.id.btn_ja);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.ja);

        pasja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasja();
                SuaraJa.start();
            }
        });

        pasya = findViewById(R.id.btn_ya);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.ya);

        pasya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasya();
                SuaraYa.start();
            }
        });

        pasnya = findViewById(R.id.btn_nya);
        final MediaPlayer SuaraNya = MediaPlayer.create(this, R.raw.nya);

        pasnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasnya();
                SuaraNya.start();
            }
        });

        pasma = findViewById(R.id.btn_ma);
        final MediaPlayer SuaraMa = MediaPlayer.create(this, R.raw.ma);

        pasma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasma();
                SuaraMa.start();
            }
        });

        pasga = findViewById(R.id.btn_ga);
        final MediaPlayer SuaraGa = MediaPlayer.create(this, R.raw.ga);

        pasga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasga();
                SuaraGa.start();
            }
        });

        pasba = findViewById(R.id.btn_ba);
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);

        pasba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasba();
                SuaraBa.start();
            }
        });

        pastha = findViewById(R.id.btn_tha);
        final MediaPlayer SuaraTha = MediaPlayer.create(this, R.raw.tha);

        pastha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pastha();
                SuaraTha.start();
            }
        });

        pasnga = findViewById(R.id.btn_nga);
        final MediaPlayer SuaraNga = MediaPlayer.create(this, R.raw.nga);

        pasnga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasnga();
                SuaraNga.start();
            }
        });
    }

    public void pasha(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasha, viewGroup, false);

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

    public void pasna(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasna, viewGroup, false);

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

    public void pasca(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasca, viewGroup, false);

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

    public void pasra(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasra, viewGroup, false);

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

    public void paska(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppaska, viewGroup, false);

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

    public void pasda(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasda, viewGroup, false);

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

    public void pasta(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasta, viewGroup, false);

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

    public void passa(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppassa, viewGroup, false);

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

    public void paswa(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppaswa, viewGroup, false);

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

    public void pasla(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasla, viewGroup, false);

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

    public void paspa(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppaspa, viewGroup, false);

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

    public void pasdha(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasdha, viewGroup, false);

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

    public void pasja(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasja, viewGroup, false);

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

    public void pasya(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasya, viewGroup, false);

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

    public void pasnya(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasnya, viewGroup, false);

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

    public void pasma(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasma, viewGroup, false);

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

    public void pasga(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasga, viewGroup, false);

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

    public void pasba(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasba, viewGroup, false);

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

    public void pastha(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppastha, viewGroup, false);

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

    public void pasnga(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppasnga, viewGroup, false);

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
