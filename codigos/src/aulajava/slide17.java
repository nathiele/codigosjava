package aulajava;

public class slide17 {

	public static void main(String[] args) {
		String str = "Isto é uma string do java";
		
		//o metodo split quebra a string e varias outras,
		//pelo separador desejado
		String[] palavras = str.split("");
		
		int i= str.indexOf("uma"); //retorna o indice da palavra string
		
		if(str.startsWith("Olá")|| str.endsWith("Mundo!!")){
			//testa o ocmeço e o fim da string - retorna boolean
		}
		
		str = str.trim(); //elimina os espaços em branco no inicio e fim
		str = str.replace('a','@'); //substitui os caracteres
		
		//substitui uma palavra (usa expressões regulares)
		str = str.replaceAll("String", "Cadeia de caracteres");

	}

}
