package iohandling;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.HttpURLConnection;


										/*  	READ/WRITE FROM NETWORK		  */

public class NetworkReadWrite {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.google.com/");
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();		// to open a connection
		
		conn.setRequestMethod("GET");		// sets the method as GET
		
		try(InputStream is = conn.getInputStream())
		{
			String response = convertInputStreamToString(is);
			System.out.println("Response from google : " + response);

		}
		
		conn.disconnect();
		System.out.println("Program completed...");

	}
	
	private static String convertInputStreamToString(InputStream is) throws IOException
	{
		
		StringBuilder sb = new StringBuilder();
		
		int read = -1;
		do 
		{
			read = is.read();
			if(read != -1)
				sb.append((char) read);
		}
		while(read != -1);
		
		return sb.toString();
	}

}
