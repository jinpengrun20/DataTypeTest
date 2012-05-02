package www.jinpeng.com.stack;

/**
 * 栈的 线性顺序存储 各个操作都是o(1)时间内完成。
 * @author root
 *
 */
public class StackArray implements Stack {

	private final int len = 8;
	private Object[] elements;
	private int top;//栈顶

	public StackArray(){
		top = -1;
		elements = new Object[len];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top<0;
	}

	@Override
	public void push(Object e) {
		if(getSize()>=elements.length){
			expandSpace();
		}
		elements[++top]=e;
	}

	private void expandSpace(){
		Object[] newos = new Object[getSize()*2];
		for(int i=0;i<elements.length;i++){
			newos[i]=elements[i];
		}

		elements = newos;
	}

	@Override
	public Object pop() throws RuntimeException {
		if(getSize()<1){
			throw new RuntimeException("错误，堆栈为空。");
		}
		Object o = elements[top];
		elements[top]=null;
		top--;
		return o;

	}

	@Override
	public Object peek() throws RuntimeException {
		if(getSize()<1){
			throw new RuntimeException("错误，堆栈为空。");
		}
		return elements[top];
	}

}
