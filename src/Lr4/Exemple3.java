package Lr4;

import java.util.Scanner;

public class Exemple3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите ширину прямоугольника: ");
        int width = id.nextInt();
        System.out.print("введите высоту прямоугольника: ");
        int height = id.nextInt();
        int [][] graph = new int [height][width];
        int z = 0;
        for (int i =0; i < height; i++){
            for (int j = 0; j <width; j++){
                graph[i][j] = 2;
            }
        }
        for (int i =0; i < height; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j <width; j++){
                System.out.print(graph[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
