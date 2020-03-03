package assignment_10;

import java.util.*;

public class Slist {
	int data;
    Slist next;
    public void iterator(){
        Sliterator iter=new Sliterator();
        iter.add(1);
        iter.add(2);
        iter.add(3);
        iter.add(4);
        iter.add(5);
        iter.displayList();
        iter.remove();
        iter.displayList();
    }
    public static void main(String args[]){
        Slist sl=new Slist();
        sl.iterator();
    }
}
