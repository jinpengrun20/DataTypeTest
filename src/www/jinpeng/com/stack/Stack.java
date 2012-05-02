package www.jinpeng.com.stack;

public interface Stack {
public int getSize();
public boolean isEmpty();
public  void push(Object e);
public Object pop() throws RuntimeException;
public Object peek() throws RuntimeException;
}
