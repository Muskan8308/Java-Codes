package iohandling;

import java.io.File;

/*
 												* FILE CLASS (Built-in class)
 	
 	*  We have a java predefined class i.e FILE CLASS to perform operations on files of system.
 	*  exists() -		 This method returns boolean value. If any file, directory or folder exists -> true, otherwise -> false.
 	*  isDirectory() -   This checks only directories is present or not. If present -> true, otherwise -> false.
 	*  mkdir() - 		 This creates a single directory. If the parent directory does not exist, it fails to create the directory. Returns true if the directory is successfully created, otherwise false.
  	*  mkdirs() - 		 This creates the specified directory along with all necessary parent directories. If any parent directory in the path doesn’t exist, it will automatically create them. Returns true if the directory (and any necessary parent directories) is successfully created.

  */
public class AboutFileClass {

	public static void main(String[] args) {

		File f = new File(" /c/Users/Hp/git/Java-Codes/Java/src/iohandling/demo");		// If this path exists -> true
		
		boolean exist = f.exists();
		System.out.println(exist);
		
		if(!exist)
			System.out.println("Path doesn't exist");
		
		boolean dir = f.isDirectory();
		
		if(!exist && !dir) 
		{
			
			boolean mkdir = f.mkdir();
			if(!mkdir)
			{
				boolean mkdirs = f.mkdirs();
				if(!mkdirs)
				{
					System.out.println("There is some error in filesystem");

				}
			}
		}

		System.out.println("Program completed");

	}

}
