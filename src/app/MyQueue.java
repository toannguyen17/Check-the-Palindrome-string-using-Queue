package app;

public class MyQueue {
	private int    capacity;
	private String[] queueArr;
	private int head        =  0;
	private int tail        = -1;
	private int currentSize =  0;

	public MyQueue(int queueSize) {
		this.capacity = queueSize;
		this.queueArr = new String[this.capacity];
	}

	public boolean isQueueFull(){
		if (currentSize >= capacity){
			return true;
		}
		return false;
	}

	public boolean isQueueEmpty(){
		if (currentSize == 0){
			return true;
		}
		return false;
	}

	public void enqueue(String item) {
		if (isQueueFull()) {
			//System.out.println("Overflow! Unable to add element: " + item);
		} else {
			tail++;
			if (tail == capacity - 1) {
				tail = 0;
			}
			queueArr[tail] = item;
			currentSize++;
			//System.out.println("Element " + item + " is pushed to Queue !");
		}
	}

	public String dequeue() {
		if (isQueueEmpty()) {
			//System.out.println("Underflow ! Unable to remove element from Queue");
		} else {
			//System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
			head++;
			String string = queueArr[head - 1];
			if (head == capacity - 1) {
				head = 0;
			}
			currentSize--;
			return string;
		}
		return null;
	}
}
