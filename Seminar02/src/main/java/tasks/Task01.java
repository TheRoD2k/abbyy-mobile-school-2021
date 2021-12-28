package tasks;

public class Task01 {

    /**
     * Возвращает минимальное значение из массива.
     * Не использовать стандартную библиотеку!
     */
    public static int min(int[] ints) {
        if (ints.length == 0) {
            return -1;
        }
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return min;
    }

    public static float average(int[] ints) {
        if (ints.length == 0) {
            return -1.0f;
        }
        float current_sum = 0.0f;
        for (int item : ints) {
            current_sum += item;
        }
        return current_sum/ints.length;
    }

}
