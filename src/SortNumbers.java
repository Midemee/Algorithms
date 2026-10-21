import java.util.Arrays;
//Arithmetic Sorting
public class SortNumbers {
    public static int[] getSortNumbers(int [] numbers){
        for(int index = 0; index < numbers.length; index++){
            for(int inner = index+1; inner < numbers.length; inner++){
                if (numbers[index] < numbers[inner]) {
//                    numbers[index] = numbers[index] + numbers[inner];
//                    numbers[inner] = numbers[index] - numbers[inner];
//                    numbers[index] = numbers[index] - numbers[inner];

                    //Bubble sorting
                    int temp = numbers[index];
                    numbers[index] = numbers[inner];
                    numbers[inner] = temp;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args){
        int [] numbers = {5, 8, 9, 3, 2};
        System.out.println(Arrays.toString(getSortNumbers(numbers)));
    }
}
