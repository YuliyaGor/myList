package myList;

/**
 * Created by Yuliya on 16.05.2015.
 */
public class MainList {
    public static void main(String[] args) {

        DynamicStringList myList = new DynamicStringList();

        myList.add("first");
        myList.add("second");
        myList.add("third");
        myList.add("fourth");

        System.out.println("original size:______" + myList.size());
        System.out.println("empty:______________" + myList.empty());
        System.out.println("get last:___________" + myList.get());
        System.out.println("get on the index:___" + myList.get(2));
        System.out.println("remove last:________" + myList.remove());
        System.out.println("remove on the index:" + myList.remove(0));

        System.out.println("toString:___________" + myList.toString());
        System.out.println("contains 'third':___" + myList.contains("third"));
        System.out.println("contains '444':_____" + myList.contains("444"));

        System.out.println("delete:_____________" + myList.delete());
        System.out.println("delete size:________" + myList.size());

    }
}
