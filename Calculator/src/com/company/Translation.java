package com.company;

    class Translation {           //клас що конвертує число з римської системи в арабську

    private int b;                //поле з результатом, яке повертатимемо

    int toTranslate (String a){   //метод, який перевіряє яким є римське число та присвоює полю з результатом відповідне арабське

        switch (a){               //перевіряємо оператором switch case
            case "I":
                b = 1;
                break;
            case "II":
                b = 2;
                break;
            case "III":
                b = 3;
                break;
            case "IV":
                b = 4;
                break;
            case "V":
                b = 5;
                break;
            case "VI":
                b = 6;
                break;
            case "VII":
                b = 7;
                break;
            case "VIII":
                b = 8;
                break;
            case "IX":
                b = 9;
                break;
            case "X":
                b = 10;
                break;
        }

        return b;         //повертаємо результат
    }
}
