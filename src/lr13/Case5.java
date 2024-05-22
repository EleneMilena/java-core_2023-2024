package lr13;

public class Case5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (Exception e) {  // Перехватываются любые исключения
            System.out.println("1");
        }
        System.out.println("2");
    }
}
