import javax.swing.JOptionPane;

public class ExerForVetor2 {

	public static void main(String[] args) {
		int[] idades = new int[7];
		String texto = "";
		
		for(int i = 0; i < 7; i++){
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			texto = texto + idades[i] + "\n";
		
		}
		JOptionPane.showMessageDialog(null, "Idades: \n" + texto );

	}

}
