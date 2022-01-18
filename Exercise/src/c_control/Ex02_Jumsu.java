package c_control;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
public class Ex02_Jumsu {

	public static void main(String[] args) {
		int score = 0;
		System.out.println("점수를 입력하세요=>");
		Scanner input =new Scanner(System.in);
		score = input.nextInt();
		System.out.println("당신의 점수는 "+score);
		System.out.println("당신의 점수2는 "+score/10);
		
		switch (score/10) {
		case 10://break가없기때문에 case9수행 100~90점대는 A학점 나오게됨
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
		case 7:
			System.out.println("C학점");
		default:
			System.out.println("F학점");
			break;
		}
		/*if(score>=90) {
			System.out.println("A학점");
		}else if(score>=90){
			System.out.println("A학점");
		}else if(score>=90){
			System.out.println("A학점");
		}else if(score>=90){
			System.out.println("A학점");
		}*/
	}

}
