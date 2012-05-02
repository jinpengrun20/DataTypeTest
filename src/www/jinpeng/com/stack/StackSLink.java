package www.jinpeng.com.stack;
/**
 * 所有操作均在O(1)时间内完成。
 * @author root
 *
 */
public class StackSLink implements Stack {

	private SLNode top;//栈顶
	private int size;//大小

	public StackSLink(){
		top = null;
		size = 0;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public void push(Object e) {
		SLNode sl = new SLNode(e , top);
		top = sl;
		size++;
	}

	@Override
	public Object pop() throws RuntimeException {
		if(size==0){
			System.out.println("为空");
		}

		Object e = top.getData();
		top = top.getNext();
		size --;
		return e;
	}

	@Override
	public Object peek() throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

}
