package assignment_11;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = null;
		if (0 < args.length) 
		   file = new File(args[0]);
		 else
		 { System.out.println("Inavild Argument as file.");
		 	return ;
		 }
		 
		Fileprocess fp= new Fileprocess(file);

		fp.createMap();
		fp.createOutputFile();
		
	}
}
