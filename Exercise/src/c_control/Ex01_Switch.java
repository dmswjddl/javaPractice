package c_control;

public class Ex01_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "970805-1234567";
		
		String neundo = id.substring(0, 2);//0번째부터 2번째 앞까지
		System.out.println("년도: " + neundo);
		
		//월과 일도 추출해서 출력하기
		String month = id.substring(2,4);
		String day = id.substring(4,6);
		System.out.println(month + "월" + day + "일");
		
		char sung = id.charAt(7);//몇번째의 문자
		//System.out.println(sung);
		
		//변수 sung의 값이 1이거나 3이면 "남자" 출력
		//그렇지 않으면 "여자" 출력
		
		if((sung == '1') | (sung == '3')) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		//8번째 문자를 추출하여 변수 chul에 저장하기
		char chul = id.charAt(8);
				//0 - 서울태생
				//1 - 인천/부산
				//2 - 경기
				//9 - 제주도
		System.out.println(chul);
		
		switch (chul) {//문자, 정수, 스트링 변수만 가능
		case '0'://문자는 꼭 '표시하기!!
			System.out.println("서울태생");
			break;
		case '1':
			System.out.println("인천/부산");
			break;
		case '2':
			System.out.println("경기");
			break;
		case '9':
			System.out.println("제주도");
			break;

		default:
			break;
		}
		
		int i =1, j=0;
		switch ( i ) {
		   	case 2 : j += 6;
			case 4 : j += 1;
			default : j += 2;
			case 0 : j += 4;
		}
		System.out.println( j );
	}
}
