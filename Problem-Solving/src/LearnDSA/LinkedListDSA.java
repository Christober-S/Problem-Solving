package LearnDSA;

import java.util.LinkedList;

public class LinkedListDSA {
    public static void main(String[] args) {

        // To declear a linkedList
        LinkedList <String> linkedList = new LinkedList<String>();


        //Linkedlist as a stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("E");
//        linkedList.push("F");

        //  To remove element from the linkedlist in stack method
//        linkedList.pop();
//        System.out.println(linkedList);


        //Linkedlist as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");

        //To remove element as a queue from linkedlist
//        linkedList.poll();

        //To add element in  the linkedlist in specific index
//        linkedList.add(4, "R");

        //To remove the specifi index
//        linkedList.remove("R");

        //To know the specific value index
//        System.out.println(linkedList.indexOf("F"));
//        System.out.println(linkedList);

        // It will return the first value of the linkedlist
//        System.out.println(linkedList.peekFirst());

        // It will return the last value of the linkedlist
//        System.out.println(linkedList.peekLast());

        //Add value to the head
        linkedList.addFirst("0");
        //Add value to the tail
        linkedList.addLast("G");


        // To add values to the linkedList
//        linkedList.add("A");
//        linkedList.add("B");
//        linkedList.add("D");
//        linkedList.add("E");
//        linkedList.add("F");

        //To remove the values from the LinkedList
//        linkedList.poll();
//
//        System.out.println(linkedList);
    }
}
