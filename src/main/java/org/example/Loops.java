package org.example;

import java.util.Arrays;

public class Loops {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        /*

        for(int i = 0; int < 10; i++) {
        //define coi=unter;
        /condition
        // increment
        //
        }

         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello ");

        }
        //nubmers[0] =1
        //numbers[]


        for (int i = 0; i < 2; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
        String[] names = {"Alex", "Jura", "Andrew", "Nora", "Dima", "Igor", "Nikita", "Liz", "Vova", "Edgar"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Nora")) {
            } else {
                System.out.println(names[i]);
            }

        }
//do, do while
        /*
        do {
        //code to be executed
        }(while is true)
         */

       /* int i = 1;
        do {
            System.out.println(i);
        }while(i < 10);

        */

        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;

        }

        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];

        // move numbers from arrayOfNum to emptyArray using loop


        for (int j = 0; j < arrayOfNum.length; j++) {
            emptyArray[j] = arrayOfNum[j];
        }
        System.out.println(Arrays.toString(emptyArray));





        }


    }
















