/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

//Extraido de: https://uvg.instructure.com/courses/13715/pages/doubly-linked-list?module_item_id=195293

public class Double<E> extends aList<E>{
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;

	/**
	 * Constructor
	 */
	public Double()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}

	/**
	 * Devuelve el tamanio
	 */
	public int size(){
		return count;
	}

	/**
	 * Agrega un valor al final de la cola de la lista
	 */
	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
	   // construct new element
	   tail = new DoublyLinkedNode<E>(value, null, tail);
	   // fix up head
	   if (head == null) head = tail;
	   count++;
	}


	/**
	 * Remueve el elemento final de la lista
	 */
	public E removeLast()
	// pre: list is not empty
	// post: removes value from tail of list
	{
	   DoublyLinkedNode<E> temp = tail;
	   tail = tail.previous();
	   if (tail == null) {
	       head = null;
	   } else {
	       tail.setNext(null);
	   }
	   count--;
	   return temp.value();
	}

	/**
	 * Devuelve el ultimo de la lista
	 */
	public E getLast(){
		return tail.value();
	}

/**
 * Agrega un elemento al final de la lista
 */
	public void push(E item){
		addLast(item);
	}
	/**
	 * Remueve el ultimo elemento de la lista
	 */
	public E pop(){
		return removeLast();
	}
	/**
	 * devuelve el ultimo elemento de la lista
	 */
	public E peek(){
		return getLast();
	}
	
}