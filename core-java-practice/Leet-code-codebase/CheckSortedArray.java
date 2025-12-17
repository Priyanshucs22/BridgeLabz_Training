public class CheckSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        boolean ok = true;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                ok = false;
                break;
            }
        }

        System.out.println(ok);
    }
}
