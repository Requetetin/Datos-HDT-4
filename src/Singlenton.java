/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 4
 */

public class Singlenton{
	public Calculadora instancia = null;

	

	public Calculadora getInstancia(){
		if(instancia == null){
			instancia = new Calculadora();
			return instancia;
		}else{
			return instancia;
		}
	}
}