package org.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public void fcopy() throws IOException {
		FileInputStream fin = new FileInputStream("testop.txt");
		FileOutputStream fout = new FileOutputStream("DestinationFile.txt");
		System.out.println("Contents of Source File :" );
		int i;
		while ((i = fin.read()) != -1) {
			System.out.print((char) i);
		}
		int i1 = 0;
		while ((i1 = fin.read()) != -1) {
			fout.write((byte) i1);
		}
		System.out.println("\n \n \n Contents Copied into File DestinationFile.txt : ");
		FileInputStream fin1 = new FileInputStream("DestinationFile.txt");
		int j;
		while ((j = fin1.read()) != -1) {
			System.out.print((char) j);
		}
		fin.close();
		fin1.close();
	}

	public static void main(String[] args) throws IOException {

			FileCopy f = new FileCopy();
			f.fcopy();
	}

}
