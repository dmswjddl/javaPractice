package c_inherit;

public class MainApp {

	public static void main(String[] args) {
		//1-------------------------------
//		Umma u = new Umma();
//		u.gene();
//		u.job();
		
//		Ddal d =new Ddal();
//		d.gene();
//		d.study();
//		//*
//		d.job();
		
		
		
		//2------------------------------중요!
		//부모 변수에 자식 객체 생성
		Umma z = new Ddal();//변수가 엄마
		z.job();
		//z.study()불가
		z.gene();//****
		
		//3-------------------------------
		//형변환 - 기본형끼리
		//	   - 클래스끼리 상속관계에 있을떄만
		Ddal dd = new Ddal();
		Umma mm = (Umma)dd;//upcasting //부모자식관계에서만 캐스팅 가능(상속관계)
		Ddal dd2 = (Ddal)mm;//downcasting
	}

}
