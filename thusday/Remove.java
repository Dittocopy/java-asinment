package thusday;

import java.util.LinkedList;

public class Remove {
public static void main (String[] args) {

// Creating an LinkedList
LinkedList<String> list = new LinkedList<String>();

//add elements in the list
list.add("good");
list.add("achieve");
list.add("goals");
list.add("2020");
list.add("2021");

// Displaying the list
System.out.println("LinkedList:" + list);

System.out.println("The last element is removed:" + list.removeLast());

System.out.println("Final LinkedList: "+ list);

System.out.println("The first element is removed:" + list.removeFirst());

System.out.println("Final LinkedList:\t" + list);
}
}