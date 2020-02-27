/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */


import java.util.*;

public class Array<E> extends aStack<E>{

	protected ArrayList<E> lista;

	/**
	 * Constructor
	 */
	public Array(){
		lista = new ArrayList<E>();
	}

	/**
	 * agregar un elemento
	 */
	public void push(E item){
		lista.add(item);
	}

	/**
	 * Remover un elemento
	 */
	public E pop(){
		return lista.remove(size() -1);
	}

	/**
	 * devuelve el ultimo elemento
	 */
	public E peek(){
		return lista.get(size()-1);
	}
	/**
	 * Devuelve el tamanio de la lista
	 */
	public int size(){
		return lista.size();
	}
}