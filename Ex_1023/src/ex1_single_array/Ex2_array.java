package ex1_single_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!';
		
		//JAVA
		for( int i = 0; i < ch.length; i++ ) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		//�迭�� ����, ����, �ʱ�ȭ�� �� �ٷ�
		String[] sArr = {"����", "����", "���"};
//		for( int i = 0; i < sArr.length; i++ ) {
//			System.out.println( sArr[i] );
//		}
		
		//������ ����(���� for��)
		//�迭�� �� �ε����� ���� ������ �Ұ�
		for( String s : sArr ) {
			System.out.println(s);
		}
		
	}//main
}







