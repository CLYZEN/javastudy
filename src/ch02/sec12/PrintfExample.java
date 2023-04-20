package ch02.sec12;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		
		System.out.printf("상품의 가격 :%4d원\n",value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름 %d인 원의 넓이: %10.2f\n",10,area );
		
		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%6d | %s | %10s\n", 1, name, job);
	}
}
