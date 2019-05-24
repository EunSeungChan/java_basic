package day05;

public class Test02_tv {
	public static void main(String[] args) {

		TV tv1 = new TV() ; //day05에 TV.class가 없어서 error
		tv1.color="black";
		tv1.power(); //boolean은 false
		tv1.channelUp();
//		tv1.print();
		//default 초기화 이루어짐
		
		TV tv2 = new TV() ; 
		tv2.color="white";
//		tv2.print();
		
		System.out.println("---------------------------------");
//		TV[] tvs = new TV[5] ; // TV의 배열
//		tvs[0] = tv1;
//		tvs[1] = tv2;
		
//		TV[] tvs = {tv1,tv2,null,null,null};
//		배열 선언,생성,초기화 한번에 하는 문장 , 위에 주석처리 한거랑 같은거
		
		TV[] tvs = null;
		tvs = new TV[] {tv1,tv2,null,null,null};
//		3개다 같은 의미
		
		
		//배열 = for 루프
		
		for(int i = 0 ; i<tvs.length ; i++) {
			if(tvs[i] != null) tvs[i].print();
			
		
		}
	}

}
