package www.jinpeng.com.queue;

public interface Queue {
	public int getSize();
	public boolean isEmpty();

	public void enqueue(Object e);
	public Object dequeue();
	public Object peek();

}
