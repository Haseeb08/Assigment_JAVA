package part3;

/*
Create a class with a constructor that takes a String argument. During construction, print the argument.
Create an array of object references to this class, but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */

public class ConstructorInitialize {

    ConstructorInitialize(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args){
        ConstructorInitialize[] References=new ConstructorInitialize[3];
    }
}