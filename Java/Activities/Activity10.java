package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Ball");
        hs.add("Cat");
        hs.add("Dog");
        hs.add("Ear");
        hs.add("Friend");

        System.out.println("Size of the HashSet is: " + hs.size());
        System.out.println("Remove an item: " + hs.remove("Cat"));
        System.out.println("Remove an item which is not there: " + hs.remove("Bed"));
        System.out.println("If the item is present in the HashSet: " + hs.contains("Ear"));

        System.out.println("Items in the set currently: " + hs);

    }
}
