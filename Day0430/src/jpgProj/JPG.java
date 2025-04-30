package jpgProj;

import java.io.File;
import java.util.Scanner;

public class JPG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File input;
		
		while(true) {
			System.out.println("변환할 파일명 입력: ");
			String fileName=sc.nextLine();
			input=new File(fileName);
			
			if(!input.exists())
				System.out.println("파일없음. 다시입력:");
			else
				break;
		}
		

	}

}
