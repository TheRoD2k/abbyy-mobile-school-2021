package tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Напишите класс, конструктор которого принимает два массива:
 * массив значений и массив весов значений.
 * Класс должен содержать метод, который будет возвращать элемент
 * из первого массива случайным образом, с учётом его веса.
 * Пример:
 * Дан массив [1, 2, 3], и массив весов [1, 2, 10].
 * В среднем, значение «1» должно возвращаться в 2 раза реже,
 * чем значение «2» и в десять раз реже, чем значение «3».
 */
class RandomFromArray {
    private int[] _vals;
    private int[] _weights;
    private int _weights_sum;

    public RandomFromArray(int[] vals, int[] weights) {
        _vals = vals;
        _weights = weights;
        // Just wanted to use this functionality instead of a for loop.
        _weights_sum = Arrays.stream(weights).sum();
    }

    public int get_weighted_random() {
        // Weights-storing architecture, saves the memory
        // (compared with saving n copies of one value in the array,
        // but hits the performance
        int generated_weight = (int)(Math.random() * _weights_sum);

        int index = -1;
        while (generated_weight > 0) {
            generated_weight -= _weights[++index];
        }
        return _vals[index];
    }
}

public class Task05 {

}
