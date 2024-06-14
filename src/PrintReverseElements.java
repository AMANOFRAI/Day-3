public class PrintReverseElements{
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,1,9,8,1,4};
        System.out.print("The elements in the reverse order are: ");
        for(int i = arr.length -1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
