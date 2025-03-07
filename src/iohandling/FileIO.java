/*
 * 							----------Input/Output in Files----------
 * 
 * This program demonstrates reading a file (an image in this case) using FileInputStream.
 * It reads the image file byte by byte and prints each byte's integer value to the console.
 * read() - It returns -1 if there is no byte present inside the file.
 * 
 */

package iohandling; 

import java.io.InputStream; 		// Importing InputStream for reading data
import java.io.FileInputStream; 	// FileInputStream is used for reading file content
import java.io.OutputStream;		// Importing OutputStream for writing data
import java.io.FileOutputStream;	// FileOutputStream is used for writing file content
import java.io.IOException; 		// IOException is handled in case of file reading errors

public class FileIO { 
	
	/* -------------Binary Data---------------
	 * 				To Read File 			*/

    public static void main(String[] args) { 

//      readFile();
//    	reading();
    	
    	writeInFile();
    	
    }
    
    
    static void readFile()
    {
    	 // Define the file path of the image to be read
        String imageFilePath = "D:\\Users\\HP\\Pictures\\1660291168307.jpg";

        // Try-with-resources to automatically close InputStream after execution
        try (InputStream is = new FileInputStream(imageFilePath)) { 

            int read = -1; // Variable to store each byte read from the file

            // Loop to read file content byte by byte
            do {
//                read = is.read(); // Read one byte from the file

                // We can also make a buffered array to use CPU processing, efficiently.
                byte[] buffer = new byte[8192];			// size of 16 bytes
            	read = is.read(buffer);
                
                if (read != -1) {
                    System.out.println("Bytes read from file at once : " + read); 
                }
            } while (read != -1); // Continue reading until end of file (-1) is reached

        } catch (IOException ex) { // Catch any IO exceptions
            System.out.println("Exception ==> " + ex.getLocalizedMessage()); // Print exception message
        }
    }
    
    // Again did this for practice.
    static void reading()
    {
    	String imageFilePath = "D:\\Users\\HP\\Pictures\\1660291168307.jpg";
    	
    	
    	try(InputStream ir = new FileInputStream(imageFilePath))
    	{
    		int read = -1;
    		
    		do
    		{
//    			To read byte one by one
//    			read = ir.read();
    			
//    			To read byte by using buffered array
    			byte[] buffer = new byte[8192];
    			read = ir.read(buffer);
    			if(read != -1)
    			{
    				System.out.println(read);
    			}
    		}
    		while(read != -1);
    	}
    	catch(IOException ex)
    	{
			System.out.println(ex.getMessage());

    	}
    	
    }
    
    
    /* ---------------------To write data in file ------------------------ */
    
    static void writeInFile()
    {
    	String filePath = "C://Users//Hp//git//Java-Codes//Java//src//iohandling//myfile";
    	
    	try(OutputStream os = new FileOutputStream(filePath))
    	{
    		byte[] values = new byte[] {34,67,85,92,12,56}; 
//    		for(byte v : values)
//    		{
//    			os.write(v); 		// Writing data one by one
//    		}
    		
//    		We can also do the above by using byte array. By doing this, we passed the whole array at once i.e its whole values.
    		os.write(values);
    		
    		os.flush(); 			// Flush() - This will flush the data in physical medium means it will actual write the data in file. 
    	}
    	catch(IOException e)
    	{
			System.out.println(e.getMessage());

    	}
    	
    }
    
    
    
    
    
}
