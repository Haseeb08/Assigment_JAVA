import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String input;
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        input=sc.nextLine();
        CheckString s1=new CheckString(input);

       // double startTime=System.nanoTime();
        System.out.println("The entered string contains all alphabets[A-Z] :  "+s1.check());
        //double endTime=System.nanoTime();
        //System.out.println("HashSet"+(endTime-startTime)/1000000000);
    }
}
/*
Time complexity : O(n);
Explanation :  we need to traverse the whole input string of length n gives Time complexity as O(n) and time complexity
 is constant O(1) for Hashset related operations so Time complexity will remain O(n).

Space complexity : O(1);
The space (memory) required is always(atmost) 26*(Size of Char) because we are creating a set of non-repeated characters.
 */
/*
OUTPUT:

Enter a string :
Hello Zemoso,123,@#hello
The entered string contains all alphabets[A-Z,a-z] :  false

Enter a string :
The quick brown fox jumps over the lazy dog
The entered string contains all alphabets[A-Z,a-z] :  true

 */