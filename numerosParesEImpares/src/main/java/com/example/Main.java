package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int i = 0;

        System.out.println("Introduce un número entero y positivo: ");
        numero= sc.nextInt();

        while (i <= numero) {
            
            if (i % 2 == 0) {
                System.out.println(i + "es par.");
            }else{
                System.out.println(i + "es impar.");
            }

            i++;
        }
    }
}