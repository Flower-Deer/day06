package java06;

import java.util.Comparator;

public class LinkedList<E> {
	class Node<E> {
		private E data; //실제 데이터를 담을 변수
		private Node<E> next; //다음 노드를 가르키는 변수
		
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	} //end Node class
	
	private Node<E> head; // 머리 포인트(시작 노드 주소를 담는 곳)
	private Node<E> crnt; // 선택 포인트(시작 노드 주소를 담는 곳 - 검색, 삭제 현재 선택한 노드)
	
	public LinkedList() {
		head = null; // 비어 있는 리스트 조건 head = null 1개 ->head.next ==null
		crnt = null; // 꼬리 노드인 것을 판단 조건 p.next == null
	}

	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head; // head에있는걸 ptr노드에 넣어줘라 // ptr=현재 스캔중인 노드 주소
		
		while(ptr != null) {
			if(c.compare(obj, ptr.data) == 0) { //compare 같으면 0 크면 -1 작으면 1 retrun
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null;
	}
	//검색
	public void addFirst(E obj) {
		Node<E> ptr = head;
		head = crnt = new Node<E>(obj, ptr);
	}
	//처음 노드를 삽입하기
	public void addLast(E obj) {
		if(head == null) addFirst(obj);
		else {
			Node<E> ptr = head;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = crnt = new Node<E>(obj, null); //주소는 null
		}
	}	
	//끝에 노드를 삽입하기
	public void addMid(E obj) {
		//삽입할 "B"를 전달받아서
		
		
	}
	//중간에 노드 삽입하기
}

