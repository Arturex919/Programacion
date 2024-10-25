package Tema2_Ejercicos;

import java.util.Scanner;

public class Tema2_EJ16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System .in);
        double Dolares,Euros,D,E;
        System.out.println("ingrese un valor en Euros");
        Euros= in.nextDouble();
        System.out.println("ingrese un valor en Dolares");
        Dolares=in.nextDouble();
        D= Euros *0.92;
        E=(int)Dolares/1.08;;
        System.out.println("su taza de coversion en Euros a Dolares es :"+ D+"$");
        System.out.println("su taza de coversion Dolares a Euros es :"+ (int)E+"€");
        in.close();
    }
}
