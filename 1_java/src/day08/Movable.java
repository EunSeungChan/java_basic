package day08;

public interface Movable {
	public abstract void move();
	
}

interface Drawable{
	void draw();
}


interface MovableAndDrawable extends Movable,Drawable{
	
}




//Object 자식
class Circle implements MovableAndDrawable{ //implements 앞에 extends Object생략

	@Override
	public void move() {
		System.out.println("Circle Move");
	}

	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
	
}

class Rectangle implements MovableAndDrawable{

	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}

	@Override
	public void move() {
		System.out.println("Rectangle Move");
	}
	
}