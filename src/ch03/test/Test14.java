package ch03.test;

public class Test14 {
	public static void main(String[] args) {
		        char ch = 'A';
		        char lowerCase = (char) (('A' <= ch && ch <= 'Z') ? (ch+32) : ch) ;
		        System.out.println("ch:"+ch);
		        System.out.println("ch to lowerCase:"+lowerCase);
		        
	}
}
