package filesandIo;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Arrayss {
    public static void main(String[] args) {
        //Number 1
//        int[] numbers = {70, 85, 92, 60};
//        for(int i = 0; i < numbers.length; i++) {
//            numbers[i] += 60;
//            System.out.println(numbers);
//        }

       //Number 2
//        Object [] names = new Object[3];
//        names[0] = "Ada";
//        names[1] = "tunde";
//        names[2] = 42;
//
//        for (Object name : names) {
//            String objectName = String.valueOf(name);
//            System.out.println(objectName.length());
//        }
//        names[3] = "John";
//        System.out.println(names.length());

        //Number 3
        List<String> names = new ArrayList<>();
        names.add("Ada");
        List<Integer> ages = new ArrayList<>();
        ages.add(19);
        String name = names.get(0);
        Integer age = ages.get(0);
        System.out.println(name + " is " + age + " years old");
        names.add("Zainab");
        System.out.println(names);

        List<String> list= new ArrayList<>(List.of("a", "b", "c", "d"));
        try{
            for (String s: list) {
                if(s.equalsIgnoreCase("b")){
                    list.remove(s);
                }
                System.out.println(list);

            }
        } catch(ConcurrentModificationException exception){
            System.out.println("ConcurrentModificationException");

        }
}
}
