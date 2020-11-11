package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application{

    public static void main(String[] args){

    	int[] array = new int[20];

		FibonacciInitializer fibonacci = new FibonacciInitializer(array);
		fibonacci.initialize(array);
		fibonacci.print(array);
		System.out.println(sumArray(array));

		RandomInitializer random = new RandomInitializer(array, -50, 50);
		random.initialize(array);
		random.print(array);

		int[] bubble = random.getRandom();
		BubbleSort bubbleSort = new BubbleSort(bubble);
		bubbleSort.sort(bubble);
		bubbleSort.print(bubble);

		int[] selection = random.getRandom();
		SelectionSort selectionSort = new SelectionSort(selection);
		selectionSort.sort(selection);
		selectionSort.print(selection);

		int[] shell = random.getRandom();
		ShellSort shellSort = new ShellSort(shell);
		shellSort.sort(shell);
		shellSort.print(shell);

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }

    public static int sumArray(int[] array) {
    	int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
    	return sum;
	}

}
