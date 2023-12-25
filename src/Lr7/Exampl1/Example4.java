package Lr7.Exampl1;

import java.util.Scanner;

// Основной класс с символьным полем
class BaseClass {
    public char charField;

    public BaseClass(char charField) {
        this.charField = charField;
    }

    // Конструктор создания копии
    public BaseClass(BaseClass original) {
        this.charField = original.charField;
    }
}

// Второй класс с текстовым полем
class SecondClass extends BaseClass {
    public String textField;

    public SecondClass(char charField, String textField) {
        super(charField);
        this.textField = textField;
    }

    // Конструктор создания копии
    public SecondClass(SecondClass original) {
        super(original);
        this.textField = original.textField;
    }
}

// Третий класс с целочисленным полем
class ThirdClass extends SecondClass {
    public int intField;

    public ThirdClass(char charField, String textField, int intField) {
        super(charField, textField);
        this.intField = intField;
    }

    // Конструктор создания копии
    public ThirdClass(ThirdClass original) {
        super(original);
        this.intField = original.intField;
    }
}

public class Example4 {
    public static void main(String[] args) {
        // Ввод данных для создания объекта третьего класса
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char charInput = scanner.next().charAt(0);
        System.out.print("Enter a text: ");
        String textInput = scanner.next();
        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();

        // Создание объекта третьего класса
        ThirdClass obj1 = new ThirdClass(charInput, textInput, intInput);

        // Создание копии объекта третьего класса
        ThirdClass obj2 = new ThirdClass(obj1);

        // Вывод значений полей объекта
        System.out.println("Original object: " + obj1.charField + ", " + obj1.textField + ", " + obj1.intField);
        System.out.println("Copied object: " + obj2.charField + ", " + obj2.textField + ", " + obj2.intField);
    }
}
