package ex1_single_array;

import java.util.Random;

public class Ex6_work {
	public static void main(String[] args) {
		
		//변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다
		//(단, 3450, 2100과 같이 1의자리 숫자는 반드시 0이 되어야 한다)
		//발생한 난수 money를 동전으로 바꾸면 각각의 동전이 몇 개 씩 필요한지를 출력
		//가능한 한 적은 수의 동전으로 출력할 것.
		//--------------------------------
		//금액 : 2590
		//500원 : 5
		//50원 : 1
		//10원 : 4
		
		int[] coin = {500, 100, 50, 10};
		
		int money = new Random().nextInt(500) + 1;
		money *= 10;
		
		System.out.println("금액 : " + money);
		
		for( int i = 0; i < coin.length; i++ ) {
			
			int res = money / coin[i];
			
			if( res > 0 ) {
				System.out.printf( "%d원 : %d개\n", coin[i], res );
				money %= coin[i];
			}
			
		}//for		
		
	}//main
}


















