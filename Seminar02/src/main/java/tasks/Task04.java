package tasks;

/**
 * Реализовать трехмерный вектор.
 * Условие: https://habr.com/ru/post/440436/#20
 * Там есть решение. Сначала попробуйте самостоятельно.
 */
class Vector {
    private double _x;
    private double _y;
    private double _z;

    public Vector(double x, double y, double z) {
        _x = x;
        _y = y;
        _z = z;
    }

    public double len() {
        return Math.sqrt(this.dot(this));
    }

    public double dot(Vector other) {
        return other._x * this._x + other._y * this._y + other._z * this._z;
    }

    public Vector cross(Vector other) {
        double new_x = this._y * other._z - this._z * other._y;
        double new_y = this._z * other._x - this._x * other._z;
        double new_z = this._x * other._y - this._y * other._x;
        return new Vector(new_x, new_y, new_z);
    }

    public double angle(Vector other) {
        return this.dot(other)/(this.len() * other.len());
    }

    public Vector add(Vector other) {
        return new Vector(
                this._x + other._x,
                this._y + other._y,
                this._z + other._z
        );
    }

    public Vector sub(Vector other) {
        return new Vector(
                this._x - other._x,
                this._y - other._y,
                this._z - other._z
        );
    }

    public static Vector[] generate_vectors(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
}

public class Task04 {

}

