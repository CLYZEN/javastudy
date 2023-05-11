package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 비어있지 않으면 실행
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue());
		}
	}

}
