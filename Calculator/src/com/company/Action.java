package com.company;

    class Action {             //клас що проводить обчислення

    private int result = 0;    //поле з результатом, яке повератимемо

    int whichAction (int a, int b, char c){   //метод який отримує числа та знак операції, перевіряючи знак - робить відповідне обчислення і присвоює відповідному полю результат

        switch (c){                 //перевіряємо знак та проводимо обчислення
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            default:
                System.out.println("Incorrect symbol");  //на випадок невірного знака
                Again again = new Again();  //створюємо екземпляр класу Again що дозволяє перезапустити програму
                again.oneMoreTime();        //викликаємо його метод, що це реалізовує
        }

        return result;  //повертаємо поле з результатом
    }
}
