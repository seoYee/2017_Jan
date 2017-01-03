package ch2;

public class Start4 {
	public static void main(String[] args) {
		int k = 5;
		int m;
		
		m = square(k);
	}
	// main 메소드의 k 변수의 값을 가져와서 square 메소드에 새로운 k변수공간을 만들고 저장함.
	//square 안에서 k 변수 값을 변경해도 main의 k에는 아무런 영향을 미치지 않음.
	// Call By Value
	private static int square(int k){
	//	System.out.println(k);
		int result;
		k=25;
		result = k;
		return result;
	}

}
