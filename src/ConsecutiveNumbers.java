public class ConsecutiveNumbers {
    public static int getConsecutiveNumbers(int[] numbers) {
        int count = 0;
        for (int index = 0; index < numbers.length; index++) {
            for (int digit = index + 1; digit < numbers.length; digit++) {
                if(numbers[index] +1 == numbers[digit]){
                    count++;
                }
            }
        }
        return count;
    }
}

