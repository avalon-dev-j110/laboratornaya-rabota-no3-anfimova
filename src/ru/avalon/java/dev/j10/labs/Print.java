package ru.avalon.java.dev.j10.labs;

public interface Print {

    default void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length-1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
        }
    }

}
