package www.jinpeng.com.stack;

import www.jinpeng.com.util.Node;

public class SLNode implements Node {
	private Object element;
	private SLNode next;


	public SLNode(){
		this(null,null);
	}

	public SLNode(Object ele,SLNode e){
		this.element = ele;
		this.next = e;
	}







	//**********************************interface method******************************************//

	public SLNode getNext() {
		return next;
	}

	public void setNext(SLNode next) {
		this.next = next;
	}

	@Override
	public void setData(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
