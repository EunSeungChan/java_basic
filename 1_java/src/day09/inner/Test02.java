package day09.inner;

import javax.swing.JOptionPane;

//interface Command {
//
//	void exec(); 
//	default public void process() { 
//		System.out.println("process()");
//	}
//	
//} -> import사용
import day09.Command;

public class Test02 {
	public static void main(String[] args) {
		
		//익명클래스 - 클래스 정의와 생성 한번에 -> 람다코드
		Command delete = new Command() { 

			@Override
			public void exec() {
				System.out.println("delete 수행");
			}//재활용불가,객체지향위배
		};
	
		Command update = new Command() {
			
			@Override
			public void exec() {
				System.out.println("update 수행");
			}
		};
		
		Command create = new Command() {
			
			@Override
			public void exec() {
				System.out.println("create 수행");
			}
		};
		
		Command list = new Command() {
			
			@Override
			public void exec() {
				System.out.println("list 수행");
			}
		};
		

		String msg =
				JOptionPane.showInputDialog("수행할 명령을 입력하세요.create.list,delete,update");
	
		switch(msg.trim().toLowerCase()) { 
		case "delete" :
			delete.exec();
			break;
		case "update" :
			update.exec();
			break;
		case "create" :
			create.exec();
			break;
		case "list" :
			list.exec();
			break;
		default : 
			System.out.println("다시 입력하세요.");
		}
		
	}

}
