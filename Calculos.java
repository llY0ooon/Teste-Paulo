
public class Calculos {
	
	Calculos () {
		
	}
	public void CDecimalParaBinario(int ND) {   //metodo onde o numero decimal e dividido por 2 e printa o resto em modo recursivo.
		
		if (ND > 0) {
			CDecimalComFracaoParaBinario(ND / 2);
			int r = ND % 2;
			System.out.print(r );
					
		}			
	}
	
	public void CfracaoParaBinario(double f) {
		f = f -(int)f;
		
		while (f != 0.0) {
			f *= 2;
			 int resto = (int)f;
		        f -= resto;
		        
		        System.out.printf("%d", resto);
		}
	}
	
	public void CDecimalComFracaoParaBinario(double numero) {
		
	    CDecimalParaBinario((int)numero);
	    System.out.printf(".");
	    CfracaoParaBinario( numero);
	    
	}

	
	public void CBinarioParaDecimal(int NB) {   //Metodo do binario para decimal usando o math.pow e adicionando um contador pra potencia dando como retorno a variavel dec.
		int dec=0,potencia=0;
		
		while(NB !=0) {
			
			dec+=((NB%10)*Math.pow(2,potencia));
			
			NB=NB/10;
			
			potencia++;
			
		}
		
		System.out.println(dec);		
	}
}
