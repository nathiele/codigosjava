package aulajava;

public class slide44 {

	public static void main(String[] args) {
		char letras[] = {'A', 'B', 'C', 'D', 'E'};
		int i;
		for(i=0; i<letras.length; i++){
			if(letras[i]== 'C'){
				break;
			}
		}
		System.out.println("Ultimo indice: " +i);

	}

}
