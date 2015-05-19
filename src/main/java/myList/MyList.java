package myList;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Yuliya on 16.05.2015.
 */
public class MyList<T> {

    private static Object[] EMPTY_LIST = {};

    private static Object[] elementList;

    private int size;

    public MyList() {
        this.elementList = EMPTY_LIST;
        this.size = elementList.length;
    }

    public MyList(int size) {
        this.elementList = new Object[size];
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void add(T element) {

        int newSize = this.size + 1;

        Object[] tempList = new Object[newSize];

        if (this.size > 0) {
            for (int i = 0; i < size; i++) {
                tempList[i] = elementList[i];
            }
        }

        tempList[newSize - 1] = element;
        this.elementList = tempList;
        this.size = newSize;
    }

    public void remov(Object element) {

        if (contains(element)) {

            int newSize = this.size - 1;

            Object[] tempList = new Object[newSize];

            int iTemp = 0;
            for (int i = 0; i < size; i++) {
                if (elementList[i].equals(element)) {
                    continue;
                } else {
                    tempList[iTemp] = elementList[i];
                    iTemp++;
                }
            }

            this.elementList = tempList;
            this.size = newSize;
        } else {
            System.out.println("remov: element not found");
        }

    }

    public void remov(int index) {

        if (validateIndex(index)) {

            int newSize = this.size - 1;

            Object[] tempList = new Object[newSize];

            int iTemp = 0;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    continue;
                } else {
                    tempList[iTemp] = elementList[i];
                    iTemp++;
                }
            }

            this.elementList = tempList;
            this.size = newSize;
        }
    }

    public String toString() {

        String result = "";

        if (this.size == 0) {
            result = "[]";
        } else {
            for (int i = 0; i < size; i++) {
                if(elementList[i] == null) {
                    result = result + "[null]";
                }else {
                    result = result + "[" + elementList[i].toString() + "]";
                }
            }
        }

        return result;
    }

    public boolean contains(Object element) {

        boolean result = false;
        if (element == null) {
            for (int i = 0; i < this.size; i++) {
                if (elementList[i] == null) {
                    result = true;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (elementList[i].equals(element)) {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean validateIndex(int ind) {

        boolean result = false;

        if (ind >= 0 && ind < size) {
            result = true;
        } else {
            System.out.println("remov: index is incorrect");
        }

        return result;
    }
}
