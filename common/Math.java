package common;

public class Math {

    public int abs(int value) {
        return value < 0 ? -value : value;
    }

    public float abs(float value) {
        return value < 0 ? -value : value;
    }

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.abs(-10));
    }
}
