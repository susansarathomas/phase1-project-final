package final1.option1;

import java.io.File;
import java.util.Arrays;

public class DisplayFile {
	
	public void displayAllFile(){
		
		String[] lists;
			
		try {
			String currentDirectory = System.getProperty("user.dir");
			System.out.println("The current working directory is " + currentDirectory);	
			File ff=new File(currentDirectory);

			// Get the Name of the given file f 
			lists = ff.list(); 
			System.out.println("List of files in current directory:");

			// Display the file Name of the file object
			Arrays.sort(lists);
			
			for(String l:lists) {
				System.out.println(l);
			}
		} 
		catch (Exception e) { 
			System.err.println(e.getMessage()); 
		} 
					
	}
}
