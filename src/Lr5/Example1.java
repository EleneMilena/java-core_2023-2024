package Lr5;

public class Example1 {
    public static void main(String[] args) {
        Example ExampleN = new Example();
        ExampleN.viewCode();

        ExampleN.Set('A');
        System.out.println("Char code = " + ExampleN.getCodeSymbol()+"\n");

        ExampleN.viewCode();
    }
}
class Example {
    private char ch;
    public void Set(char ch1) {
        this.ch = ch1;
    }
    public int getCodeSymbol() {
        return (int) ch;
    }
    public void viewCode() {
        System.out.println("ch1 = " + ch);
        //int code = ch;
        System.out.println("ch1 = " + getCodeSymbol()+"\n");
    }
}
