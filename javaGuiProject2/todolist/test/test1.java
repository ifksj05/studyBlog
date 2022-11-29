package test;

public class test1 {
	private String a;

	public test1() {
		// TODO Auto-generated constructor stub
		a = "test1 클래스 입니다.";
		new test2(this);
	}
	
	public void testMesud(String txt) {
		// TODO Auto-generated method stub
		System.out.println(txt + a);
	}
	
	public static void main(String[] args) {
		new test1();
	}
}

class test2{
	test1 test1;
	private test1 to;
	
	public test2(test1 to) {
		// TODO Auto-generated constructor stub
		this.to = to;
		to.testMesud("test2에서 실행합니다.");
	}
	
	
}
