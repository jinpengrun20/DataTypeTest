package www.jinpeng.com.queue;

import www.jinpeng.com.stack.SLNode;

public class QueueSlink implements Queue {

	private SLNode front;
	private SLNode rear;
	private int size;

	public QueueSlink(){
		front = new SLNode();
		rear = front;
		size = 0;

	}


	/**
	 * 返回队列大小
	 */
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public void enqueue(Object e) {
		SLNode news = new SLNode(e,null);
		rear.setNext(news);
		rear = news;
		size++;
	}

	@Override
	public Object dequeue() {
		SLNode next = front.getNext();
		front.setNext(next.getNext());
		size--;
		if(size<1)rear=front;
		return next.getData();
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

}
