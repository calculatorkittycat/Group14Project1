package Tv2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,4));
        int n = 2;

        list.removeIf( p -> p.equals(n));
        System.out.println(list);

    }
}
