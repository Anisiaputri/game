package com.example.emo.gamepembelajaran;

import java.util.Random;

public class Kata {
    private int listkata[]= {
        R.drawable.pop_kaki,
        R.drawable.pop_kuku,
        R.drawable.pop_kuping,
        R.drawable.pop_mata

    };

    private int listkata2[]= {
        R.drawable.kaki,
        R.drawable.kuku,
        R.drawable.kuping,
        R.drawable.mata
    };


    public int[] getlistkata(){
        return listkata;
    }
    public int[] getlistkata2(){
        return listkata2;
    }

    public int getrandomkata(){
        int rnd = new Random().nextInt(listkata.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listkata[i];
    }

    public int getimagejwbn(int i){
        return listkata2[i];
    }

    public int getjumlah(){
        return listkata.length;
    }

    public int getjumlah2(){
        return listkata2.length;
    }
}




