package aulajava;

public class slide16 {

	public static void main(String[] args) {
	String str = ("Isto � uma string do java");
	String xyz = new String("Isto � uma string do java");
	
	if(str == xyz) System.out.println("IGUAL");
	else System.out.println("DIFERENTE");
	
	if(str.equals(xyz)){
		//maneira correta de se comparar o ocnteudo das strings
	}
	
	System.out.println("tamanho da string:" + str.length());
	
	System.out.println("substring: "+str.substring(0,10));
	
	System.out.println("caracter na posi��o 5:  "+str.charAt(5));
	}

}
