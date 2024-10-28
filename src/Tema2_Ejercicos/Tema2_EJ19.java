package Tema2_Ejercicos;

import java.util.Scanner;

public class Tema2_EJ19 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("los numeros pares del 1 al 1000 son") ;
       for ( int a=2; a  <= 1000; a+=2 ){
            System.out.println(a);
        }
       in.close();
    }
}





