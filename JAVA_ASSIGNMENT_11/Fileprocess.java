package assignment_11;

import java.io.*;
import java.util.*;

public class Fileprocess {
	HashMap<Character,Integer> map = new HashMap<Character,Integer>(); ;
	StringBuffer fileContent=new StringBuffer();
	
	public Fileprocess(File file) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader(file));
	String input=null;
	while ((input = br.readLine()) != null)
	{	
		fileContent.append(input.toLowerCase());
	}
	br.close();
	

	}
	
	public void createMap()  {
		
		for(int i=0;i<fileContent.length();i++) {
			char ch = fileContent.charAt(i);
		if(Character.isLetter(ch)) {	
			if(map.keySet().contains(ch)) 
				map.put(ch,map.get(ch)+1);
			else
				map.put(ch, 1);	
			}
		}
		//System.out.println(map.toString());
	}
	
public void createOutputFile() throws IOException {
	StringBuffer content=new StringBuffer();
		for(char ch : map.keySet())
			content.append("Character '"+Character.toUpperCase(ch)+"' or '"+ch+"' occured "+map.get(ch)+" times.\n");
		System.out.println(content);
		BufferedWriter writer = new BufferedWriter(new FileWriter("/home/abdul/eclipse-workspace/Assignments/src/assignment_11/output.txt"));
	    writer.write(content.toString());
	    writer.close();
	}

	
}
