package mycode;
import java.util.Arrays;

public class SortedNames {
    public static void main(String[] args) {
       // if (args.length == 0) {
            //System.out.println("No names provided.");
           // return;
        //}

        // Copy the names from command line arguments to an array
        String[] names = {"john","alice","david"};

        // Sort the names
        Arrays.sort(names);
        System.out.println("This program is solved by vishal gupta , roll no 118");

        // Print the sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
