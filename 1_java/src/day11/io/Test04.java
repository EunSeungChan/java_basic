package day11.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		String filename = "c://lib/Ben.mp3";
		
		int count = 0;
		int read = 0;		
		
		//예외처리
		try {
			fis = new FileInputStream(filename);
			fos = new FileOutputStream("c://lib/copy.mp3",true);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			//read() : 1byte읽는거
			//읽을자리가 없으면 read자리에 -1이온다
			System.out.println(" *** 파일 복사 시작 *** ");
			while((read = bis.read()) != -1){
				bos.write(read);
				count++;
			}; 
			bos.flush(); //.flush() : 사용하지않은면 기록이안됨
			
			System.out.println("IO 횟수 : "+ count);
			System.out.println(" *** 파일 복사 완료 *** ");
			
		}catch (FileNotFoundException e) {
			System.out.println("복사할 파일을 준비해 주세요.");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//자원반납
			try {
				if(bis !=null) bis.close();
				if(bos !=null) bos.close();
				
				if(fis !=null) fis.close();
				if(fos !=null) fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main end");
	}

}
