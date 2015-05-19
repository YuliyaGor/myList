package myList;

import java.util.ArrayList;

/**
 * Created by Yuliya on 16.05.2015.
 */
public class MainList {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList();

        Integer x = 5;
        Integer y = 6;

        myList.add(4);
        myList.add(5);
        myList.add(1);
        myList.add(9);

        System.out.println(myList.size());
        System.out.println(myList.empty());
        myList.remov(y);
        myList.remov(x);
        myList.remov(0);
        System.out.println(myList.toString());
        System.out.println(myList.contains(4));
        System.out.println(myList.contains(9));

    }
}
