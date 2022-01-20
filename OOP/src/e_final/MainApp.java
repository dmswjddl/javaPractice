package e_final;

class Parent {
	final String field = "부모님꺼";
	public final void jib() {
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent {	//상속 - 부모가 가진 것을 물려받아 더욱 확장시키기 위함임
//	String field = "내꺼";	//이렇게 해도 부모님꺼로 나옴
	Child() {
//		field = "내꺼";	//부모의 field가 final로 설정되어 변경불가능하기 때문에 오류가 뜸
	}
	/*
	public void jib() {	//부모의 jib()이 final로 설정되어 오버라이딩 불가능
		System.out.println("물려받아 탕진한 집");
	}
	*/
}

public class MainApp {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
	}

}
