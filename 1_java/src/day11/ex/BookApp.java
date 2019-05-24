package day11.ex;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		
		BookMgr mgr = new BookMgr();
		
		while(true) { 
		System.out.println("******************************    ***");
		System.out.println("********* Book Application **********");
		System.out.println("******************************    ***");
		
		System.out.println("원하는 메뉴 번호를 입력하세요..");
		System.out.println("1. 입 력");
		System.out.println("2. 수 정");
		System.out.println("3. 삭 제");
		System.out.println("4. 검 색");
		System.out.println("5. 목록보기");
		System.out.println("6. 종 료");
		
		System.out.println("******************************    ***");
		
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine(); //입력한내용
		
		if(input == null || input.length()== 0) {
			input = "99";
		}
		
		//if else -> switch
		//switch (key) <- int,char,   string(잘안씀) 
		
		String cmd;
		switch (input.charAt(0)) { 
		//insert
			case '1' :
				System.out.println("1. 입 력 서비스");
				System.out.println("책 제목과 가격을 입력하세요!");
				System.out.println("ex)java/50000");
				cmd = sc.nextLine();
				break; //{}에서 빠져나가는거 
		//update
			case '2' :
				System.out.println("2. 수 정 서비스");
				System.out.println("수정하고 싶은 책의 이름을 입력하세요!");
				System.out.println("ex)java/50000");
				cmd = sc.nextLine();
				break;
		//delete
			case '3' :
				System.out.println("3. 삭 제 서비스");
				System.out.print("삭제하고 싶은 책의 이름을 입력하세요!");
				cmd = sc.nextLine();
				break;
		//search
			case '4' :
				System.out.println("4. 검 색 서비스");
				System.out.print("검색하고 싶은 책의 이름을 입력하세요!");
				cmd = sc.nextLine();
				break;
		//look
			case '5' :
				System.out.println("5. 목록보기 서비스");
				mgr.lookBookList();
				break;
		//end
			case '6' :
				System.out.println("6. 종 료 서비스");
				sc.close();
				sc=null;
				break;
				
			default:
				System.out.println("잘못입력하셨습니다.1~6 번호를입력하세요!!");
				break;
			}
		
		}
		
	}
	
}
