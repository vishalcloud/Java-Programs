package org.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo2 {

	private FileInputStream fout1;



	public void fileTest() throws IOException {
		FileInputStream fin = new FileInputStream("test.txt");
		FileOutputStream fout = new FileOutputStream("testout.txt");
		fout1 = new FileInputStream("testout.txt");

		try {
		//	FileInputStream fin = new FileInputStream("test.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			fin.close();
			System.out.println("File Closed");
		}
		
		try
		{
			String s = "Input string given to file testout.txt";
			byte [] a = s.getBytes();
			fout.write(a);
			
			int i = 0;
			System.out.println("Total available Bytes in file : "+fout1.available());
			while ((i=fout1.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
			
		}
		catch( Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			fout.close();
			System.out.println("\nOP file Closed");
		}
		
	}
	

	
public static void main(String[] Args) throws IOException
	{
	
	FileIo2 f = new FileIo2();
	f.fileTest();
	
	}
}

