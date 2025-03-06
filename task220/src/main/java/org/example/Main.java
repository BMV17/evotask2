package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] myMas = new int [20];
        for (int i= 0; i<20; i++){
            myMas[i]=(int)(Math.random()*15+1);
        }
        System.out.println(Arrays.toString(myMas));

        int count = 0;
        int j = 1;
        while(j<= 15){
            for(int i=0; i<20; ++i){
                if (myMas[i]==j)
                    count+=1;
                }
            if(count>1)
            System.out.println("Число '"+ j + "' встречается "+ count + " раза");
            count=0;
            j++;
            }
        }

        // }
    }
