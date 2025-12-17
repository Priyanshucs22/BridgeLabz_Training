public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int l = 0, r = a.length - 1;

        while (l < r) {
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }

        for (int x : a) System.out.print(x + " ");
    }
}
