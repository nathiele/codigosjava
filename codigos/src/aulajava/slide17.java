package aulajava;

public class slide17 {

	public static void main(String[] args) {
		String str = "Isto � uma string do java";
		
		//o metodo split quebra a string e varias outras,
		//pelo separador desejado
		String[] palavras = str.split("");
		
		int i= str.indexOf("uma"); //retorna o indice da palavra string
		
		if(str.startsWith("Ol�")|| str.endsWith("Mundo!!")){
			//testa o ocme�o e o fim da string - retorna boolean
		}
		
		str = str.trim(); //elimina os espa�os em branco no inicio e fim
		str = str.replace('a','@'); //substitui os caracteres
		
		//substitui uma palavra (usa express�es regulares)
		str = str.replaceAll("String", "Cadeia de caracteres");

	}

}
