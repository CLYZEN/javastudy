package ch06.sec07.exam04;

// 설계도
public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	
	// 생성자 오버로드
	// 매개변수의 타입, 갯수, 순서 중 하나가 달라야 함
	Car () {
		
	}
	Car (String model) {
//		this.model = model;
		// this(); => 현재 클래스(Car) 안에 있는 생성자 호출
		this(model, "은색", 250); // Car (String model, String color, int maxSpeed) 호출
	}
	Car (String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250); // Car (String model, String color, int maxSpeed) 호출
	}
	Car (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
