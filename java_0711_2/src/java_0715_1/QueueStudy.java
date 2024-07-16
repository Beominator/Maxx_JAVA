package java_0715_1;

import java.util.LinkedList; 
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();		// 우선순위에 따라서 만들어짐
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		
		System.out.println( pq );
		
		for( int i = 0; i <= 5; i++) {
			System.out.println( pq.poll() );
		}
		// 개발자가 정의한 클래스의 객체에서 우선순위를 정하려면
		// compare메서드를 구현해야한다
		// 인터페이스 Comparator implements 해야된다.
		
		
		
		Queue<String> q = new LinkedList<>();
		
		q.add("자두");
		q.offer("수박");
		q.offer("참외");
		q.offer("살구");
		q.offer("참외");
		
		System.out.println( q.poll() );
		System.out.println( q );
		System.out.println( q.peek() );		// 다음 내보낼 것 표시, 비어있을 때 실행하면 null
		System.out.println( q );
		System.out.println( q.element() );	// 다음 내보낼 것 표시, 비어있을 때 실행하면 오류
		System.out.println( q.size());		// 크기 확인
		System.out.println( q.contains("복숭아") );	// 존재하는지 비교

	}

}


/*
 	Queue  - 큐
 	FIFO
*/
