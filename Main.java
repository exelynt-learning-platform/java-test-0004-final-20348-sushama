public class Main {

    private static final int BASE = 4;

    public static void main(String[] args) {

        int size = 2 * BASE - 1;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(BASE - min + " ");
            }
            System.out.println();
        }
    }
}
