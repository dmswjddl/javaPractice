package c_control;

import java.util.Scanner;

public class Ex05_선택연습 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("학번을 입력하세요: ");
		String hakbun = input.next();

		char dankwa = hakbun.charAt(4);
		String hakkwa = hakbun.substring(5, 7);
		String year = hakbun.substring(0, 4);
		
		System.out.print(hakbun + "는 " + year + "년도에 입학한 " + dankwa );

		if(dankwa == '1') {
			System.out.print("공대 ");
			switch (hakkwa) {
			case "11": System.out.print("컴퓨터학과 학생입니다"); break;
			case "12": System.out.print("소프트웨어학과 학생입니다"); break;
			case "13": System.out.print("모바일학과 학생입니다"); break;
			case "22": System.out.print("자바학과 학생입니다"); break;
			case "33": System.out.print("서버학과 학생입니다"); break;
			}
		}
		else if(dankwa == '2'){
			System.out.print("사회대 ");
			switch(hakkwa) {
			case "11": System.out.print("사회학과 학생입니다"); break;
			case "12": System.out.print("경영학과 학생입니다"); break;
			case "13": System.out.print("경제학과 학생입니다"); break;		
			}

		}
	}
	

}

