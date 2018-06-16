package Assignment9;

import java.util.InputMismatchException;
import java.io.IOException;
import java.util.*;
import java.io.FileReader;
import java.io.File;

public class Question1
{

	public static void main(String args []) throws IOException 
	{
		int a;
		FileReader b = null;
		File f=new File("C:\\Users\\kunal Pahwa\\Desktop\\demo.txt");
		
		try
		{
			b=new FileReader(f);
			while((a=b.read()) >= 0) 
			{
			   System.out.print((char)a);
			}
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Incorrect");
		}
		finally
		{
		   if(b != null)
		   b.close();
		}
	}
}