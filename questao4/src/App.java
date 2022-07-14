public class App {
    public static void main(String[] args) throws Exception {
        int idade, soma = 0, j = 0, media = 0;
        
		System.out.println("\nNeste programa voce digita a idade de varias pessoas,\no programa calcula e mostra a MEDIA das idades.\n \nObs.: O programa encerra digitando o numero 0.");

		System.out.printf("\nDigite a idade da pessoa %d: ", j + 1);
		idade = Integer.parseInt(System.console().readLine());

		while (idade > 0)
			{			
			soma = soma + idade;
			j = j + 1;
			media = soma / j;
			System.out.printf("Digite a idade da pessoa %d: ", j + 1);
			idade = Integer.parseInt(System.console().readLine());
			}
		System.out.printf("\nA media das idades é = %d\n", media);
    }
}
