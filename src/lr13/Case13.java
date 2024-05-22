package lr13;

public class Case13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);

            int h = 10 / l;  // Может вызвать ArithmeticException, если l == 0
            args[l + 1] = "10";  // Может вызвать ArrayIndexOutOfBoundsException, если l + 1 >= args.length
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
