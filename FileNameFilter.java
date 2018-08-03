package in.co.capgemini;

import java.io.File;
import java.security.spec.EncodedKeySpec;
import java.util.Scanner;

public class FileNameFilter {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter directory");
		String str = src.nextLine();
		
		File file = new File(str);
		
		
		System.out.println("Enter extension");
		String str1 = src.nextLine();
		
		src.close();
		File sub[] = file.listFiles((t,name) -> name.endsWith(str1));
		
		
		
		for(File files : sub) {
			System.out.println(files.getName());
		}
	}
}
