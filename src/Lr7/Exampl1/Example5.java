package Lr7.Exampl1;

import java.util.Scanner;

class SuperclassEx5 {
    protected String textField;

    public SuperclassEx5(String textField) {
        this.textField = textField;
    }

    public void displayInfo() {
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("Text Field: " + textField);
    }
}

class Subclass1Ex5 extends SuperclassEx5 {
    protected int integerField;

    public Subclass1Ex5(String textField, int integerField) {
        super(textField);
        this.integerField = integerField;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Integer Field: " + integerField);
    }
}

class Subclass2Ex5 extends SuperclassEx5 {
    protected char charField;

    public Subclass2Ex5(String textField, char charField) {
        super(textField);
        this.charField = charField;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Char Field: " + charField);
    }
}

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text for obj1: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter integer for obj1: ");
        int integer1 = scanner.nextInt();

        System.out.print("Enter text for obj2: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String text2 = scanner.nextLine();
        System.out.print("Enter char for obj2: ");
        char char2 = scanner.next().charAt(0);

        Subclass1Ex5 obj1 = new Subclass1Ex5(text1, integer1);
        Subclass2Ex5 obj2 = new Subclass2Ex5(text2, char2);

        // Проверка метода displayInfo для каждого объекта
        System.out.println("Displaying info for obj1:");
        obj1.displayInfo();
        System.out.println("\nDisplaying info for obj2:");
        obj2.displayInfo();

        // Вызов метода через объектную переменную суперкласса
        SuperclassEx5 superclassEx5Ref;

        superclassEx5Ref = obj1;
        System.out.println("\nDisplaying info through superClassRef (obj1):");
        superclassEx5Ref.displayInfo();

        superclassEx5Ref = obj2;
        System.out.println("\nDisplaying info through superClassRef (obj2):");
        superclassEx5Ref.displayInfo();

        // Закрытие Scanner
        scanner.close();
    }
}
