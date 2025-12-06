package Advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylists {
    //resizable array that stores objects
    //Arrays are fixed but arraylist can change
    //here we use wrapper classes object instead of normal variables
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //methods
        list.add(3);   //adding the elements
        list.add(4);
        list.add(5);

        list.removeFirst();  //removing the elements
        list.remove(2);

        list.set(0, 25); //we use set to set in element in the index

        System.out.println(list.get(1)); // we use get to retrive the element

        System.out.println(list.size());  //this gives the size of the arraylist list


        //for sorting in arraylist we use collection
        Collections.sort(list);
    }
}
