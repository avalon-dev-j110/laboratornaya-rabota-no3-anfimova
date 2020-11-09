package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Initializer;
import ru.avalon.java.dev.j10.labs.Sort;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;

/**
 * Пузырьковая сортировка (англ. bubble sort).
 *
 * <p>Простой алгоритм сортировки. Для понимания и
 * реализации этот алгоритм — простейший, но эффективен он
 * лишь для небольших массивов. Сложность алгоритма: O(n^2).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC">Пузырьковая сортировка</a>
 */
public class BubbleSort implements Sort{

    int[] bubble;

    public BubbleSort(int[] array) {
        this.bubble = array;
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int shiftCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[i+1]) {
                    int smallest;
                    smallest = array[i+1];
                    array[i+1] = array[i];
                    array[i] = smallest;
                    shiftCount ++;
                }
            }
            if (shiftCount == 0) {
                int[] newArray = array;
            }

        }
    }
}
