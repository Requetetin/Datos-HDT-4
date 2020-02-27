/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

//Extraido de: https://uvg.instructure.com/courses/13715/pages/listas-circulares?module_item_id=195297 
import java.util.*;

public class Circular<E> extends aList<E>{
	protected Node<E> tail; 
	protected int count;

	

	/**
	 * Constructor
	 */
	public Circular()
	// pre: constructs a new circular list
	{
	   tail = null;
	   count = 0;
	}


	/**
	 * Tamaño
	 */
	public int size(){
		return count;
	}


	/**
	 * agrega un elemento a la cola de la lista
	 */
	public void addLast(E value)
	// pre: value non-null
	// post: adds element to tail of list
	{
	   // new entry:
	   addFirst(value);
	   tail = tail.next();
	}

	/**
	 * Agrega un elemento al inicio de la lista
	 * @param value
	 */
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


	 	

	/**
	 * Reueve el elemento al final de la cola y devuelve el valor
	 */
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

	/**
	 * Devuelve el ultimo elemento de la cola
	 */
	public E getLast(){
		return tail.value();
	}

	/**
	 * Agrega un elemento a la cola
	 */
	public void push(E item){
		addLast(item);
	}
	
	/**
	 * remueve el ultimo elemento de la cola
	 */
	public E pop(){
		return removeLast();
	}
	
	/**
	 * devuelve el ultimo elemento
	 */
	public E peek(){
		return getLast();
	}
	


   

}