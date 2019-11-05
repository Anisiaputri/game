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

public class BelajarAksaraActivity extends AppCompatActivity {

    ImageButton ha,na,ca,ra,ka,da,ta,sa,wa,la,pa,dha,ja,ya,nya,ma,ga,ba,tha,nga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_aksara);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ha = findViewById(R.id.btn_haa);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.ha);

        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ha();
                SuaraHa.start();
            }
        });

        na = findViewById(R.id.btn_naa);
        final MediaPlayer SuaraNa = MediaPlayer.create(this, R.raw.na);

        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                na();
                SuaraNa.start();
            }
        });

        ca = findViewById(R.id.btn_caa);
        final MediaPlayer SuaraCa = MediaPlayer.create(this, R.raw.ca);

        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ca();
                SuaraCa.start();
            }
        });

        ra = findViewById(R.id.btn_raa);
        final MediaPlayer SuaraRa = MediaPlayer.create(this, R.raw.ra);

        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ra();
                SuaraRa.start();
            }
        });

        ka = findViewById(R.id.btn_kaa);
        final MediaPlayer SuaraKa = MediaPlayer.create(this, R.raw.ka);

        ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ka();
                SuaraKa.start();
            }
        });

        da = findViewById(R.id.btn_daa);
        final MediaPlayer SuaraDa = MediaPlayer.create(this, R.raw.da);

        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                da();
                SuaraDa.start();
            }
        });

        ta = findViewById(R.id.btn_taa);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);

        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ta();
                SuaraTa.start();
            }
        });

        sa = findViewById(R.id.btn_saa);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.sa);

        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sa();
                SuaraSa.start();
            }
        });

        wa = findViewById(R.id.btn_waa);
        final MediaPlayer SuaraWa = MediaPlayer.create(this, R.raw.wa);

        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wa();
                SuaraWa.start();
            }
        });

        la = findViewById(R.id.btn_laa);
        final MediaPlayer SuaraLa = MediaPlayer.create(this, R.raw.la);

        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                la();
                SuaraLa.start();
            }
        });

        pa = findViewById(R.id.btn_paa);
        final MediaPlayer SuaraPa = MediaPlayer.create(this, R.raw.pa);

        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pa();
                SuaraPa.start();
            }
        });

        dha = findViewById(R.id.btn_dhaa);
        final MediaPlayer SuaraDha = MediaPlayer.create(this, R.raw.dha);

        dha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dha();
                SuaraDha.start();
            }
        });

        ja = findViewById(R.id.btn_jaa);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.ja);

        ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ja();
                SuaraJa.start();
            }
        });

        ya = findViewById(R.id.btn_yaa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.ya);

        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ya();
                SuaraYa.start();
            }
        });

        nya = findViewById(R.id.btn_nyaa);
        final MediaPlayer SuaraNya = MediaPlayer.create(this, R.raw.nya);

        nya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nya();
                SuaraNya.start();
            }
        });

        ma = findViewById(R.id.btn_maa);
        final MediaPlayer SuaraMa = MediaPlayer.create(this, R.raw.ma);

        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma();
                SuaraMa.start();
            }
        });

        ga = findViewById(R.id.btn_gaa);
        final MediaPlayer SuaraGa = MediaPlayer.create(this, R.raw.ga);

        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ga();
                SuaraGa.start();
            }
        });

        ba = findViewById(R.id.btn_baa);
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba();
                SuaraBa.start();
            }
        });

        tha = findViewById(R.id.btn_thaa);
        final MediaPlayer SuaraTha = MediaPlayer.create(this, R.raw.tha);

        tha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tha();
                SuaraTha.start();
            }
        });

        nga = findViewById(R.id.btn_ngaa);
        final MediaPlayer SuaraNga = MediaPlayer.create(this, R.raw.nga);

        nga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nga();
                SuaraNga.start();
            }
        });
    }

    public void ha(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupha, viewGroup, false);

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

    public void na(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupna, viewGroup, false);

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

    public void ca(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupca, viewGroup, false);

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

    public void ra(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupra, viewGroup, false);

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

    public void ka(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupka, viewGroup, false);

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

    public void da(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupda, viewGroup, false);

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

    public void ta(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupta, viewGroup, false);

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

    public void sa(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupsa, viewGroup, false);

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

    public void wa(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupwa, viewGroup, false);

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

    public void la(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupla, viewGroup, false);

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

    public void pa(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuppa, viewGroup, false);

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

    public void dha(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupdha, viewGroup, false);

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

    public void ja(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupja, viewGroup, false);

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

    public void ya(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupya, viewGroup, false);

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

    public void nya(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupnya, viewGroup, false);

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

    public void ma(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupma, viewGroup, false);

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

    public void ga(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupga, viewGroup, false);

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

    public void ba(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupba, viewGroup, false);

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

    public void tha(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popuptha, viewGroup, false);

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

    public void nga(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customdialog);
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup viewGroup = findViewById(R.id.content);
        View view = inflater.inflate(R.layout.popupnga, viewGroup, false);

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
