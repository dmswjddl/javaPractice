package a_basic;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		//Student s;//변수선언
		//s = new Student();//객체생성 =>s 객체명 //Student();생성자 함수 부르기
		//Student s = new Student();
		
		Scanner input = new Scanner(System.in);//입력받은 값으로 처리하기
		System.out.print("학생이름 -> ");
		String n = input.next();
		System.out.print("국어 -> ");
		int k = input.nextInt();
		System.out.print("수학 -> ");
		int m = input.nextInt();
		System.out.print("영어 -> ");
		int e = input.nextInt();
		
		Student s = new Student(n, k, m, e);//인자값
		
		//값지정
//		s.name = "홍길동";
//		s.kor = 100;
//		s.eng = 90;
//		s.math = 80; //private시 .으로 참조시 에러남 직접 접근불가 setter + getter 만들기
//		s.setName("홍길동");//set함수를 불러와서 홍길동 저장
//		s.setKor(100);
//		s.setEng(90);
//		s.setMath(80);
		
		s.calculateAvg();
		s.calculateTotal();
		s.output();		
	}
	

}
