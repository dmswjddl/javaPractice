package c_control;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		System.out.print("학번을 입력하세요=>");
		Scanner input =new Scanner(System.in);
		String hakbun = input.next();
		System.out.println("입력한 당신의 학번은 " + hakbun);

		
		String year = hakbun.substring(0, 4);//1997
		char dankwa = hakbun.charAt(4);//'1'
		String hakkwa = hakbun.substring(5,7);//"11"
		
		System.out.print(hakbun +"는 "+ year + "년도에 입학한 ");
		
		if(dankwa == '1') {
			System.out.print("공대");
			switch (hakkwa) {
			case "11":
					System.out.print("컴퓨터학과 학생입니다.");				
			case "12":
				System.out.print("소프트웨어학과 학생입니다.");
				break;
			case "13":
				System.out.print("모바일학과 학생입니다.");
				break;
			case "22":
				System.out.print("자바학과 학생입니다.");
				break;
			case "33":
				System.out.print("서버학과 학생입니다.");
				break;			
			}	
		}else if(dankwa == '2') {
			System.out.print("사회대");
			switch (hakkwa) {
			case "11":
				System.out.print("사회학과 학생입니다.");
				break;
			case "12":
				System.out.print("경영학과 학생입니다.");
				break;
			case "13":
				System.out.print("경제학과 학생입니다.");
				break;
			}
		}
	}
}

