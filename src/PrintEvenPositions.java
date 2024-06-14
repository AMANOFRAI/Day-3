public class PrintEvenPositions {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,1,9,8,1,4};
        System.out.print("The elements in the even position are: ");
        for(int i = 0; i < arr.length;i++){
            if (i % 2 == 0){
                System.out.print(arr[i] +" ");
            }
        }
    }

}
