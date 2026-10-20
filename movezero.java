public class movezero {
    public static void main(String args[]) {
        int arr[] = {0, 9, 2, 0, 5, 1, 0, 7};
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int t = arr[c];
                arr[c] = arr[i];
                arr[i] = t;
                c++;
            }

        }
        System.out.println("array after moving zeroes to the end is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}