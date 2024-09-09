public class Multiples {

    public static void main(String[] args) {
        int multiple_count = 0;
        int upper_bound = 1000;

        for (int i = 0; i < upper_bound; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiple_count++;
            }
        }
        System.out.println(multiple_count);
    }

}
