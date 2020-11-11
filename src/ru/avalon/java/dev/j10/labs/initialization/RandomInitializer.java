package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

import java.util.Random;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */

public class RandomInitializer implements Initializer {

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */

    int[] random;
    int min;
    int max;

    public RandomInitializer(int[] random, int min, int max) {
        this.random = random;
        this.min = min;
        this.max = max;
    }

    public int[] getRandom() {
        return random;
    }

    public void setRandom(int[] random) {
        this.random = random;
    }

    @Override
    public void initialize(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int sign = random.nextInt(2);
            switch (sign) {
                case 0:
                    array[i] = random.nextInt(50);
                    break;
                case 1:
                    int r = random.nextInt(50);
                    array[i] = r - 2 * r;
                    break;
            }
        }
    }
}
