package com.kb.game;

import java.util.Random;

public class Lotto {
    int lotto[]=new int[6];
    final int MAX = 10;

    boolean duplicate(int limit, int key) {
        for (int i = 0; i < limit; i++) {
            if (lotto[i] == key)
                return true;
            return false;
        }



    public void start(){
        int cnt = 0;
        Random rand = new Random();
        int r;
        while(cnt<6){
            r = rand.nextInt(MAX)+1;
            if (duplicate(cnt, r)==false){
            lotto[cnt]=r;
            cnt++;
            }
        }
        output();
        }



    }

    void output() {
        System.out.println("Lotto: ");
        for(int i=0; i<6; i++){
            System.out.printf("%4d", lotto[i]);
        }
        System.out.println();
    }
}
