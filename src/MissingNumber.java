public class MissingNumber{

    public static int getMissingNumber(int [] arr){
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return total - sum;
    }

}