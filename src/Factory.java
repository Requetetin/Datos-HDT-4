/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

public class Factory{
	public iStack getType(int option) {
		
		if(option==1) {
			return new Array();
		}
		if(option == 2) {
			
			return new StackVector();
		}
		if(option == 3) {
			
			return new Single();
		}
		if(option ==4) {
			
			return new Double();
		}
		if(option==5) {
			
			return new Circular();
		}
		else
			return new Array();
	}
}