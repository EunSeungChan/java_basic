package day09;

@FunctionalInterface //람다표현이 가능한지
public interface Command {

	void exec(); //추상메소드하나만있는거는 람다표현가능 ,instance
	
	//static한 메소드 default ->{}있어야함
	public default void process() { 
		System.out.println("process()");
	}
	
}

class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");		
	}
}

class CreateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("CreateCommand 수행");		
	}
}

class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");		
	}
}

class ListCommand implements Command{
	
	@Override
	public void exec() {
		System.out.println("ListCommand 수행");		
	}
}