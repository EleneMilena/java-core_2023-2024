package Lr7.Exampl1;

// Суперкласс
class Superclass {
    private String text;

    // Конструктор с одним текстовым параметром
    public Superclass(String text) {
        this.text = text;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Суперкласс: " + text;
    }
}

// Подкласс, наследующийся от суперкласса
class Subclass extends Superclass {
    private String additionalText;

    // Конструктор с одним текстовым параметром
    public Subclass(String text) {
        super(text);
    }

    // Конструктор с двумя текстовыми параметрами
    public Subclass(String text, String additionalText) {
        super(text);
        this.additionalText = additionalText;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        if (additionalText != null) {
            return "Подкласс: " + super.toString() + ", Дополнительный текст: " + additionalText;
        } else {
            return "Подкласс: " + super.toString();
        }
    }
}

// Тестирование классов
public class Example1 {
    public static void main(String[] args) {
        Superclass superClassInstance = new Superclass("Привет, Суперкласс!");
        Subclass subClassInstance1 = new Subclass("Привет, Подкласс!");
        Subclass subClassInstance2 = new Subclass("Привет, Подкласс с дополнительным текстом!", "Дополнительный текст");

        System.out.println(superClassInstance.toString());
        System.out.println(subClassInstance1.toString());
        System.out.println(subClassInstance2.toString());
    }
}
