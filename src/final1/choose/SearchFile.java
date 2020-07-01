package final1.choose;

import java.io.File;
import java.util.*;

public class SearchFile {
	
	public void search() {
		
		int flag=0;
		String[] lists;
		Scanner reader=new Scanner(System.in);
		try {
		String currentDirectory = System.getProperty("user.dir");
		System.out.println("The current working directory is " + currentDirectory);	
		File ff=new File(currentDirectory);
		lists=ff.list();

		for(String l:lists) {
			System.out.println(l);
		}
		System.out.println("Enter file name to be Searched ");
		String filename = reader.nextLine();
		for(String file:lists){
			if(file.equals(filename)){
				flag=1;
			}
		}
		//System.out.println(flag);
		File f = new File(ff,filename);
		if(flag==1){
			if (f.exists()) {
					System.out.println("File  exists");

				} 
				else {
					
		            
				}
    
		}
		else{
			System.out.println("No such file exists");
		}
		}
		catch (Exception e) { 
		    System.err.println(e.getMessage()); 
		} 
		// close Scanner to prevent resource leak
	   // reader.close();
			
	}	

}
