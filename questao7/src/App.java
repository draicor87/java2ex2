public class App {
    public static void main(String[] args) throws Exception {
        int quadrado = 0, j = 15;
        
		System.out.println("\nEste programa apresenta os quadrados dos números inteiros de 15 a 200.\n");

		while (j > 14 && j < 201)
			{			
			quadrado = j * j;

			System.out.printf("\nO quadrado de %d é: %d", j, quadrado);

			j = j + 1;
			}
    }
}
