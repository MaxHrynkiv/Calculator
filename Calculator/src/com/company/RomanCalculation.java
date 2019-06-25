package com.company;

class RomanCalculation implements Calculation{     //клас що викликає методи конвртування систем чисел та обчислення результату і виводить фінальний результат

    static int resultRoman;                        //поле фінального резульату

    public void calculate(){

        Translation translation = new Translation();    //створюємо екземпляр методу що конвертує системи числення
        int a = translation.toTranslate(EnterSystem.d); //передаємо йому перше число, отримуємо у арабській системі
        int b = translation.toTranslate(EnterSystem.e); //передаємо йому друге число, отримуємо у арабській системі

        Action action = new Action();                               //створюємо екземпяр класу що обчислює
        int resultRoman = action.whichAction(a, b, EnterSystem.f);  //викликаємо його метод, що обчислює і повертає результат

        System.out.println("Your result is " + resultRoman);        //виводимо результат

        Again again = new Again();  //створюємо екземпляр класу Again що дозволяє перезапустити програму
        again.oneMoreTime();        //викликаємо його метод, що це реалізовує
    };
}
