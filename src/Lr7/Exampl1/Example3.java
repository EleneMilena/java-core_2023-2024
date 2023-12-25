package Lr7.Exampl1;

// Суперкласс
class SuperclassEx3 {
    protected int intValue;

    // Конструктор с одним параметром
    public SuperclassEx3(int value) {
        this.intValue = value;
    }

    // Метод для присваивания значения полю
    public void setValue(int value) {
        this.intValue = value;
    }

    // Метод toString
    public String toString() {
        return "Суперкласс: intValue=" + intValue;
    }
}

// Подкласс 1
class Subclass1 extends SuperclassEx3 {
    protected char charValue;

    // Конструктор с двумя параметрами
    public Subclass1(int intValue, char charValue) {
        super(intValue);
        this.charValue = charValue;
    }

    // Перегруженный метод для присваивания значений полям
    public void setValue(int intValue, char charValue) {
        super.setValue(intValue);
        this.charValue = charValue;
    }

    // Переопределенный метод toString
    public String toString() {
        return "Подкласс1: intValue=" + intValue + ", charValue=" + charValue;
    }
}

// Подкласс 2
class Subclass2 extends Subclass1 {
    protected String stringValue;

    // Конструктор с тремя параметрами
    public Subclass2(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);
        this.stringValue = stringValue;
    }

    // Перегруженный метод для присваивания значений полям
    public void setValue(int intValue, char charValue, String stringValue) {
        super.setValue(intValue, charValue);
        this.stringValue = stringValue;
    }

    // Переопределенный метод toString
    public String toString() {
        return "Подкласс2: intValue=" + intValue + ", charValue=" + charValue + ", stringValue=" + stringValue;
    }
}

public class Example3 {
    public static void main(String[] args) {
        // Создание объектов
        SuperclassEx3 superClassEx3Obj = new SuperclassEx3(10);
        Subclass1 subclass1Obj = new Subclass1(20, 'A');
        Subclass2 subclass2Obj = new Subclass2(30, 'B', "Hello");

        // Вывод значений через метод toString
        System.out.println(superClassEx3Obj.toString());
        System.out.println(subclass1Obj.toString());
        System.out.println(subclass2Obj.toString());
    }
}
