package HomeWorkColab.carpet;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {

    public static void main(String[] args) {

        persianCarpetTask carpet1 = new persianCarpetTask();
        carpet1.setInfo(5,8,25,true);

        persianCarpetTask carpet2 = new persianCarpetTask();
        carpet2.setInfo(2,7,32,false);

        persianCarpetTask carpet3 = new persianCarpetTask();
        carpet3.setInfo(5,6,34,true);

        persianCarpetTask carpet4 = new persianCarpetTask();
        carpet4.setInfo(6,2,18,false);

        persianCarpetTask carpet5 = new persianCarpetTask();
        carpet5.setInfo(4,4,24,true);

        persianCarpetTask[] arr = {carpet1,carpet2,carpet3,carpet4,carpet5};

        ArrayList<persianCarpetTask> persianCarpetTasks = new ArrayList<>(Arrays.asList(arr));
        persianCarpetTasks.removeIf(p -> !p.isPersian == true);
        System.out.println(persianCarpetTasks);

        ArrayList<persianCarpetTask> regularCarpets = new ArrayList<>(Arrays.asList(arr));
        regularCarpets.removeIf(p -> !p.isPersian == false);
        System.out.println(regularCarpets);

        System.out.println("------------------------");

        carpet3.calcCost();
        carpet4.calcCost();



    }
}
