package Tema2_Ejercicos;

import java.util.Scanner;

public class Tema2_EJ5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in) ;
        double a,b,c,media ;
        int d ;
        System.out.println("ingrese un valor para a");
        a= in.nextDouble() ;
        System.out.println("ingrese un valor para b");
        b=in.nextDouble() ;
        System.out.println("ingrese un valor para c");
        c=in.nextDouble() ;
        media= (a+b+c) / 3 ;
        d =(int)(media);
        System.out.println("el valor de la media con decimales es : "+media);
        System.out.println("el valor de la media sin decimales es : "+d);
        in.close();


    }
}
