package ejercicios9_MetodosMatches;

public class Ejercicio1 {
	
	//Utilizando el método matches de la clase String, crea y comprueba las siguientes expresiones regulares: 
	
	public void show() {
		// 1. que la cadena sea exactamente “lunes”.
		System.out.println("1º");
		System.out.println("lunes".matches("lunes"));
		System.out.println("lune".matches("lunes"));
		System.out.println("=========================\n");
		
		// 2. que la cadena sea de tres letras, mayúsculas o minúsculas.
		System.out.println("2º");
		System.out.println("AbC".matches("[a-zA-Z][a-zA-Z][a-zA-Z]"));
		System.out.println("ABCD".matches("[a-zA-Z][a-zA-Z][a-zA-Z]"));
		System.out.println("=========================\n");
		
		// 3. que la cadena contenga 5 o más caracteres que no sean la ñ, la z ni la x.
		System.out.println("3º");
		System.out.println("abcde".matches("[a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]]"));
		System.out.println("abñzx".matches("[a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]]"));
		System.out.println("abcd".matches("[a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]][a-z&&[^ñzx]]"));
		System.out.println("=========================\n");
		
		// 4. que la cadena no empiece con un número.
		System.out.println("4º");
		System.out.println("a".matches("^\\D"));
		System.out.println("1".matches("^\\D"));
		System.out.println("=========================\n");		
		
		// 5. que la cadena tenga varios caracteres excepto la b.
		System.out.println("5º");
		System.out.println();
		System.out.println();
		System.out.println("=========================\n");
		
		// 6. que la cadena sea un número de teléfono.
		System.out.println("6º");
		System.out.println();
		System.out.println();
		System.out.println("=========================\n");
		
		// 7. que la cadena sea un DNI.
		System.out.println("7º");
		System.out.println();
		System.out.println();
		System.out.println("=========================\n");
		
		// 8. que la cadena sea un nombre, es decir, que no tenga espacios, que no sea una cadena vacía 
		//y que empiece por mayúsculas.
		System.out.println("8º");
		System.out.println();
		System.out.println();
		System.out.println("=========================\n");
		
		// 9. que la cadena empiece con vocal y luego tenga varias consonantes o ninguna. 
		System.out.println("9º");
		System.out.println();
		System.out.println();
		System.out.println("=========================\n");
		
		// 10. que la cadena sea un número positivo más pequeño que 300.
		System.out.println("10º");
		System.out.println();
		System.out.println();
		System.out.println("=========================\n");	
		
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
