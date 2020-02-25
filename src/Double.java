

public class Double<E> extends aList<E>{
	protected int count;
	protected dNode<E> head;
	protected dNode<E> tail;

	public Dobule()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}


	public void addFirst(E value)
	// pre: value is not null
	// post: adds element to head of list
	{
	   // construct a new element, making it head
	   head = new dNode<E>(value, head, null);
	   // fix tail, if necessary
	   if (tail == null) tail = head;
	   count++;
	}


	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
	   // construct new element
	   tail = new dNode<E>(value, null, tail);
	   // fix up head
	   if (head == null) head = tail;
	   count++;
	}


	public E removeLast()
	// pre: list is not empty
	// post: removes value from tail of list
	{
	   dNode<E> temp = tail;
	   tail = tail.previous();
	   if (tail == null) {
	       head = null;
	   } else {
	       tail.setNext(null);
	   }
	   count--;
	   return temp.value();
	}
	
}