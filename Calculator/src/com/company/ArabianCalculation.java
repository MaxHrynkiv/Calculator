package com.company;

class ArabianCalculation implements Calculation {   //клас що викликає метод обчислення арабської системи і виводить фінальний результат

    static int resultArabian;                       //поле фінального резульату

    public void calculate() {

        Action action = new Action();                                                        //створюємо екземпяр класу що обчислює
        int resultArabian = action.whichAction(EnterSystem.a, EnterSystem.b, EnterSystem.c); //викликаємо його метод, що обчислює і повертає результат

        System.out.println("Your result is " + resultArabian);                               //виводимо результат

        Again again = new Again(); //створюємо екземпляр класу Again що дозволяє перезапустити програму
        again.oneMoreTime();       //викликаємо його метод, що це реалізовує
    }
}