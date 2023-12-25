package Lr3;

public class Main {
    public static void main(String[] args) {
        Studentov Ivanov = new Studentov();
        Studentov Sidorov = new Studentov();
        Ivanov.Sdano = 11;
        Ivanov.NeSdano = 13;
        Ivanov.Dolg = 9;
        Sidorov.Sdano = 3;
        Sidorov.NeSdano = 11;
        Sidorov.Dolg = 22;
        int per = Ivanov.Vsego() + Sidorov.Vsego() - 1;
        System.out.println(per);
    }

    static class Studentov {
        public int Sdano;
        public int NeSdano;
        public int Dolg;

        public int Vsego()
        {
            Sdano = Sdano + 1;
            NeSdano = NeSdano - 3;
            return Sdano + NeSdano + Dolg;
        }
    }
}