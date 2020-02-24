
import java.util.HashSet;

public class CheckString {

   private String input;

   public CheckString(String input){
       this.input=input.toLowerCase();
   }
    public boolean check(){
    //input=input.toLowerCase();

        HashSet<Character> set = new HashSet<Character>();
        for (int i=0;i<input.length();i++) {
            char ch=input.charAt(i);
            if (Character.isAlphabetic(ch))
                set.add(ch);

        }
        if(set.size()==26)
            return true;
        else
            return false;

    }
}
