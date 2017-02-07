
import java.util.ArrayList;


public class StackArrayList<E>
 implements iPila<E>
{
	protected ArrayList<E> data;

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(data.size()-1);
	}
	
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return data.size() == 0;
	}
}
