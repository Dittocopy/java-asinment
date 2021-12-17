package thusday;

import java.util.LinkedList;

public class display { 
public static void main(String[]args) {
LinkedList<String> linklist=new LinkedList<String>();
linklist.add("mayuri");
linklist.add("tambe");
linklist.add("dog");
System.out.println("linklist is: "+linklist);
for(int i=0; i<linklist.size();i++) {
System.out.println("position of elements: "+i+" "+linklist.get(i));
}
}
}