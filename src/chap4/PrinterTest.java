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
		System.out.println("용지가 없습니다.");
		} else if(numOfPaper >= pr) {
			System.out.printf("%d장 출력했습니다. 현재 %d장 남았습니다.\n",pr,(numOfPaper-pr));	
			numOfPaper -= pr;
		} else if (numOfPaper < pr){			
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.",(pr-numOfPaper),numOfPaper);
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
