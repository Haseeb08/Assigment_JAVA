public class Data {
    int var1;
    char var2;
    public void printVar(){
        System.out.println(var1 +" "+var2);
    }
    /*public void printLocalVar(){
        int localvar1;
        char localvar2;
        System.out.println(localvar1 +" "+localvar2);
    }*/

   /* The above method will raise compile-time errors.
      * As local Variables are not initialized ,
      * such variables do not have default values like member variables.
      * Local variables have to be initialized in java.

     * To resolve the error :
     * Initialize local variables to their default values.
     * int localVariable1=0;
     * char localVariable2='\0';

    */

 }

