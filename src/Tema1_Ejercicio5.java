package Tema1_Ejercicios;

public class Tema1_Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("1. 24%5 = "+24%5);
        System.out.println("2. 7 / 2 + 2.5 = " + 7 / 2 + 2.5);
        System.out.println("3. 10.8 / 2 + 2 = " + 10.8 / 2 + 2);
        System.out.println("4.( 4 + 6 ) * 3 + 2 * ( 5 - 1 )="  +( 4 + 6 ) * 3 + 2 * ( 5 - 1 ));
        System.out.println("5. 5 / 2 + 17 % 3 = " + 5 / 2 + 17 % 3 );
        boolean opera6=  7 >= 5 || 27 != 8;
        System.out.println("6.  7 >= 5 OR 27 <> 8 = " + opera6);
        boolean opera7= (45 <= 7) || ! ( 5 >= 7) ;
        System.out.println("7. (45 <= 7) OR NOT ( 5 >= 7 )=" + opera7 );
        System.out.println("8. 27 % 4 + 15 / 4 = " +7%4+15/4);
        System.out.println("9. 37/4 * 4-2 = " +(37 / 4 * 4 - 2));
        boolean opera10 =(25 >= 7) && ! (7 <=2);
        System.out.println ("10. (25 >= 7) AND NOT (7 <=2)= " + opera10);
        boolean opera11 =('H' < 'J') && ('9' != '7');
        System.out.println("11. ('H' < 'J') AND ('9' <> '7') ="+ opera11 );
        boolean opera12= (25 > 20 && 13 > 5);
        System.out.println("25 > 20 AND 13 > 5 = "+ opera12 );
        boolean opera13 = ( 10 + 4 < 15 - 3 && 2 * 5 + 1 > 14 - 2 * 2) ;
        System.out.println("13. 10 + 4 < 15 - 3 OR 2 * 5 + 1 > 14 – 2 * 2 = " + opera13);
        boolean opera14= (4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1) ;
        System.out.println("13. 4 * 2 <= 8 OR 2 * 2 < 5 AND 4 > 3 + 1= "+ opera14);
        boolean opera15= ( 10 <= 2 * 5 && 3 < 4 || ! (8>7) && 3 * 2 <= 4 * 2 - 1);
        System.out.println("15. 10 <= 2 * 5 AND 3 < 4 OR NOT (8>7) AND 3 * 2 <= 4 * 2 - 1= "+ opera15);


    }


}