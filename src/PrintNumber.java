public class PrintNumber {
    public static void main(String[] args) {
        int x = 20;
        int i;
        boolean num = false;
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                num = true;
                break;
            }
        }
        if (num) {
            System.out.println (x + " составное число");
        } else {
            System.out.println (x + " простое число");
        }
    }
}
