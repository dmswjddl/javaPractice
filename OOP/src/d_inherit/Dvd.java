package d_inherit;

public class Dvd extends Item{
	private String actor;
	private String director;
	
	public void output() {
		System.out.println("번호: " + num + " 제목: " + title + "배우: " + actor + " 감독: " + director);
	}
	public Dvd(int num, String title, String actor,String director) {
		super.num = num;//부모꺼를 지칭할때 super사용
		super.title = title;
			
		this.actor = actor;
		this.director = director;
		System.out.println("Dvd인자 있는 생성자");
	}
}
