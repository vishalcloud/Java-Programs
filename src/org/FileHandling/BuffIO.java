package org.FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BuffIO {


	public void buff() throws IOException
	{
	        		
		FileInputStream fin = new FileInputStream("test1.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		try{
			int i=0;
			while((i = fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			fin.close();
			bin.close();
		}
	}
	public void fileIoStream() throws IOException
	{
		FileInputStream fin = new FileInputStream("test1.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
	
		try {
			//	FileInputStream fin = new FileInputStream("test.txt");
				int i = 0;
				while ((i = fin.read()) != -1) {
			//		System.out.print((char) i);
				}
		}
				catch(Exception e)
				{
					System.out.println(e);
				}
				finally{
					fin.close();
				}
				
	
	
	}
	
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		
		BuffIO b = new BuffIO();
		b.buff();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		System.out.println("\n\n\n\n\n total time:");
		System.out.println(totalTime);
		

		long startTime1 = System.currentTimeMillis();
		
		
		//
		BuffIO f = new BuffIO();
		f.fileIoStream();
		long endTime1   = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("\n\n\n\n\n");
		System.out.println(totalTime1);
		

		
				
	}

}
