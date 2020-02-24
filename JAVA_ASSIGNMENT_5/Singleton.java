public class Singleton {
    String str;
    public static Singleton initialize(String input){
       // str=input;
        Singleton object = new Singleton();
        return object;
    }
    public void printString(){
        System.out.println(str);
    }
}
/*  This piece of code will give a compile time error.
    Non-static field 'str' cannot be referenced from a static context.
    Clearly variable str of type String is a non-static variable and initialize method is a static method.
    Static fields and methods are for whole class(common for all instances) ,
    so any Static method cannot modify the non-static field value.

    To solve this error :
    Instance of singleton class is initiated in static method and str variable can be accessed through it.
 */
