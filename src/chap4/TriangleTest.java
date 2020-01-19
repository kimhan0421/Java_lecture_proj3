package chap4;
class Triangel {
	private double line, height;

	public Triangel(double line, double height) {
		this.line = line;
		this.height = height;
	}
	
	public double getLine() {
		return line;
	}

	public double getHeight() {
		return height;
	}	

	public double findArea(){
		return line * height / 2;
	}
	public boolean isSameArea(Triangel tr){
		return this.findArea() == tr.findArea();		
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangel t1 = new Triangel(10.0,5.0);
		Triangel t2 = new Triangel(5.0,10.0);
		Triangel t3 = new Triangel(8.0,8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
		
	}

}
