package iohandling;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 							-----------------------FILE INPUT/OUTPUT IN CHARACTER DATA------------------------
 * 
 * FileWriter - It is a predefined class in java to write character data in a file. 
 * FileReader - It is a predefined class in java to read character data from a file. 
 * 
 */


public class FileIOchar {

	public static void main(String[] args) {
		
		/* 		 To write character data in a file 		 */

		String filePath = "C://Users//Hp//git//Java-Codes//Java//src//iohandling//myfile2";
		
		try(FileWriter writer = new FileWriter(filePath))
		{
			writer.write("hello world");
			writer.write('a');			
			writer.write(new char[] {'e','a','i'});
//			writer.write(new String[] {"hii", "bye", "shy"});			❌ This is not applicable in write method

			writer.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
		System.out.println("File creation and written successfully");

		
		/* 		 To read character data from a file 		 */
		
		try(FileReader reader = new FileReader(filePath))
		{
			int read = -1;
			do 
			{
				read = reader.read();
				if(read != -1)
				{
					System.out.print((char) read + " ");		// Since read returns a integer value so we have to cast it in charater to read its value.

				}
			} while(read != -1);
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
		
		System.out.println("\nFile read successfully !!!!");

		
	}

}
