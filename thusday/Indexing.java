package thusday;

import java.util.LinkedList;

public class Indexing {

public static void main(String[] args) {
LinkedList<String> linklist=new LinkedList<String>();
linklist.add("Mayuri");
linklist.add("Tambe");
linklist.add("1011");
System.out.println("linklist is: "+linklist);
for(int i=0; i<linklist.size();i++) {
System.out.println("position of elements: "+i+" "+linklist.get(i));
}

}

} 