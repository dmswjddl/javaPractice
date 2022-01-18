package a_datatype;

public class Ex03_StringBuffer {
	//call by reference : 함수의 인자로 참조형을 보낼 때
	//[결론] 원데이터가 변경됨

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("홍길동");
		add(a,b);
		System.out.println("2>"+ a);//hello 홍길동
		System.out.println("2>"+ b);//홍길동
	}
	
	static void add(StringBuffer a, StringBuffer b){
		a.append(b);//a+b hello홍길동/append(b)
		System.out.println("1>" + a);//홍길동
		
	}

}
/*
	자바에서 문자열처리 클래스
	- String
	- StringBuffer/ StringBuilder
	
*/