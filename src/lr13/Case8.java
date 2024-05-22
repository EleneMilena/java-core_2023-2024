package lr13;

public class Case8 {

    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
            return 2;  // Возвращаемое значение из блока finally
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
