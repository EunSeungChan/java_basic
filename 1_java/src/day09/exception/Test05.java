package day09.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		
		try(Scanner sc = new Scanner(new File("c://lib/bookdata.txt")); ) {
			// -> 자원반납같이해주기 때문에 finally 필요X 
		
			 while(sc.hasNextLine()) {
				 String data = sc.nextLine();
				 String[] bookdata = data.split("/");
				 String title = bookdata[0];
				 int price = Integer.parseInt(bookdata[1]);
				 System.out.println("Read : "+ data);
			 };
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("bookdata.txt 파일을 준비해주세요....");
		}catch (Exception e) {
			System.out.println("bookdata parsing error");
			System.out.println(e.getMessage());
		}
		//Scanner -> throws FileNotFoundException
		
		
	}

}
