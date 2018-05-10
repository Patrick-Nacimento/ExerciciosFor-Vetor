import java.util.Scanner;

public class ExerForVetor3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de registros que deseja cadastrar: ");
		int registros = Integer.parseInt(teclado.nextLine());
		double[] precos = new double[registros];
		
		for(int i = 0; i < registros; i++){
		
			System.out.print("Preços : ");
			precos[i] = Double.parseDouble(teclado.nextLine());
			
		}
		double somaPrecos = 0;
		for(int i = 0; i < precos.length; i++) {
			somaPrecos += precos[i];
		}
		System.out.println("A soma dos preços é: " + somaPrecos);
			
		

	}

}
