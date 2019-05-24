package util;

import java.io.Serializable;

public class MyStack {
	
	int[] stack ; 
	int count = 0 ;

	public MyStack() {
		stack = new int[10];
	}

/* 객체 생성 시 생성자 매개변수로 배열의 크기를 지정할 수 있으나 
	음수가 매개변수로 들어올 경우는 기본적으로 10개의 정수를 저장하도록 한다. */
	public MyStack(int size) {
		if(size < 0) {
			size = 10;
		}
		stack = new int[size];
	}


//push() 메서드로 Stack에 정수를 저장한다.
	public void push(int s) {
		//stack[0] = i;
		count++;
		stack[count-1] = s;
		
		
		
	}

//isEmpty() 메서드로 Stack이 비어있는지 확인할 수 있다. 	
	public boolean isEmpty() {
		if(count == 0) return true;
		return false;
		
	}

//ifFull() 메서드로 Stack이 가득찼는지 확인할 수 있다.
	public boolean isFull() {
		if(count <= stack.length) return true;
		return false;
	}

/*top() 메서드로 Stack에서 최상위에 저장된 숫자가 뭔지 알 수 있다.
 *  top() 메서드를 호출했다고 해서 숫자가 삭제되는 것은 아니다.
 *   꺼낼 숫자가 없는 경우 -1을 리턴한다 */
	public int top() {
		return stack[count-1];
	}

/*	7.	pop() 메서드로 Stack에서 최상위에 저장된 숫자를 꺼낼 수 있다. 
 * 스택에서 숫자를 꺼내면 그 숫자는 Stack에서 삭제된다. 
 * 꺼낼 숫자가 없는 경우 -1을 리턴한다.*/
	public int pop() {
		if(count == 0) {
			return count-1;
		} int top = this.top();
			count--;
			return top; 
		
				
		
	}
		
}
	

