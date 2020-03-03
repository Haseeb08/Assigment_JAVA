package part4;

/*
Create a class with a constructor that takes a String argument.
During construction, print the argument.
Create an array of object references to this class, but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization messages from the constructor calls are printed.
Complete the previous exercise by creating objects to attach to the array of references.
 */
public class ConstructorInitializeWithObjects {
    ConstructorInitializeWithObjects(String message){
        System.out.println(message);
    }
    public static void main(String args[]){
        ConstructorInitializeWithObjects[] References=new ConstructorInitializeWithObjects[3];
        for(int i=0;i<3;i++){
            References[i]=new ConstructorInitializeWithObjects("Objects");
        }
    }
}

/*
	OUTPUT
	Objects
	Objects
	Objects

*/