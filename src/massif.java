public class massif {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 15, 17, 19, 20};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        for (int x: array) {
            sum += x;
        }
        System.out.println("среднее значение всех элементов = " + sum/array.length);
    }
}
