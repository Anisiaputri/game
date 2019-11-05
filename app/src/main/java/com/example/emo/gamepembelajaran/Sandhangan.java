package com.example.emo.gamepembelajaran;

import java.util.Random;

public class Sandhangan {
    private int listsandhangan[] = {
        R.drawable.pop_wulu,
        R.drawable.pop_suku,
        R.drawable.pop_taling,
        R.drawable.pop_talingtarung,
        R.drawable.pop_wigyan
    };

    private int listsandhangan2[] = {
        R.drawable.wulu,
        R.drawable.suku,
        R.drawable.taling,
        R.drawable.talingtarung,
        R.drawable.wigyan,
        R.drawable.cakra,
        R.drawable.cecak,
        R.drawable.pangkon,
        R.drawable.pepet,
        R.drawable.layar
    };

    public int[] getlist(){
        return listsandhangan;
    }

    public int[] getlist2(){
        return listsandhangan2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listsandhangan.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listsandhangan[i];
    }

    public int getimagejwbn(int i){
        return listsandhangan2[i];
    }

    public int getjumlah(){
        return listsandhangan.length;
    }

    public int getjumlah2(){
        return listsandhangan2.length;
    }
}
