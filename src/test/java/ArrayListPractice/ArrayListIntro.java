package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {

        int[] nums = new int[10];//size is 10 and is fixed
        System.out.println(Arrays.toString(nums));
        System.out.println("index 2" + nums [2]);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(20);

        System.out.println(numbers);
        System.out.println(numbers.get(2));

        for (int i = 0; i <numbers.size()-1 ; i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println();

        for (Integer each : numbers){
            System.out.println(each);
        }

        System.out.println("________________________________");
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));


        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,2,3,4,5,6,7,8,9) //NO!
        list.addAll(numbers);
        list.addAll(Arrays.asList(10, 11, 12, 13, 14, 15));

        System.out.println(list);


    }
}
