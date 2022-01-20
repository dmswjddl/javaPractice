package d_inherit;

public class Item {
	protected int num;//protected 자식한테만 접근가능
	protected String title;
	
	public void output() {
		System.out.println("번호: " + num + " 제목: " + title);
	}
	
	public Item(){
		System.out.println("부모의 인자 없는 생성자");
	}
	
	public Item(int num, String title){
		this.num = num;	
		this.title = title;
		System.out.println("부모의 인자 있는 생성자");
	}

}
