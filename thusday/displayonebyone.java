package thusday;

import java.util.LinkedList;

public class displayonebyone {

public static void main(String[] args) {
LinkedList<String> linkedlist = new LinkedList<>();

linkedlist.add("red");
linkedlist.add("blue");
linkedlist.add("green");
linkedlist.add("white");

System.out.println("The Linked list is: "+linkedlist);

linkedlist.add(2,"redish");
System.out.println("the list after: "+linkedlist);

for(String m:linkedlist) {
System.out.println(m);
}

}

} 