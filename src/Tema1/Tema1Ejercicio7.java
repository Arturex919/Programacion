package Tema1_Ejercicios;

import java.util.Scanner;
public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a,b;
        System.out.println("esrbir un valor de 1 a 6");
        a= in.nextInt();
        if (a<1 || a > 6 ) {
            System.out.println("el valor ingresado esta mal debe ser un numero de 1 a 6");
        } else {
             b = (7 - a);
            System.out.println("la pantalla la cara opuesta del dado es = " + b);
        }
        in.close();
}
        }