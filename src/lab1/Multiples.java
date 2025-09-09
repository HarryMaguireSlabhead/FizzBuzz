package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count + " integers below 1000 are greater than 0 and are multiples of 3 or 5");
    }
}
