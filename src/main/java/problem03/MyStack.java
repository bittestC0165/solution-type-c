package problem03;

public class MyStack {
	
	private String[] buffer;
	private int sp;
	private int maxsize;
	
	public MyStack( int size ) {
		buffer = new String[size];
		//buffer = new String[size+2]; 
		//Main 처음에 MyStack stack = new MyStack(3); 으로 size가 3이라서 배열에서 에러가 난다.
		//MyStack stack = new MyStack(3);에서  MyStack stack = new MyStack(5); 로 바꾸면 제대로 실행된다.
		sp = -1;
		maxsize = 0;
	}
	
	public void push(String item) {
		if (sp >= buffer.length) {
			throw new StackOverflowError();
		}else {
			maxsize++;
			buffer[++sp] = item;
		}
	}

	public String pop() {
		if(isEmpty()) {
			return null;
		}else {
			maxsize--;
			return buffer[sp--];
		}
	}

	public boolean isEmpty() {
		return sp == -1 ? true : false;
	}
	
	public int size() {
		return maxsize;
	}
}