public class EvenNumbers {
    public static void getEvenNumbers(){
        int index;
        for(index = 1; index <=10; index++){
            if(index % 2 == 0){
                System.out.println(index);
            }
        }
    }

    public static void main(String[] args){
        getEvenNumbers();
    }
}
