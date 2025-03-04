package iohandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  												 CLOSING THE RESOURCES 
  												 
	-> Its very neccesary to close the resources to avoid memory leak and ensure efficient resource utilization.
	-> In java, "resources" typically refer to objects that the program uses, such as files, database connections, sockets, or any system-level objects that consume a significant amount of resources.
  												 
 	* 1st approach is the traditional approach for closing the resources i.e using TRY CATCH MECHANISM.
 	
 	* 2nd approach (introduced by JAVA 7) is the more readable and a better approach i.e TRY WITH RESOURCES.
 	
 */

public class ClosingResources {
	
	// 1st approach - using try catch - manually close the resources.
/*
	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			
			// We have to initialize that objects inside the try block.
			ir = new InputStreamReader(System.in);
			br = new BufferedReader(ir);
			
			// logic for ping pong 
			String line = null;
			do{
				line = br.readLine();
				if(!"quit".equalsIgnoreCase(line))
				{
					System.out.println("You have typed : " + line);
				}
			}
			while(line != null && !"quit".equalsIgnoreCase(line));
		}
		catch(IOException ex)
		{
			// We'll handle the exception here...!!
			System.out.println("IO Exception : " + ex.getMessage());
		}
		finally 
		{
			// Now, close all the resources here...!!!
			
			try 
			{
				if(ir != null)
				{
					ir.close();
				}
				if(br != null)
				{
					br.close();
				}
			}
			catch(IOException ex)
			{
				// we generally ignore to handle these exceptions of this catch block.....(actually what we can do here....nothing)
			}
		}
		
		System.out.println("Program Completed..!!");
	}
*/
	
// 2nd approach - Try with resources - no need to manually close the resources - java guarantees to close the resources, itself.
	
	public static void main(String[] args) throws IOException {
			
		
			// we can write multiple statements in the try().
		try (InputStreamReader ir = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(ir)) 
		{
			
			// logic for ping pong 
			String line = null;
			do{
				line = br.readLine();
				if(!"quit".equalsIgnoreCase(line))
				{
					System.out.println("You have typed : " + line);
				}
			}
			while(line != null && !"quit".equalsIgnoreCase(line));
		}
		catch(IOException ex)
		{
			// We'll handle the exception here...!!
			System.out.println("IO Exception : " + ex.getMessage());
		}
		
		System.out.println("Program Completed..!!");
	}


}
