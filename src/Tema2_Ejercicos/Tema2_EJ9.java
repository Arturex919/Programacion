package Tema2_Ejercicos;

import java.util.Scanner;

public class Tema2_EJ9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double a,b;
        System.out.println("inserte el valor en dolares");
        a= in.nextDouble();
        b= a /1.08;
        System.out.println("su valor en euros es= "+b);
    }
}

