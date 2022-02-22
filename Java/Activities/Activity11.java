package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {

        Map<Integer,String> colours = new HashMap<Integer,String>();
        colours.put(1,"Violet");
        colours.put(2,"Indigo");
        colours.put(3,"Blue");
        colours.put(4,"Green");
        colours.put(5,"Yellow");

        System.out.println("Current Map: " + colours);
        colours.remove(2);

        if(colours.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }

        System.out.println("Size of the Map: " + colours.size());

    }
}
