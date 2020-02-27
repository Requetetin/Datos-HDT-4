/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

import java.util.*;


interface iList<E>{

	/**
	 * valor es agregado al final de la lista
	 * @param value
	 */
   public void addLast(E value); //Como push
   // post: value is added to end of list

   /**
    * Devuelve el ultimo valor de la lista
    * @return ultimo valor de lista
    */
   public E getLast(); //Como peek
   // pre: list is not empty
   // post: returns last value in list

   /**
    * Remueve el ultimo valor de la lista
    * @return valor removido
    */
   public E removeLast(); //Como pop
   // pre: list is not empty
   // post: removes last value from list

   
}