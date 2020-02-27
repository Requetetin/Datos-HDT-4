import java.util.ArrayList;

public abstract class aStack<E> implements iStack<E>{
	

	/**
	 * Constructor
	 */
	public aStack() {
		lista = new ArrayList<E>();
		
	}
	
	public boolean empty(){

		return size()==0;
	}

}