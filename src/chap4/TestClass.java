package chap4;

class Circle{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}//source

	public int getRadius() {//�о����
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}	
}

class CircleManager{//���길 ����
	public static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	public static boolean equals(Circle a, Circle b) {
		return a.getRadius() == b.getRadius();
	}
	
}

public class TestClass {

	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(10);
		
		boolean res = CircleManager.equals(pizza,waffle);
		if(res == true)
			System.out.println("pizza�� waffle�� ũ�� ����");
		else
			System.out.println("pizza�� waffle�� ũ�� �ٸ�");
		
		CircleManager.copy(pizza,waffle);//������ ����
		res = CircleManager.equals(pizza,waffle); //������ ��
		if(res == true) 
			System.out.println("pizza�� waffle�� ũ�� ����");
		else
			System.out.println("pizza�� waffle�� ũ�� �ٸ�");
	}

}

