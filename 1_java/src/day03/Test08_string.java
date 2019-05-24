package day03;

public class Test08_string {

	public static void main(String[] args) {
		
		String msg = "hello java test !!!";
		String msg2 = ""; //null
		StringBuilder sb = new StringBuilder(); //스트링빌더에다가 계속 쌓는거
		/*System.out.println(msg.charAt(0)+"=>"+(char)(msg.charAt(0)-32)); //나온문자
		System.out.println(msg.charAt(1)+"=>"+(char)(msg.charAt(1)-32));
		System.out.println(msg.charAt(2)+"=>"+(char)(msg.charAt(2)-32));
		System.out.println(msg.charAt(3)+"=>"+(char)(msg.charAt(3)-32));
		*/
		
		for(int i=0; i<msg.length() ;i++) {
			//System.out.println(msg.charAt(i)+"=>"+(char)(msg.charAt(i)-32));
			//msg2 += (char)(msg.charAt(i)-32); // X , 스트링빌드랑스트링버퍼사용
			sb.append((char)(msg.charAt(i)-32));
		}
		msg2 = sb.toString();
				
		System.out.println(msg);
		System.out.println(msg2);
		
		
		
		
		
		
		/*
		String name = "홍길동"; //012
		System.out.println(name);
		System.out.println(name.length()); //length : 길이
		System.out.println(name.charAt(0)+"**"); //charAt : 위치index를 줘야 문자열하나를 돌려줌
		System.out.println("**"+name.charAt(name.length()-1));
		
		System.out.println(name.substring(1, 3)); //substring : 
		*/
		
	}

}
