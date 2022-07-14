public class App {
    public static void main(String[] args) throws Exception {
        int numero, soma = 0, j = 0, quadrado = 0, somaQ = 0, media = 0;
        
		System.out.println("\nNeste programa voce digita numeros POSITIVOS,\no programa calcula e mostra o resultado da SOMA dos mesmos,\no resultado da soma dos QUADRADOS dos mesmos e a MEDIA dos mesmos.\n \nObs.: O programa encerra digitando o numero 0.\n");

		System.out.printf("Digite o numero %d: ", j + 1);
		numero = Integer.parseInt(System.console().readLine());

		while (numero > 0)
			{	
                
                soma = soma + numero;
			    quadrado = numero * numero;
			    somaQ = somaQ + quadrado;
			    j = j + 1;
			    media = soma / j;
			    System.out.printf("Digite o numero %d: ", j + 1);
			    numero = Integer.parseInt(System.console().readLine());
                
			}
		
		System.out.printf("\nResultado da soma = %d", soma);
		System.out.printf("\nResultado do quadrado da soma = %d", somaQ);
		System.out.printf("\nMedia dos numeros digitados = %d", media);
    }
}
