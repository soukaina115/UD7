public class Activitat1 {
	
	public static double mmain (String[] text) {
		
		double num = 0;
		while (true) {
			String dato =JOptionPane.showInputDialog(text);
			
			if(!dato.equals(null)) {
				try {
					num = Double.parseDouble(dato);
					if (num > 0) {
						return num;
					}else {
					JOptionPane.showMessageDialog(null, "Valor introducido no valido");
					}
				} catch (NumberFormatException e) {
					
				}
			}
		}
		int n;
		double nota, suma = 0, mayor, menor;
	}
}