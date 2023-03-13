package conversor;

import javax.swing.JOptionPane;

public class Calculos {
	
	private int deDivisa, aDivisa;
	private double valor, resultado;
	
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public int getDeDivisa() {
		return deDivisa;
	}
	public void setDeDivisa(int deDivisa) {
		this.deDivisa = deDivisa;
	}
	public int getaDivisa() {
		return aDivisa;
	}
	public void setaDivisa(int aDivisa) {
		this.aDivisa = aDivisa;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Calculos() {
	}
	
	//Metodos para operaciones
	public double distinguir() {
		switch (deDivisa) {
		  case 0://de $Arg a....
			  switch (aDivisa) {
			  case 0://A $Argentino
				  showError("Seleccionó convertir de $Arge a $Argentino", "Error");
			  break;
			  case 1: //a 1 que es EURO
				  resultado = valor * 0.0047;
			  break;
			  case 2:// a Dolar
				  resultado = valor * 0.0050;
			  break;
			  case 3://Libras Esterlinas
				  resultado = valor * 0.0050;
			  break;
			  case 4://Yen Japonés
				  resultado = valor * 0.68;
			  case 5://won sul-coreano
				  resultado = valor * 6.59;
			  break;  
			  }
			    
		  break;//case 0
		  case 1: //Euro a $Argentino
			   resultado = valor * 211.98;
		  break;
		  case 2: //Dolar a Arg.
			  resultado = valor * 200.38;
		  break;
		  case 3: //Libras Esterlinas a $Arg
			  resultado = valor * 238.80;
		  break;
		  case 4:// de Yen Japones a $ Arg
			  resultado = valor * 238.80;
		  break;
		  case 5://Won sul-coreano
			  resultado = valor *0.15;
		}
		return resultado;
	}
		
	  public static void showError(String mensaje, String titulo) {
		    JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

	  }

}
