package d_inherit;

public class Book extends Item{
	private String author;
	private String publisher;
	
	//오버라이딩
	public void output() {
		System.out.println("번호: " + num + " 제목: " + title + " 작가: " + author + " 출판사: " + publisher);
	}
	
	public Book() {
		System.out.println("Book인자 없는 생성자");
		
	}
	
	public Book(int num, String title, String author,String publisher) {
//		super.num = num;//부모꺼를 지칭할때 super사용
//		super.title = title;
		super(num, title);//*this()와 super()무조건 첫줄에 기술
		
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book인자 있는 생성자");
	}
}
