package Assignment10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment10 {
		public static void wri() throws IOException {
			File f1 = new File("C:\\Users\\kunal Pahwa\\eclipse-workspace\\AcadView\\src\\Assignment10\\abc.txt");
			File f2 = new File("C:\\Users\\kunal Pahwa\\eclipse-workspace\\AcadView\\src\\Assignment10\\xyz.txt");
			FileInputStream fin = new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			try {
				int c;
				while((c=fin.read()) != -1) {
					fout.write((char)c);
					
				}
			}
			catch(Exception e) {
				System.out.println("Excpetion Occured");
			}
			finally {
				fin.close();
				fout.close();
			}
		}
		public static void main(String[] args) throws IOException {
			
			wri();
			
		}

	
}
