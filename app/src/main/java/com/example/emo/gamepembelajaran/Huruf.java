package com.example.emo.gamepembelajaran;

import java.util.Random;

public class Huruf {
    private int listhuruf[] = {
        R.drawable.pop_ha,
        R.drawable.pop_na,
        R.drawable.pop_ca,
        R.drawable.pop_ra,
        R.drawable.pop_ka,
        R.drawable.pop_da,
        R.drawable.pop_ta,
        R.drawable.pop_sa,
        R.drawable.pop_wa,
        R.drawable.pop_la,
        R.drawable.pop_pa,
        R.drawable.pop_dha,
        R.drawable.pop_ja,
        R.drawable.pop_ya,
        R.drawable.pop_nya,
        R.drawable.pop_ma,
        R.drawable.pop_ga,
        R.drawable.pop_ba,
        R.drawable.pop_tha,
        R.drawable.pop_nga
    };

    private int listhuruf2[] = {
        R.drawable.ha,
        R.drawable.na,
        R.drawable.ca,
        R.drawable.ra,
        R.drawable.ka,
        R.drawable.da,
        R.drawable.ta,
        R.drawable.sa,
        R.drawable.wa,
        R.drawable.la,
        R.drawable.pa,
        R.drawable.dha,
        R.drawable.ja,
        R.drawable.ya,
        R.drawable.nya,
        R.drawable.ma,
        R.drawable.ga,
        R.drawable.ba,
        R.drawable.tha,
        R.drawable.nga
    };

    public int[] getlist(){
        return listhuruf;
    }

    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listhuruf[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listhuruf.length;
    }

    public int getjumlah2(){
        return listhuruf2.length;
    }
}
