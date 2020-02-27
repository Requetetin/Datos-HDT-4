/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 4
 */

import java.util.Vector;

//Extraido de Duane A Bailey (2007) java structures in java for principled programmer edición raiz 7
public class StackVector<E> implements iStack<E> {

	private Vector<E> stack;
	private boolean vacio;
	
	/**
	 * Constructor
	 */
	public StackVector() {
		stack = new Vector<E>();
	}
	
	/**
	 * Verifica y devuelve si el stack esta vacio
	 */
	public boolean empty() {
		if(stack.size()<= 0 ) {
			vacio = true;
		}
		else {
			vacio = false;
		}
		
		return vacio;
	}

	/**
	 * Devuelve el ultimo elemento del stack
	 */
	public E peek() {
		
		return stack.lastElement();
	}

	/**
	 * Remueve el ultimo elemento del stack
	 */
	public E pop() {
		
		return stack.remove(stack.size()-1);
	}

	/**
	 * Busca un elemento y devuelve el valor de su indice
	 * @param item
	 * @return index of item
	 */
	public int search(E item) {
		
	return stack.indexOf(item);
		
		
	}


	/**
	 * Agregar al stack
	 */
	public void  push (E item) {
		stack.add(item);
	}


	/**
	 * Verifica el tamaño del stack
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


}
