package myList;

/**
 * Created by Yuliya on 20.05.2015.
 */
public interface SimpleList{

    void add(String s);

    String get();

    String get(int id);

    String remove();

    String remove(int id);

    boolean delete();
}
