package chap4;

class Printer {
	private int numOfPaper;	

	public int getNumOfPaper() {
		return numOfPaper;
	}

	public void setNumOfPaper(int numOfPaper) {
		this.numOfPaper = numOfPaper;
	}

	public void print(int pr) {
		if(numOfPaper == 0) {
		System.out.println("������ �����ϴ�.");
		} else if(numOfPaper >= pr) {
			System.out.printf("%d�� ����߽��ϴ�. ���� %d�� ���ҽ��ϴ�.\n",pr,(numOfPaper-pr));	
			numOfPaper -= pr;
		} else if (numOfPaper < pr){			
			System.out.printf("��� ����Ϸ��� ������ %d�� �����մϴ�. %d�常 ����մϴ�.",(pr-numOfPaper),numOfPaper);
		}
		
	}
}

public class PrinterTest {
	public static void main(String[] args) {
		Printer p = new Printer();
		p.print(2);//
		p.setNumOfPaper(10);//
		p.print(2);//
		p.print(10);
	
	}

}
