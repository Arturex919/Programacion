package Tema2_Ejercicos;

import java.util.Scanner;
//Realiza un programa que lea 3 números por consola y devuelva el
//mayor de ellos.
public class Tema2_EJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c,mayor;
        System.out.println("ingrese un valor a");
        a = in.nextInt();
        System.out.println("ingrese un valor b");
        b = in.nextInt();
        System.out.println("ingrese un valor c");
        c = in.nextInt();
        mayor =a ;
        if (b>c) {
            mayor = b ;
        }
        if (c>mayor){
            mayor=c ;
        }
        System.out.println("el numero mayor es :"+mayor);

    }
}