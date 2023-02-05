
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
		
	}

	private static void metodo2() {
		System.out.println("Inicio metodo2");
		for(int i = 1; i <= 5 ; i++) {
			System.out.println(i);
			/*
			try {
				if ( i == 3) {
					int num = 0; 
					int resultado = i/num;
					System.out.println(resultado);
				}
				
				String test = null;
				System.out.println(test.toString());
			} catch(ArithmeticException | NullPointerException exception) {
				System.out.println("Atrapo exception");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			} catch (NullPointerException exception) {
				System.out.println("Atrapo nullpointer");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}*/
		}
		/*
		ArithmeticException ae = new ArithmeticException();
		throw ae; */
		throw new ArithmeticException("Arithmetic error");
		//System.out.println("Fin metodo2"); No puede haber codigo a ejecutar debajo del throw
	}
}
