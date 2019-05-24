package day07.ex;

class Teacher extends Person{
	private String subject;
	
	//default생성자
	public Teacher() {
			
		}
	
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void print() {
		super.print();
		System.out.printf("[Teacher]담당과목 : %s %n",this.subject);
	}

}