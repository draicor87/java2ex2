public class App {
    public static void main(String[] args) throws Exception {
        int numero, soma = 0, j = 0, quadrado = 0, somaQ = 0, media = 0;
        
		System.out.println("\nNeste programa voce digita numeros POSITIVOS,\no programa calcula e mostra o QUADRADO dos mesmos.\n \nObs.: O programa encerra digitando um numero NEGATIVO.");

		System.out.printf("\nDigite o numero %d: ", j + 1);
		numero = Integer.parseInt(System.console().readLine());

		while (numero >= 0)
			{			
			quadrado = numero * numero;
			
			System.out.printf("\nO quadrado de %d eh: %d\n", numero, quadrado);

			j = j + 1;
			
			System.out.printf("\nDigite o numero %d: ", j + 1);
			numero = Integer.parseInt(System.console().readLine());
			}
    }
}
