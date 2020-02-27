/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

//Extraido de

import java.util.ArrayList;

public abstract class aStack<E> implements iStack<E>{
	

	/**
	 * Constructor
	 */
	public aStack() {
		ArrayList lista = new ArrayList<E>();
		
	}
	
	/**
	 * Si esta vacia
	 */
	public boolean empty(){

		return size()==0;
	}

}