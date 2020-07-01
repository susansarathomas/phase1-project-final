package final1.choose;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public void deleteExist() {
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
			System.out.println("\nEnter file name to be Deleted: ");
			String filename = reader.nextLine();
			for(String file:lists){
				if(file.equals(filename)){
					flag=1;
				}
			}
			File f= new File(currentDirectory,filename); 
			if(flag==1){
				if(f.delete())            //returns Boolean value  
				{  
					System.out.println(f.getName() + " deleted");   //getting and printing the file name  
				}  
				else  
				{  
					System.out.println("Failed to delete "+filename+" is a directory and contains files inside it");  
				}  
			}
			else{
				System.out.println("File not found,as ");
			}
		}
		catch(Exception e)  
		{  
			e.printStackTrace();  
		} 

	}  	
}
