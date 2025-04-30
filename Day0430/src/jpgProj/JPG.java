package jpgProj;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import net.coobird.thumbnailator.Thumbnails;

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
		
		System.out.println("변환할 파일의 가로픽셀 입력: ");
		int width=sc.nextInt();
		System.out.println("변환할 파일의 세로픽셀 입려력 ");
		int height=sc.nextInt();
		System.out.println("변환할 파일명 입력: ");
		sc.nextLine();
		String reName=sc.nextLine();
		
		String outputFile = reName;
		
		try {
			Thumbnails.of(input)
			.size(width, height)
			.outputFormat("jpg")
			.toFile(new File(outputFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		System.out.println(outputFile+" 변환완료");
		

	}

}
