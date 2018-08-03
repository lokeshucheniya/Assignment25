package in.co.capgemini;

import java.io.File;
import java.util.Scanner;

public class FileFilter {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter directory");
		String str = src.nextLine();
		
		src.close();
		
		File file = new File(str);
		
		File sub[] = file.listFiles(File::isDirectory);
		
		for(File files : sub) {
			System.out.println(files.getName());
		}
		
		
	}
	
}
