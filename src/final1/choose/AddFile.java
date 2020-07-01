package final1.choose;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {

	public void addNew() throws IOException{
		String currentDirectory = System.getProperty("user.dir");
		System.out.println("The current working directory is " + currentDirectory);
		
		Scanner reader = new Scanner(System.in);
		boolean success = false;

		//System.out.println("Enter path of directory to which u want to add a new file");
		//String dir = reader.nextLine();

		//Checking if the directory exist
		File directory = new File(currentDirectory);
   
		if (directory.exists()) {
       
			System.out.println("Directory exists ");

		} 
		else {
			System.out.println("Directory does not exists");
			System.exit(1);
		}

		// Creating new file in Java, only if not exists
		System.out.println("Enter file name to be created :");
		String filename = reader.nextLine();

		File f = new File(directory,filename);

		if (f.exists()) {
			System.out.println("File already exists");

		}
		else {
			System.out.println("File doesnot exists, creating it now");
			success = f.createNewFile();
			if (success) {
				System.out.printf("Successfully created new file %s%n",f);
			} else {
				System.out.printf("Failed to create new file %s%n",f);
			}
		}

		//reader.close();
	}

	

	
}
	

