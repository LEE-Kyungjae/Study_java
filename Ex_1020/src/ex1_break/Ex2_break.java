package ex1_break;

public class Ex2_break {
	public static void main(String[] args) {
		
		int n = 1;
		while( true ) {
			
			System.out.println(n);
			n++;
			
			if( n == 5 ) {
				break;
			}
			
		}//while
		
		System.out.println("--------------------");
		
		int num = 0;
		
		while( true ) {
			
			switch( num ) {
			
			case 1:
				System.out.println("���� 1");
				break;
			
			case 2:
				System.out.println("���� 2");
				break;
				
			}//switch
			
			num++;
			
		}//while
		
	}//main
}











