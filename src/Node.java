/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

//Extraido de: https://uvg.instructure.com/courses/13715/pages/singly-linked-list?module_item_id=195289

public class Node<E>
{
   protected E data; // value stored in this element
   protected Node<E> nextElement; // ref to next

   /**
    * un elemento como el nuevo inicio de la lista
    * @param v
    * @param next
    */
   public Node(E v, Node<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   /**
    * crea una nueva cola con un valor v
    * @param v
    */
   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   /**
    * referencia al valor siguiente en la lista
    * @return siguiente elemento
    */
   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   /**
    * referencia al siguiente valor
    * @param next
    */
   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   /**
    * Devuelve valor asociado al elemento
    * @return valor
    */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   /**
    * Define un valor asociado con el elemento
    * @param value
    */
   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}