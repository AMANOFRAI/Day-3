public class AscendingOrder{
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 1, 9, 8, 1, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("The sorted array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
