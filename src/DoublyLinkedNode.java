/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 4
 */

//Extraido de: https://uvg.instructure.com/courses/13715/pages/doubly-linked-list?module_item_id=195293

public class DoublyLinkedNode<E>{
	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;

	/**
	 * 
	 * @param v
	 * @param next
	 * @param previous
	 */
	public DoublyLinkedNode(E v,
	DoublyLinkedNode<E> next,
	DoublyLinkedNode<E> previous)
	{
	    data = v;
	    nextElement = next;
	    if (nextElement != null)
	        nextElement.previousElement = this;
	    previousElement = previous;
	    if (previousElement != null)
	        previousElement.nextElement = this;
	}

	/**
	 * Constructor de un unico elemento
	 * @param v
	 */
	public DoublyLinkedNode(E v)
	// post: constructs a single element
	{
	    this(v,null,null);
	}

	/**
	 * Hace referencia al proximo valor
	 * @param next
	 */
	public void setNext(DoublyLinkedNode<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

	/**
	 * Retorna un valor asociado a este elemento
	 * @return valor
	 */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   /**
    * Hace referencia al valor previo de la lista
    * @return valor previo
    */
   public DoublyLinkedNode<E> previous()
   // post: returns reference to previous value in list
   {
      return previousElement;
   }

}