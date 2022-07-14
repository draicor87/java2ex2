public class App {
    public static void main(String[] args) throws Exception {
        int numero, soma = 0, i = 0;
        
		System.out.println("\nEste programa calcula a SOMA de DEZ numeros.\n");

		while (i < 10)
			{
			System.out.printf("Digite o numero %d: ", i + 1);
			numero = Integer.parseInt(System.console().readLine());
			soma = soma + numero;
			i = i + 1;
			}

		System.out.printf("\nResultado da soma = %d", soma);
    }
}
