package b_operator;

public class Ex01_review {
	
	//short circuit logic : 자바에서 일반 논리 연산자(&&,||)에 적용
	
	//일반논리 연산자(&&, ||) : true.  false
	//이진논리 연산자(%, |, ^) : 각 비트의 값(0, 1)

	public static void main(String[] args) {
		int a=3;//a = 4로증가 // 5

			//flase & true => flase
		if( a > 3 & ++a>3 ){

			System.out.println("조건만족");//x

		}

		System.out.println("A=" + a );//4

			//4로 증가한값 유지	
			//true | true => true
		if( a > 1 | ++a > 3 ){

			System.out.println("조건만족");//o

		}

		System.out.println("A=" + a );//5
		
	}

}
