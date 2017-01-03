package ch2;

public class Start3 {
	public static void main(String[] args) {
		int i = 10; 
		int k = 20;
		
		//main 스택 프레임 안에 if(true) 스택 프레임이 중첩되어 생성.
		if(i == 10){
			//외부 스택 프레임에서 내부 스택 프레임의 변수에 접근하는 것은 불가능하나 그 역은 가능하다.
			int m = k+5;
			k = m;
		}else{
			int p = k + 10;
			k = p;
		}
	}

}
