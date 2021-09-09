package com.company;

public class Main {

    public static void main(String[] args) {

        String day = "Wednesday";
        String month = "September";
        int date = 8;
        int year = 2021;

        Task_1 opgave1 = new Task_1();
        opgave1.printAmerican(day , month , date, year);
        opgave1.printEu(day , month , date , year);

        /*Opgave 3 Output
        No, I wug.
        You wugga wug.
        I wug.
         */

        //Opgave 4

        int test;


        // System.out.println(test);

         //The value is not Initialized

        System.out.println("Boo!" +7);

        // you make it all a string adding "7" to the end its goes from right to left

        /*
        Opgave 5;
        Just for
        any not more
        it's breakfast
        !
         */

        Task_6 Opgave6 = new Task_6();

        double svar = Opgave6.multiadd(1.0 , 2.0 ,3.0);

        System.out.println(svar);

        // 6.4

        System.out.println("\nOpgave 6.4");

        double ssvar = Math.sin(Math.PI / 4 );
        double bsvar = (Math.cos(Math.PI / 4 )) / 2;
        double rsvar = ssvar + bsvar;

        System.out.println(rsvar);

        System.out.println( Math.log(10) + Math.log(20));


        //metoden ligger i Task_6
        System.out.println( Opgave6.expsum(1.0));








    }

}
