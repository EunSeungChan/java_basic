package Chapter07;

public class PointTest2 {
	public static void main(String[] args) {
		Point3D1 p3d1 = new Point3D1();
		System.out.println("p3d1.x=" + p3d1.x );
		System.out.println("p3d1.y=" + p3d1.y );
		System.out.println("p3d1.z=" + p3d1.z );

	}

}

class Point1{
	int x = 10;
	int y = 20;
	
	public Point1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}

class Point3D1 extends Point1{
	int z = 30;
	
	public Point3D1() {
		this(100,200,300);
	}
	
	public Point3D1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
}