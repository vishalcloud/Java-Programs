//file Handling implementation using FileOutPutStream and FileInputStream

package org.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoStreamDemo {

	public static void main(String args[]) {
		//output to file
		try {
			FileOutputStream fout = new FileOutputStream("testop.txt");
			String s = "*Integreted Decisions And Systems,Pune India";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("successfully Written to file testop.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
		//Input to file
		try {
			FileInputStream fin = new FileInputStream("testop.txt");
			int i = 0;
			System.out.println("\n \n Contents of file testop.txt are :");
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
