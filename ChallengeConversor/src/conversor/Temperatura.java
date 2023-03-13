package conversor;

import javax.swing.JOptionPane;

public class Temperatura {
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
	
	public Temperatura() {
	}
	
	//Metodos para operaciones
	public double distinguir() {
		switch (deDivisa) {
		  case 0://de Grados Celsius a
			  switch (aDivisa) {
			  case 0://Celsius
				  showError("Seleccionó convertir de Celsius a Celsius", "Error");
			  break;	  
			  case 1: //a  Kelvin
				  resultado = valor+273.15;
			  break;
			  case 2:// a Farenheit
				  resultado = (valor*9/5)+32;
			  break;
			  }
			 
		  break;//case 0
		  case 1: //Kelvin a
			  switch (aDivisa) {
			  case 0: //a Celsius
				  resultado = valor - 273.15;
			  break;	  
			  case 1: //a  Kelvin
				  showError("Seleccionó convertir de Kelvin a Kelvin", "Error");
			  break;
			  case 2:// a Farenheit
				  resultado = (valor - 273.15) * 9/5 + 32 ;
			  break;
			  }
		  break;//case 1
		  case 2: //Farenheit a 
			  		switch (aDivisa) {
			  		case 0://celsius
			  			resultado = (valor - 32) * 5/9 ;
			  		break;
			  		case 1://Kelvin
			  			resultado = (valor - 32) * 5/9 + 273.15 ;
			  		break;
			  		case 2:
			  			 showError("Seleccionó convertir de Farenheit a Farenheit", "Error");
			  		break;	
			  		}
		  break;//case 2
		  
		}
		return resultado;
	}
	  public static void showError(String mensaje, String titulo) {
		    JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
 
	  }

}
