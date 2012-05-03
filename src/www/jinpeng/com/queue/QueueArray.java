package www.jinpeng.com.queue;

/**
 * 将数组变为环形数组
 * 少一个存储单元的方案实现队列
 * 各实现 时间复杂度o(1)
 * @author root
 *
 */
public class QueueArray implements Queue {


	private static final int cap = 7;//队列默认大小
	public Object[] elements;
	private int capcity;//数组的大小elements.length
	private int front;//队首指针
	private int rear;//队尾指针

	public QueueArray(){

	}
	public QueueArray(int cap){
		capcity = cap + 1;
		elements = new Object[capcity];
		front = rear = 0;
	}

	@Override
	public int getSize() {
		return (rear-front+capcity)%capcity;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front==rear;
	}

	@Override
	public void enqueue(Object e) {
		if(getSize()==capcity-1){
			expandSpace();
		}

		elements[rear] = e;
		rear = (rear+1)%capcity;
	}

	private void expandSpace(){
		Object[] a = new Object[elements.length*2];
		int i = front;
		int j = 0;

		while(i!=rear){
			//将从front开始到rear前一个存储单元的元素复制到新数组
			a[j++] = elements[i];
			i=(i+1)%capcity;//确保取一圈就取完
		}
		elements = a;
		capcity = elements.length;
		front = 0;
		rear = j;
	}

	@Override
	public Object dequeue() {
		if(isEmpty()){
			System.out.println("错误，队列为空");
		}
		Object obj = elements[front];
		elements[front] = null;
		front = (front+1)%capcity;
		return obj;
	}

	@Override
	public Object peek() {
		if(isEmpty()){
			System.out.println("错误，队列为空");
		}
		return elements[front];
	}



}
