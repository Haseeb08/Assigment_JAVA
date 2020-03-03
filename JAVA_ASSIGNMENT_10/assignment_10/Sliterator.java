package assignment_10;

import java.util.*;

public class Sliterator {
	 
	Slist head;
	
	 public void add(int data){
	        if(head==null){
	        	head=new Slist();
	        	head.data=data;
	        	head.next=null;
	        }
	        
	        else{
	            Slist LNode=head;
	            while(LNode.next!=null){
	                LNode=LNode.next;
	            }
	            Slist newNode=new Slist();
	            newNode.data=data;
	            newNode.next=null;
	            LNode.next=newNode;
	        }
	 } 
	 
	/* public void remove() {
		// Slist LNode=head;
		 if(head==null)
			 System.out.println("List is emplty.");
		 else {
			 head=head.next;
		 }
	 }
	 */
	    public void displayList(){
	        while(head!=null){
	            System.out.println(head.data);
	            head=head.next;
	        }
	    }
	    
	     }
