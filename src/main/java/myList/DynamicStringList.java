package myList;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Yuliya on 16.05.2015.
 */
public class DynamicStringList implements SimpleList {

    private static String[] EMPTY_LIST = {};

    private static String[] elementList;

    private int size;

    public DynamicStringList() {
        this.elementList = EMPTY_LIST;
        this.size = elementList.length;
    }

    public DynamicStringList(int size) {
        this.elementList = new String[size];
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void add(String element) {

        int newSize = this.size + 1;

        String[] tempList = new String[newSize];

        if (this.size > 0) {
            for (int i = 0; i < size; i++) {
                tempList[i] = elementList[i];
            }
        }

        tempList[newSize - 1] = (String) element;

        this.elementList = tempList;
        this.size = newSize;
    }

    public String get() {
        if (!empty()) {
            return elementList[size - 1];
        } else {
            return "";
        }
    }

    public String get(int id) {
        if (validateIndex(id)) {
            return elementList[id];
        } else {
            return "";
        }
    }

    public String remove() {
        String deleted = "";
        if (!empty()) {

            int newSize = this.size - 1;

            String[] tempList = new String[newSize];

            int iTemp = 0;
            for (int i = 0; i < newSize; i++) {
                tempList[iTemp] = elementList[i];
                iTemp++;
            }
            deleted = elementList[size - 1];
            this.elementList = tempList;
            this.size = newSize;
        } else {
            System.out.println("remove: element not found");
        }
        return deleted;
    }

    public String remove(int index) {

        String deleted = "";

        if (validateIndex(index)) {

            int newSize = this.size - 1;

            String[] tempList = new String[newSize];

            int iTemp = 0;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    deleted = elementList[i];
                    continue;
                } else {
                    tempList[iTemp] = elementList[i];
                    iTemp++;
                }
            }

            this.elementList = tempList;
            this.size = newSize;
        }

        return deleted;
    }

    public boolean delete(){
        this.elementList = EMPTY_LIST;
        this.size = 0;
        return true;
    }

    @Override
    public String toString() {

        String result = "";

        if (this.size == 0) {
            result = "[]";
        } else {
            for (int i = 0; i < size; i++) {
                if (elementList[i] == null) {
                    result = result + "[null]";
                } else {
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
            System.out.println("index is incorrect");
        }

        return result;
    }

}
