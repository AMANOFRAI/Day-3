public class SmallestElement{
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,1,9,8,1,4};
        int min = arr[0];
        for(int i =1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The smallest element in the array is " + min);
    }
}
