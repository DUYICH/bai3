import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println("Số ngẫu nhiên là: " + num);
        System.out.println("Số đó là số nguyên tố ? " + checkSNT(num));

    }

    public static boolean checkSNT(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2 && num >= 2) {
            return true;
        }
        return false;
    }
}
