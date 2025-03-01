package iohandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputStream {

	public static void main(String[] args) throws IOException {
		
		// ping pong program
		// quit program when user type quit
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
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
		
		System.out.println("Program Completed..!!");
	}

}
