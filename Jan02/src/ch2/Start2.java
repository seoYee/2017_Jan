package ch2;

public class Start2 {
	// main 메소드 발견하면 java.lang 패키지, import 패키지, 프로그램 상의 모든 클래스를 스태틱 영역에 배치
	public static void main(String[] args) { // main 스택 프레임 생성, args를 저장할 변수공간 확보
		//main 스택 프레임 안에 i의 변수 공간을 마련함.
		int i;
		//10이라는 값 할당
		i = 10;
		
		//main 스택 프레임 안에 d의 변수 공간을 마련한 후 20이라는 값 할당.
		double d = 20.0;
	}
}
