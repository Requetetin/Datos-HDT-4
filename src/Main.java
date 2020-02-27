/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception{
		Factory factory = new Factory();
		
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");
		System.out.println("Desea realizar una operacion con lo siguiente: ");

		iCalculadora calc = new Calculadora(); //ESTO SE HACE EN EL SINGLENTON
		//iStack<Integer> stack = new Array<Integer>();  //ESTE SE CREA AHORA EN EL FACTORY

		File archive = new File("datos.txt");//Busca el archivo llamado datos, y si existe, opera.
		if(archive.exists()){
			Scanner data = new Scanner(archive);
			Scanner readI = new Scanner(System.in);
			Scanner readInt = new Scanner(System.in);
			String all = data.nextLine();
			System.out.println(all);
			boolean flag = true;
			while (flag) {
				System.out.println("¿De que forma desea realizar su operacion?\n1. ArrayList\n2. Vector\n3. Lista simplemente encadenada\n4. Lista doblemente encadenada\n5. Lista circular\n6. Salir");
				try {
					int option = readInt.nextInt();
					if(option<1 || option>6) {
						throw new Exception();
					}
					else if (option == 6) {
						flag = false;
					}
					iStack ourStack = factory.getType(option);
					String[] separated = all.split(" ");//Separa el String por espacios
					for(int i=0; i<separated.length;i++){
						try{
							int a = Integer.parseInt(separated[i]);
							ourStack.push(a);
							//Trata de convertir cada elemento a un entero, y si lo logra, lo mete a un stack
						}catch(NumberFormatException e){
							//Si encuentra un elemento que no se convierte a entero, llama a los ultimos dos numeros ingresados, al igual que al simbolo ingresado
							String b = separated[i];
							if(b.equals("+") || b.equals("-")|| b.equals("/")||b.equals("*")) {
								int d = (int) ourStack.pop();
								int c = (int) ourStack.pop();
								switch(b){
									case "+":
										ourStack.push(calc.sumar(c,d));
									break;
									case "-":
										ourStack.push(calc.restar(c,d));
									break;
									case "*":
										ourStack.push(calc.multiplicar(c,d));
									break;
									case "/":
										ourStack.push(calc.dividir(c,d));
									break;
								}
							}
							else {
								System.out.println("No ha ingresado un dato valido");
								int resp = -111111;
								ourStack.push(resp);
							}
								
						}
					}
					
					//
					if(ourStack.peek().equals(11111111)||ourStack.peek().equals(-111111)) {
						System.out.println("Vuelva a intentarlo");
					}
					else 
						System.out.println("Este es su resultado: "+ourStack.peek());
					
				}
				catch(Exception E) {
					System.out.println("\nNo ha escogido una opcion valida, intentelo de nuevo por favorrrrrr\n");
					  
				}
			}
		
		}

		else{
			System.out.println("No hay datos en el archivo");
		}
	
	}
}