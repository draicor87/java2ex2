public class App {
    public static void main(String[] args) throws Exception {
        double precoUn, quantidade, venda = 0, fatTotal = 0, j = 1, quantMerc = 0;
		String nome;
        
		System.out.println("\nEste programa recebe a quantidade de mercadorias, o nome das mercadorias,\no preço unitario de cada mercadoria e a quantidade total vendida no mes.\nO programa calcula e mostra o faturamento total mensal do armazem.\n");

		System.out.printf("Digite a quantidade de mercadorias: ");
		quantMerc = Double.parseDouble(System.console().readLine());
		System.out.printf("\nDigite o nome da mercadoria %.0f: ", j);
		nome = (System.console().readLine());
		System.out.printf("Digite o preço unitario da  mercadoria %.0f: ", j);
		precoUn = Double.parseDouble(System.console().readLine());
		System.out.printf("Digite a quantidade vendida no mes da mercadoria %.0f: ", j);
		quantidade = Double.parseDouble(System.console().readLine());

		while (quantMerc > 1)
			{			
			venda = quantidade * precoUn;
			fatTotal = fatTotal + venda;

			j = j + 1;
			quantMerc = quantMerc - 1;
				
			System.out.printf("\nDigite o nome da mercadoria %.0f: ", j);
			nome = (System.console().readLine());
			System.out.printf("Digite o preço unitario da  mercadoria %.0f: ", j);
			precoUn = Double.parseDouble(System.console().readLine());
			System.out.printf("Digite a quantidade vendida no mes da mercadoria %.0f: ", j);
			quantidade = Double.parseDouble(System.console().readLine());

			
			}
		
		System.out.printf("\nFaturamento total mensal: R$ %.2f \n", fatTotal);
    }
}
