public class App {
    public static void main(String[] args) throws Exception {
        double litros, distancia, consMedio = 0, viajens, mediaD = 0, mediaL = 0, j = 1, somaL = 0, somaD = 0;
        
		System.out.println("\nNeste programa voce digita a quantidade de viajens que realizou,\na quantidade de combustivel gasto\ne a distancia percorrida em cada viajem.\nO programa calcula o consumo medio do carro.\n");

		System.out.printf("\nDigite a quantidade de viajens feitas: ");
		viajens = Double.parseDouble(System.console().readLine());
		System.out.printf("Digite a quantidade de combustivel gasto na viajem %.0f em litros: ", j);
		litros = Double.parseDouble(System.console().readLine());
		System.out.printf("Digite a distancia percorrida na viajem %.0f em kilometros: ", j);
		distancia = Double.parseDouble(System.console().readLine());

		while (viajens > j)
			{			
			somaL = somaL + litros;
			somaD = somaD + distancia;

			j = j + 1;

			System.out.printf("Digite a quantidade de combustivel gasto na viajem %.0f em litros: ", j);
			litros = Double.parseDouble(System.console().readLine());
			System.out.printf("Digite a distancia percorrida na viajem %.0f em kilometros: ", j);
			distancia = Double.parseDouble(System.console().readLine());
			
			}
		mediaL = somaL / viajens;
		mediaD = somaD / viajens;
		consMedio = mediaD / mediaL;
		System.out.printf("\nO consumo medio das viajens é = %.1f kM/L\n", consMedio);
    }
}
