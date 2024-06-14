public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 1, 9, 8, 1, 4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is " + max);
    }
}
