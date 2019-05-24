package day10.collection;

public class EmployeeTest {
	public static void main(String[] args) {
/*		
		//<?> ?가 데이터 타입 결정
		Employee<String> emp = new Employee<String>("홍길동", "2019001");
		System.out.println(emp.number.substring(0,4));
									//substring handling
		
		Employee<Integer> emp1 = new Employee<Integer>("김길동", 1);
		System.out.println(emp1);
		
		//<>타입언급X -> object 타입으로 관리-> down-casting안하면 자원접근X -> instanceof
		Employee emp2 = new Employee("고길동", 2019002);
		System.out.println(emp2.number); //instanceof ~
*/
	
		Employee<String, String> emp1 =
				new Employee<String, String>("홍길동", "2019-001");
			System.out.println(emp1);
			
		//<>타입언급X -> object 타입	//default생성자 -> null assign
		Employee emp2 = new Employee("김길동",9); 
			System.out.println(emp2);
	}

	
	
}
