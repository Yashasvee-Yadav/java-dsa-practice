public class secondlargest {
    public static void main(String args[]) {
        int arr[] = { 89, 89, 89, 89, 89};
        int l = arr[0];
        int s = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                s = l;
                l = arr[i];
            } else if (arr[i] > s && arr[i] < l)
                s = arr[i];
        }
        System.out.println("second largest no=" + s);
    }
}