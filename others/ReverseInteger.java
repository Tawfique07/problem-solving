package others;

public class ReverseInteger {


    private static int reverseInteger1(int value) {
        int res = 0;
        while (value > 0) {
            res = (res * 10) +  (value % 10);
            value /= 10;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(reverseInteger1(123456));
    }
}
