/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 4
 */

//Extraido de: https://uvg.instructure.com/courses/13715/pages/singly-linked-list?module_item_id=195289

import java.util.*;


public class Single<E> extends aList<E>{
	protected int count; // list size
   protected Node<E> head; // ref. to first element
   

   /**
    * Generar una lista vacia
    */
   public Single()
   {
      head = null;
      count = 0;
   }
   
   /**
    * @return count
    * devuelve el numero de elementos en la lista
    */
   public int size()
  {
    return count;
  }

   /**
    * Anadir primero
    * @param value
    */
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }

  /**
   * remueve y devuelve el primer valor del inicio de una lista
   * @return valor
   */
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
  {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }

  /**
   * Devueve primer valor de una lista
   * @return
   */
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }

  /**
   * anade un valor al final de una lista
   */
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
  	 
         finger.setNext(temp);
      } else head = temp;
    
    count++;
    
   }

  /**
   * Remueve un valr al final de una lista
   */
   public E removeLast(){
      if(head == null){
        return null;
      }
      if(head.next() == null){
        return null;
      }

      Node<E> temp = head;
      while(temp.next().next() !=null) temp = temp.next();
      
      temp.setNext(null);
      count --;
      return head.value();
   }

   /**
    * Devuelve el ultimo valor
    */
   public E getLast(){
      return head.value();
   }
   
/**
 * Hace push a la lista
 */
  public void push(E item){
    addLast(item);
  }
  /**
   * Hace pop a la lista
   */
  public E pop(){
    return removeLast();
  }
  /**
   * Hace peek a la lista
   */
  public E peek(){
    return getLast();
  }


}