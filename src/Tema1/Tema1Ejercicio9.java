package Tema1_Ejercicio5;

import java.util.Scanner;
public class Tema1Ejercicio9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int a= in.nextInt();
        System.out.println("ingrese un numero");
        int b= in.nextInt();
        int c =a+b ;
        int d= a*b ;
        int e =a-b ;
        int f =a/b ;
        int g =a%b;
        System.out.println("la suma es= "+ c);
        System.out.println("el producto es ="+d);
        System.out.println("la resta es = "+e);
        System.out.println("la division es ="+f);
        System.out.println("el resto es = "+g);
        in.close();
    }
}
