package Lr7.Exampl1;

// Суперкласс
class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void setText() {
        this.text = "Текст по умолчанию";
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLength() {
        return text.length();
    }
}

// Подкласс
class SubClass extends SuperClass {
    private int number;

    public SubClass(int number, String text) {
        super(text);
        this.number = number;
    }

    // Перегрузка метода setText
    public void setText(int number) {
        this.number = number;
    }

    // Перегрузка метода setText из суперкласса
    @Override
    public void setText(String text) {
        super.setText(text);
    }

    // Перегрузка метода setText из суперкласса
    public void setText(String text, int number) {
        super.setText(text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class Example2 {
    public static void main(String[] args) {
        // Создание объекта суперкласса
        SuperClass superClass = new SuperClass("Привет, мир!");

        // Вызов методов суперкласса
        superClass.setText();
        System.out.println("Длина СуперКласса: " + superClass.getLength());

        superClass.setText("Новый текст");
        System.out.println("Длина СуперКласса: " + superClass.getLength());

        // Создание объекта подкласса
        SubClass subClass = new SubClass(42, "Текст СубКласса");

        // Вызов методов подкласса
        subClass.setText();
        System.out.println("Длина СубКласса: " + subClass.getLength() + ", Номер: " + subClass.getNumber());

        subClass.setText("Текст нового СубКласса");
        System.out.println("Длина СубКласса: " + subClass.getLength() + ", Номер: " + subClass.getNumber());

        subClass.setText(99);
        System.out.println("Длина СубКласса: " + subClass.getLength() + ", Номер: " + subClass.getNumber());

        subClass.setText("Другой текст", 77);
        System.out.println("Длина СубКласса: " + subClass.getLength() + ", Номер: " + subClass.getNumber());
    }
}

