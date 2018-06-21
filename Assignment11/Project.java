package Assignment11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
public class Project {
	
	File fil = new File("C:\\Users\\kunal Pahwa\\eclipse-workspace\\AcadView\\src\\Assignment11\\abc.txt");
	ArrayList<File> array_list = new ArrayList<>();
	public void recursion(File dir) throws FileNotFoundException
	{
		File[] files = dir.listFiles();
//		System.out.println(files[1]);
		if(files==null)
			return;
		for(File i : files)
		{
			if(i.isDirectory())
			{
				recursion(i);
			}
			else
			{
				array_list.add(i);
			}
		}
	}
	public void loop() throws IOException
	{
		FileReader fr = new FileReader(fil);
		BufferedReader br = new BufferedReader(fr);
		String path = br.readLine();
		while(path!=null)
		{
			File CurrentDir = new File(path);
			recursion(CurrentDir);
			path = br.readLine();
		}
		br.close();
	}
	public void create() throws IOException
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the path to which you want to create csv file");
//		String s=sc.nextLine();
//		
		
		File f = new File("C:\\Users\\kunal Pahwa\\eclipse-workspace\\AcadView\\src\\Assignment11\\result.csv");
		FileWriter flw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(flw);
		for(File files : array_list)
		{
			bw.write("NAME: " + files.getName()+",");
			bw.write("PATH: " + files.getPath());
			bw.newLine();
			System.out.println("File Name: " + files.getName() + "    Path: " + files.getPath());
		}
		System.out.println();
		System.out.println();
		System.out.println("csv file created.");
		bw.close();
	}
	public static void main(String[] args) throws IOException {		
		Project pr = new Project();
		pr.loop();
		pr.create();
	}
}