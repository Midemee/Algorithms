public class SumCubes {
    public static int getSumOfCubes(int number){
        int sum = 0;
        for(int index = 1; index <= number; index++){
            sum += (index * index * index);
        }
        return sum;
    }

    public static void main (String[] args){
        System.out.println(getSumOfCubes(3));
    }
}
