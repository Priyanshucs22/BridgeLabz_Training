public class LargestElement {
    public static void main(String[] args) {
        int[] a = {3, 7, 2, 9, 5};
        int mx = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > mx) mx = a[i];
        }

        System.out.println(mx);
    }
}
