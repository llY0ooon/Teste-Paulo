
public class Calculos {
	
	Calculos () {
		
	}
	public void Cdeciamlparabinario(int ND) {   //metodo onde o numero decimal e dividido por 2 e printa o resto em modo recursivo.
		
		if (ND > 0) {
			Cdeciamlparabinario(ND / 2);
			System.out.print(ND % 2 );
					
		}			
	}
	public void Cbinarioparadecimal(int NB) {   //Metodo do binario para decimal usando o math.pow e adicionando um contador pra potencia dando como retorno a variavel dec.
		int dec=0,potencia=0;
		
		while(NB !=0) {
			
			dec+=((NB%10)*Math.pow(2,potencia));
			
			NB=NB/10;
			
			potencia++;
			
		}
		
		System.out.println(dec);		
	}
}
