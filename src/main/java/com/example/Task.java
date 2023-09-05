package com.example;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) {
            Random random=new Random();

            int[] ar = new int[15];
            for(int i = 0; i <  ar.length; i++) {
              ar[i]=random.nextInt(-23, 23);
                System.out.println(ar[i]);
            }
            int min=ar[0];
            int max=ar[0];
            for(int i = 1; i <  ar.length; i++) {
              min=Math.min(min,Math.abs(ar[i]));
              max=Math.max(max,Math.abs(ar[i]));
            }
            System.out.println("Минимальное по модулю число в массиве - "+min+ "\nМаксимальное по модулю - "+max);
        }
}
