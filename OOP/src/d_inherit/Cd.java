package d_inherit;

public class Cd extends Item {
	String singer;

	public void output() {
		System.out.println("번호: " + num + " 제목: " + title + "가수: " + singer);

	}
	
	Cd(){
		
	}
	
	Cd(int num, String title, String singer){
		super.num = num;//부모꺼를 지칭할때 super사용
		super.title = title;
		this.singer = singer;
	}
}
