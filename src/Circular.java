import java.util.*;

public class Circular<E> extends aList<E>{
	protected Node<E> tail; 
	protected int count;

	

	public Circular()
	// pre: constructs a new circular list
	{
	   tail = null;
	   count = 0;
	}


	public int size(){
		return count;
	}


	public void addLast(E value)
	// pre: value non-null
	// post: adds element to tail of list
	{
	   // new entry:
	   addFirst(value);
	   tail = tail.next();
	}

	public void addFirst(E value){
		Node<E> temp = new Node<E>(value);

		if(tail != null){
			temp.setNext(tail.next());
			tail.setNext(temp);
		}else{
			tail = temp;
			tail.setNext(tail);
		}
		count ++;
	}


	 	

	public E removeLast()
	// pre: !isEmpty()
	// post: returns and removes value from tail of list
	{
	   Node<E> finger = tail;
	   while (finger.next() != tail) {
	       finger = finger.next();
	   }
	   // finger now points to second-to-last value
	   Node<E> temp = tail;
	   if (finger == tail)
	   {
	       tail = null;
	   } else {
	       finger.setNext(tail.next());
	       tail = finger;
	   }
	   count--;
	   return temp.value();
	}

	public E getLast(){
		return tail.value();
	}



	public void push(E item){
		addLast(item);
	}
	public E pop(){
		return removeLast();
	}
	public E peek(){
		return getLast();
	}
	


   

}