package ex1_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		
//		 연산자(Operator)
//		1.최고연산자: . , ()
//		2.증감연산자: ++ , --
//		3.산술연산자: + , - , * , / , %
//		4.시프트연산자: >> , <<
//		5.비교연산자: > , < , >= , <= , == , !=
//		6.비트연산자: & , | , ^ , ~
//		7.논리연산자: && , || , !
//		8.삼항(조건)연산자: ? , :
//		9.대입연산자 : = , *= , /= , %= , += , -=
		
//		산술 연산자 : 4칙연산과 나머지 연산자를 가진다
		int n1 = 20 ;
		int n2 = 7;
		int n3 = n1 + n2;
		System.out.println("n3 : " + n3);
		n3 = n1 / n2;//나누기
		System.out.println("n3 : " + n3);
		n3 = n1 % n2;//나머지
		System.out.println("n3 : " + n3);
		System.out.println("------------");
		
//		대입연산자 : 특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자
		int i1 = 10;
		int i2 = 7;
		i1 += i2; //i1 = i1 + i2;
		System.out.println("+= : " + i1);
		i1 %= 5; //i1 =i1 % 5;
		System.out.println("-----------");
		System.out.println("%= : " + i1);
		
//		비교연산자 : 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		int a1 = 10;
		int a2 = 20;
		boolean result = a1 < a2;
		System.out.println("result : " + result);
		
		result = a1 == a2;
		System.out.println("result : " + result);
		result = a1 != a2;
		System.out.println("result : " + result);
	}//main
}


















