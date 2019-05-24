package day08;

//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★

//class 선언부
//abstract : 상속을 전제로 하는
abstract class Animal extends Object {
	
	String kind = "동물의 종류"; //
		
	//기본 생성자 함수반드시들어가야함 , 안들어가면 Dog class에 에러남

	public Animal(){
		super();
	}

	//source - using fields
	public Animal(String kind) { 
		this.kind = kind;
	}

	public abstract void breath(); //바디부가 없으면 에러 -> abstract(미완성) method ->전체클레스에도 적용
	
	public void print() {
		
	}

	//default 
	
	
}



