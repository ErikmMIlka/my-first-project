package classroom;

import java.util.Arrays;

public class Varriebledatabase {
    public static void main(String[] args) {
        // bite datatype
        byte  myCurrentAge = 24;
        System.out.println("My age is" + myCurrentAge);
         short salary = 1000;
        System.out.println(salary);
        char firstNameLetter = 'E';
        System.out.println("FIrst Letter " + firstNameLetter);
        int dateOfBrith = 1337;
        System.out.println(dateOfBrith );
        long populationOfLatvija = 120000000;
        System.out.println("PopOfLat " +  populationOfLatvija);
        //float System = 21.1f;
        boolean isWInter = false;
        boolean isSpring = true;
        boolean basApples = true;
        System.out.println(isSpring);
        // string
        String name = "Erix";
        String surname = "Milka";

        String fullName = name + " " +  surname;
       System.out.println(fullName);



       String fullNameWithAge = fullName + myCurrentAge;


        System.out.printf("My full name is: %s. I am %d years_old",fullName,myCurrentAge);



        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
      //  System.out.println("20" * "10"); TExt * Text""


//division
        c = a / b;
        System.out.println(c);

        double result = (double) a / b;
        System.out.println(result);


 // %
        int number = 10 % 9;
        System.out.println(number);



        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));






    }
}

