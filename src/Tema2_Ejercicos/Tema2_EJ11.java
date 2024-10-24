package Tema2_Ejercicos;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Tema2_EJ11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("ingrese un valor");
        a= in.nextInt();
        System.out.println("ingrese un valor");
        b= in.nextInt();
        System.out.println("ingrese un valor");
        c= in.nextInt();
        if (a==b-1 && c==b+1){
            System.out.println("son consecutivos");
        }else{
            System.out.println("no son consecutivos");
        };


    }
}
