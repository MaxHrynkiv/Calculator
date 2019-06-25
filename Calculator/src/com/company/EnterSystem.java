package com.company;

import java.util.Scanner;   //імпортуємо бібліотеку для подальшого вводу даних користувачем

class EnterSystem {         //клас для визначення системи числення, вводу даних та виклику відповідних методів обчислення
    static int a, b;        //створюємо глобальні поля класу для подальшого присвоєння їм введених даних, робимо їх static, щоб мати моджливість напряму звертатись з інших класів
    static String d, e;
    static char c, f;

    void getSystem() {      //метод для визначення системи числення, вводу даних, та виклику методів обрахунку у інших класах

        System.out.println("Welcome to calculator\n" + "If You want to work in arabian system - write 'A', if You want to work in roman system - write 'R'");

        Scanner system = new Scanner(System.in);       //сканер що зчитує тип системи числення і присвоює його полю whichSystem
        String whichSystem;
        whichSystem = system.nextLine();


        if (whichSystem.equals("A")) {                 //умовний оператор що перевіряє систему числення і дозвооляє ввести дані відповідного типу і присвоїти їх полям
            System.out.println("Write first number");
            Scanner arab1 = new Scanner(System.in);
            a = arab1.nextInt();

            System.out.println("Write second number");
            Scanner arab2 = new Scanner(System.in);
            b = arab2.nextInt();

            System.out.println("Write an action ('+','-','*','/')");
            Scanner act = new Scanner(System.in);
            c = act.next().charAt(0);
        }

        else if (whichSystem.equals("R")) {
            System.out.println("Write first number");
            Scanner rom1 = new Scanner(System.in);
            d = rom1.nextLine();

            System.out.println("Write second number");
            Scanner rom2 = new Scanner(System.in);
            e = rom2.nextLine();

            System.out.println("Write an action ('+','-','*','/')");
            Scanner act = new Scanner(System.in);
            f = act.next().charAt(0);
        }



        if (whichSystem.equals("A")) {                                          //умовний оператор що перевіряє систему числення і викликає відповідний метод для обрахунку
            ArabianCalculation arabianCalculation = new ArabianCalculation();   //спочатку створюємо екземпляр класу
            arabianCalculation.calculate();                                     //потім викликаємо його метод

        }
        else if (whichSystem.equals("R")) {
            RomanCalculation romanCalculation = new RomanCalculation();
            romanCalculation.calculate();
        }

        else{
            System.out.println("Incorrect symbol");                               //виводяться, якщо був введений невідомий символ
            Again again = new Again();  //створюємо екземпляр класу Again що дозволяє перезапустити програму
            again.oneMoreTime();        //викликаємо його метод, що це реалізовує
        }
    }
}