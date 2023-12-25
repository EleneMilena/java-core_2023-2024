package Lr6;
    public class Example1 {
        private char charField;
        private String textField;

        // Перегруженный метод для присваивания значений полям
        public void assignValue(Object arg) {
            if (arg instanceof Character) {
                // Если аргумент - символ, присваиваем символьному полю
                charField = (char) arg;
            } else if (arg instanceof String) {
                // Если аргумент - строка, присваиваем текстовому полю
                textField = (String) arg;
            } else if (arg instanceof char[]) {
                // Если аргумент - символьный массив
                char[] charArray = (char[]) arg;
                if (charArray.length == 1) {
                    // Если массив состоит из одного элемента, присваиваем символьному полю
                    charField = charArray[0];
                } else {
                    // Если в массиве больше одного элемента, формируем текстовую строку
                    textField = new String(charArray);
                }
            } else {
                // Обработка других случаев, если необходимо
                System.out.println("Неподдерживаемый тип аргумента");
            }
        }

        // Дополнительные методы для получения значений полей (геттеры)
        public char getCharField() {
            return charField;
        }

        public String getTextField() {
            return textField;
        }

        public static void main(String[] args) {
            // Пример использования
            Example1 myObject = new Example1();

            myObject.assignValue('A');
            System.out.println("charField: " + myObject.getCharField());
            System.out.println("textField: " + myObject.getTextField());

            myObject.assignValue("Hello");
            System.out.println("charField: " + myObject.getCharField());
            System.out.println("textField: " + myObject.getTextField());

            myObject.assignValue(new char[] {'B', 'C'});
            System.out.println("charField: " + myObject.getCharField());
            System.out.println("textField: " + myObject.getTextField());
        }
    }
