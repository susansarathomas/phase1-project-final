package final1.client;

import java.io.IOException;
import java.util.*;

import final1.choose.AddFile;
import final1.choose.DeleteFile;
import final1.choose.SearchFile;
import final1.option1.DisplayFile;

public class Lockers {
	
	public static void main(String[] args) throws Exception  {
		int choice,option;
		String ans ;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n                       APP NAME          \n\n            DEVELOPER NAME:SUSAN SARA THOMAS");
		
		do {
			System.out.println("\n1:->Return Current File Name\n\n2:->Add File To Existing Directory\n  ->Delete A User Specific File\n  ->Search User Specific File From Main Directory\n\n3:->Close Application");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice){
				case 1:DisplayFile df=new DisplayFile();
						df.displayAllFile();
						break;
				case 2:do{
						System.out.println("\n1.Add File To Existing Directory\n2.Delete A User Specific File\n3.Search User Specific File From Main Directory\n4.CLOSE");
						System.out.println("\nEnter your option:");
						option=sc.nextInt();
						switch(option){
							case 1:AddFile a=new AddFile();
									a.addNew();
									break;
							case 2:DeleteFile d=new DeleteFile();
									d.deleteExist();
									break;
							case 3:SearchFile s=new SearchFile();
									s.search();
									break;
						
							}
							
					}while(option!=4);
					break;
				
			}	
		
		}while(choice!=3);
	}
}
	

	

