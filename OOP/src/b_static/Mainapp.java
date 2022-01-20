package b_static;

public class Mainapp {

	public static void main(String[] args) {
//		Book b1 = new Book();
//		System.out.println("책의 갯수 : " + b1.getCount());
//		Book b2 = new Book();
//		System.out.println("책의 갯수 : " + b2.getCount());
//		Book b3 = new Book();
//		System.out.println("책의 갯수 : " + b3.getCount());

		System.out.println("책의 갯수 : " + Book.getCount());
	}

}
/* 
 * static
 * - 메모리에 단한개
 * - 공유
 * - 객체명이 아닌 클래스명으로 접근가능(객체생성없이 가능)
 * 
 */ 

 /* 
 *  Integer i = new Integer();
 *  i.parseInt();
 *  
 *  Integer.parseInt();
 *  --------------------------------------
 *  public static void main(String[] args) { main함수는 왜 static을 사용할까?
 *  JVM
 *  mainApp클래스 안에 main()실행
 *  객체 생성하지않고도 불러오기위해 static사용
*/