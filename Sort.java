package in.co.capgemini;

import java.io.File;
import java.util.Scanner;

public class Sort {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter directory");
		String str = src.nextLine();
		
		File file = new File(str);
	
		
		File sub[] = file.listFiles(File::isDirectory);
		
		for(File files : sub) {
			System.out.println(files.getName());
		}
		
		
		System.out.println("Enter extension");
		String str1 = src.nextLine();
		
		src.close();
		File sub1[] = file.listFiles((t,name) -> name.endsWith(str1));
		
		
		
		for(File files : sub1) {
			System.out.println(files.getName());
		}
		
		
	}
}
