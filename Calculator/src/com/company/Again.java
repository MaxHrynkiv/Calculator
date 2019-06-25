package com.company;

import java.util.Scanner;

class Again {                                    //клас що дозволяє перезапустити програму після її виконання
     void oneMoreTime (){                         //метод що це реалізовує шляхом введення рішення, перевірки цього рішення через if та перезапуску програми через клас EnterSystem

        System.out.println("One more time? (Y/N)");

        Scanner again = new Scanner(System.in);
        char answer;
        answer = again.next().charAt(0);

        EnterSystem enterSystem = new EnterSystem();

        if (answer == ('Y')){
            enterSystem.getSystem();
        }
        else if (answer == ('N')){
            System.out.println("Have a nice day!");
        }
        else{
            System.out.println("Incorrect symbol");
        }
    }
}
