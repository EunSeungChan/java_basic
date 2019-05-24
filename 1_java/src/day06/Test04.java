package day06;

public class Test04 {
	public static void main(String[] args) {

		System.out.println("start ...");	
		
		BlockTest b = new BlockTest();
			System.out.println("--------------");	
			
		BlockTest c = new BlockTest();

			System.out.println("end ...");	
		
	}
	
}

class BlockTest{
	//class-초기화블럭
	static{ //import만써도 됨
		System.out.println("초기화 static  {   }");
	}
	//instance-초기화블럭
	{
		System.out.println("초기화  {   }");
	}
	
	public BlockTest() {
		System.out.println("BlockTest() 생성자..");
	}
}
