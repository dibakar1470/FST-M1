package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Monu");
        myList.add("Sonu");
        myList.add("Amit");
        myList.add("Sumit");
        myList.add("Dibakar");

        for (String names:myList) {
            System.out.println(names);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Amit in the list: " + myList.contains("Amit"));
        System.out.println("Size of the ArrayList: " + myList.size());
        myList.remove("Sumit");
        System.out.println("Size of the ArrayList after removing one item: " + myList.size());

    }
}
