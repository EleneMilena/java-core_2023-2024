package Lr9;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
public class Example15 {
    public static void main(String[] args) {
        int elementsCount = 11_000_000;

        // Create ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Fill ArrayDeque with elements
        for (int i = 0; i < elementsCount; i++) {
            arrayDeque.add("Value" + i);
        }

        // Measure start time
        long startTime = System.nanoTime();

        // Perform get operation by index (inefficient for ArrayDeque)
        int indexToGet = elementsCount / 2;
        String value = getElementAtIndex(arrayDeque, indexToGet);

        // Measure end time
        long endTime = System.nanoTime();

        // Calculate duration and print result in milliseconds
        long duration = (endTime - startTime) / 1_000_000;
        System.out.println("Time taken to get element by index: " + duration + " ms");
    }

    // Inefficient method to get element by index in ArrayDeque
    private static <E> E getElementAtIndex(ArrayDeque<E> arrayDeque, int index) {
        if (index < 0 || index >= arrayDeque.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Convert ArrayDeque to array and access element by index
        return (E) arrayDeque.toArray(new Object[0])[index];
    }
}