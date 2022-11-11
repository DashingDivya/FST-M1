package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("D");
        hs.add("I");
        hs.add("V");
        hs.add("Y");
        hs.add("A");
        hs.add("E");

        //Print HashSet
        System.out.println("Original HashSet: " + hs);
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());

        //Remove element
        System.out.println("Removing E from HashSet: " + hs.remove("E"));
        //Remove element that is not present
        if(hs.remove("V")) {
            System.out.println("V removed from the Set");
        } else {
            System.out.println("V is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if M is present: " + hs.contains("M"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}