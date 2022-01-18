package c_control;

public class Ex05_for과제 {

	public static void main(String[] args) {

		//문제1
		for(int i=0; i<26; i++) {//26번반복분	
			for(char ch='A'; ch<='A'+i; ch++) {//A~Z까지 출력문
				System.out.print(ch);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");

		//문제2
		for(int i=0; i<26; i++) {
			for(char ch='A'; ch<='Z'-i; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");

		//문제3
		for(int i=0; i<26; i++) {
			for(char ch=(char)('A'+i); ch<='Z'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");

		//문제4
		for(int i=0; i<26; i++) {
			for(char ch='Z'; ch>='Z'-i; ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
