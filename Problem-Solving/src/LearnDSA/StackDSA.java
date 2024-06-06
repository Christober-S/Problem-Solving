package LearnDSA;

import java.util.Stack;

public class StackDSA {
    public static void main(String[] args) {

        //Stack declearation.
        Stack<String> stack = new Stack<String>();

        //Stack push method .
        stack.push("Chris");
        stack.push("Java");
        stack.push("Python");
        stack.push("Go lang");

        //Stack to check whether the stack is empty. using empty() method.
        System.out.println(stack.empty());

        //To print the stack
        System.out.println(stack);

        //It will remove the last value from the stack and store in the decleared variable
        String lastValue = stack.pop();
        System.out.println(lastValue);


        //To remove the last element
        stack.pop();

        //To know the top most value of stack we can use peek() method
        System.out.println(stack.peek());

        //To search the value in the stack. It will return the number in which our data is present in the stack
        System.out.println(stack.search("Chris"));
        System.out.println(stack);



    }
}
