package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 점수 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 모든 데이터 출력하기 : 오름차순
		for(Integer s : scores) {
			System.out.println(s);
		}
		
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		
		System.out.println("95점 아래 점수  :" + scores.lower(95));
		System.out.println("95점 위 점수  :" + scores.higher(95));
		
		System.out.println("95점이거나 바로 아래 점수" + scores.floor(95));
		System.out.println("85점이거나 바로 위 점수" + scores.ceiling(85));
		
		System.out.println();
		
		// 내림차순 정렬
		NavigableSet<Integer> descdingScores = scores.descendingSet();
		for(Integer s : descdingScores) {
			System.out.println(s);
		}
		System.out.println("====================");
		
		// 범위 검색 (80 <=)
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true); 
		NavigableSet<Integer> rangeSet2 = scores.headSet(80, true); 
		for(Integer s : rangeSet) {
			System.out.println(s);
		}
		System.out.println("====================");
		for(Integer s : rangeSet2) {
			System.out.println(s);
		}
		
		System.out.println("====================");
		// 범위검색(80 <= score < 90)
		NavigableSet<Integer> rangeSet3 = scores.subSet(80, true, 90, false); 
		for(Integer s : rangeSet3) {
			System.out.println(s);
		}
		
	}
}
