package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	
	public File createFile(String filename)
	{
		File f = new File(filename);
		if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return f;
	}
	
	public static void main(String[] args) {
		
		String filename = "SampleFile.txt";
		FileHandling fh = new FileHandling();
		
		File file = fh.createFile(filename);
		System.out.println("Created file with name 'SampleFile.txt'\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to write to the file");
		String input = sc.nextLine();
		
		fh.writeToFile(file, input);
		System.out.println("\nInput text is successfully written to file");
		
		String data = fh.readFile(file);
		System.out.println("\nThe below message is read from file:");
		System.out.println(data);
		
		System.out.println("\nEnter the text to append to the file");
		String input1 = sc.nextLine();
		fh.appendToFile(file, input1);
		
		String data1 = fh.readFile(file);
		System.out.println("\nThe below message is read from file after appending:");
		System.out.println(data1);
		
		sc.close();
		
	}
	public void writeToFile(File file,String input)
	{
		try {
			
			FileOutputStream fos = new FileOutputStream(file); 
			
			byte b1[]=input.getBytes(); 
			fos.write(b1);
			
			fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
	}
	
	public String readFile(File file)
	{
		String text="";
		try {
			
			FileInputStream fis = new FileInputStream(file);
			int b;
			while((b=fis.read())!=-1)
			{
				text= text+(char)b;
			}
			fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
		return text;
	}
	
	public void appendToFile(File file,String input)
	{
		try {
			
			FileWriter fw = new FileWriter(file,true);
			fw.append(input);
			fw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
	}
}
