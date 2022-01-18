package a_datatype;

public class Ex03_primitiveParam {

	//call by value : 함수의 인자로 기본형 데이터를 보낼 때

	public static void main(String[] args) {
				
		int a = 10;
		int b = 20;
		add(a,b);
		System.out.println("2>"+ a);//10
		System.out.println("2>"+ b);//20
	}
		
	static void add(int a, int b){
		a+=b;//a= a+b
		System.out.println("1>"+ a);//30
	}
		
}

