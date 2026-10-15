public class reverse {
    public static void main(String args[]) {
        int arr[] = { 12, 45, 7, 89, 34 };
        System.out.println("original array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("reversed array is:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}