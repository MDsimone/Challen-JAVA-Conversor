package conversor;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class Conversor extends JFrame {
	double valor; int deDivisa, aDivisa;
	
	private JPanel contentPane;
	private JTextField text_valor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 369);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_titulo = new JLabel("Seleccione una Opción de Conversión");
		lb_titulo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lb_titulo.setBounds(134, 11, 289, 41);
		contentPane.add(lb_titulo);
		
		JLabel lb_Titulo2 = new JLabel("");
		lb_Titulo2.setFont(new Font("Arial", Font.BOLD, 22));
		lb_Titulo2.setBounds(144, 44, 298, 41);
		contentPane.add(lb_Titulo2);
		lb_Titulo2.setVisible(false);
	
		
		JTextField	text_valor = new JTextField();
		text_valor.setBounds(34, 110, 141, 32);
		contentPane.add(text_valor);
		text_valor.setColumns(10);
		text_valor.setVisible(false);
		
		
		JLabel lb_monto = new JLabel("Valor");
		lb_monto.setFont(new Font("Arial", Font.BOLD, 16));
		lb_monto.setBounds(73, 91, 49, 14);
		contentPane.add(lb_monto);
		lb_monto.setVisible(false); 
		
		JLabel lb_de = new JLabel("DE");
		lb_de.setFont(new Font("Arial", Font.BOLD, 16));
		lb_de.setBounds(185, 89, 61, 19);
		contentPane.add(lb_de);
		lb_de.setVisible(false);
		
		JLabel lb_a = new JLabel("A");
		lb_a.setFont(new Font("Arial", Font.BOLD, 16));
		lb_a.setBounds(344, 91, 49, 14);
		contentPane.add(lb_a);
		lb_a.setVisible(false);
		

		JLabel lb_resultado = new JLabel("Resultado");
		lb_resultado.setFont(new Font("Arial", Font.BOLD, 16));
		lb_resultado.setBounds(127, 164, 102, 14);
		contentPane.add(lb_resultado);
		lb_resultado.setVisible(false);
		
		
		JComboBox Cbox_de = new JComboBox();
		Cbox_de.setModel(new DefaultComboBoxModel(new String[] {"$ Argentino", "Euro", "Dolar", "Libras Esterlinas", "Yen Japonés", "Won sul-coreano"}));
		Cbox_de.setToolTipText("");
		Cbox_de.setBounds(185, 110, 135, 32);
		contentPane.add(Cbox_de);
		Cbox_de.setVisible(false);
		
		
		JComboBox Cbox_a = new JComboBox();
		Cbox_a.setModel(new DefaultComboBoxModel(new String[] {"$ Argentino", "Euro", "Dolar", "Libras Esterlinas", "Yen Japonés", "Won sul-coreano"}));
		Cbox_a.setToolTipText("");
		Cbox_a.setBounds(339, 110, 149, 32);
		contentPane.add(Cbox_a);
		Cbox_a.setVisible(false);
		
		
		Cbox_de.addActionListener(new ActionListener() {
			   @Override
			   public void actionPerformed(ActionEvent e) {
			      // Aquí hacemos construccion del otro combo."$ Argentino".equals(itemSelec)
				   String itemSelec = (String)Cbox_de.getSelectedItem();
				   if (  itemSelec != "$ Argentino" ) {				  
					   Cbox_a.setSelectedIndex(0);
					   
				   }
				   
			   }
			});
		
		Cbox_a.addActionListener(new ActionListener() {
			   @Override
			   public void actionPerformed(ActionEvent e) {
			      // Aquí hacemos construccion del otro combo."$ Argentino".equals(itemSelec)
				   String itemSelec = (String)Cbox_a.getSelectedItem();
				   if (  itemSelec != "$ Argentino" ) {				  
					   Cbox_de.setSelectedIndex(0);
				   }
				   
			   }
			});
		
		
		JComboBox Cbox_de_grados = new JComboBox();
		Cbox_de_grados.setModel(new DefaultComboBoxModel(new String[] {"G.Celsius", "Kelvin", "Farenheit"}));
		Cbox_de_grados.setBounds(185, 110, 135, 32);
		contentPane.add(Cbox_de_grados);
		Cbox_de_grados.setVisible(false);
		
		JComboBox Cbox_A_grados = new JComboBox();
		Cbox_A_grados.setModel(new DefaultComboBoxModel(new String[] {"G.Celsius", "Kelvin", "Farenheit"}));
		Cbox_A_grados.setBounds(337, 115, 151, 27);
		contentPane.add(Cbox_A_grados);
		Cbox_A_grados.setVisible(false);
		
		
			
		JTextArea textResultado = new JTextArea();
		textResultado.setFont(new Font("Monospaced", Font.BOLD, 18));
		textResultado.setBounds(95, 183, 183, 32);
		contentPane.add(textResultado);
		textResultado.setVisible(false);
		
		JComboBox Cbox_menu = new JComboBox();
		Cbox_menu.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar un Conversor","Conversor de Moneda", "Conversor de Temperatura"}));
		Cbox_menu.setBounds(134, 44, 301, 41);
		contentPane.add(Cbox_menu);
		//MENU
		Cbox_menu.addActionListener(new ActionListener() {
			   @Override
			   public void actionPerformed(ActionEvent e) {
			String itemSelec = (String)Cbox_menu.getSelectedItem();
			if (  itemSelec == "Conversor de Moneda" ) {				   
			      // Aquí hacemos que se vean los elementos de Conv.Moneda.
				
				verCamposMoneda( lb_Titulo2, lb_monto,  lb_de,  lb_a,  lb_resultado,  Cbox_a, 
						Cbox_de,  text_valor,  textResultado,  Cbox_A_grados,	  Cbox_de_grados);
			}else if( itemSelec == "Conversor de Temperatura" ) {
				  // Aquí hacemos que se vean los elementos.
				
				verCamposTemperatura(lb_Titulo2, lb_monto,   lb_de,   lb_a,  lb_resultado,  Cbox_a, 
						Cbox_de,  text_valor,  textResultado,Cbox_A_grados,Cbox_de_grados);
				 
			}
			limpiarMenu(Cbox_menu, lb_titulo);
			   }
		   
			});
	
		
		
		
	
		JButton btnConvertir = new JButton("CONVERTIR");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					valor = Double.parseDouble(text_valor.getText());//capturo valor del texbox m
		
			
					        
      // Aquí vamos a la clase calculos o temperatura
	   String itemSelec = (String)Cbox_menu.getSelectedItem();
	   if (  itemSelec == "Conversor de Moneda" ) {	
		    deDivisa = Cbox_de.getSelectedIndex();
	        aDivisa = Cbox_a.getSelectedIndex();
		 //Usamos Calculos.java	
				Calculos datos = new Calculos();
				   datos.setDeDivisa(deDivisa);	
				   datos.setaDivisa(aDivisa);
				   datos.setValor(valor);
   	//le doy formato para 2 decimales
			  double result = datos.distinguir();	  
			  String pattern = "{0,number,#####.##}";
		      String resultFormato = MessageFormat.format(pattern, result);   
		        
		//captura el contenido de resultFormato y muestra el resultado
				textResultado.append(" "+ resultFormato);
	   }else if (itemSelec == "Conversor de Temperatura") {
		    deDivisa = Cbox_de_grados.getSelectedIndex();
	        aDivisa = Cbox_A_grados.getSelectedIndex();
				Temperatura valores = new Temperatura();
				 valores.setDeDivisa(deDivisa);	
				  valores.setaDivisa(aDivisa);
				  valores.setValor(valor);
				  double result = valores.distinguir();	  
				  String pattern = "{0,number,#####.##}";
			      String resultFormato = MessageFormat.format(pattern, result);   
			      textResultado.append(" "+ resultFormato);
				
			}
			}
			 catch (NumberFormatException i) {
			    // Manejar el error de valor no numérico aquí
				JOptionPane.showMessageDialog(null, "Sólo puede Ingresar Valores Numéricos", "Error", JOptionPane.ERROR_MESSAGE);
				limpiar(text_valor, textResultado,Cbox_de, Cbox_a, Cbox_de_grados, Cbox_A_grados);
			}	
			}		
		});
		btnConvertir.setToolTipText("");
		btnConvertir.setBackground(new Color(255, 255, 255));
		btnConvertir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnConvertir.setBounds(47, 261, 144, 23);
		contentPane.add(btnConvertir);
		
		JButton btn_Limpiar = new JButton("Nueva Conversión");
		btn_Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				limpiar(text_valor, textResultado,Cbox_de, Cbox_a, Cbox_de_grados, Cbox_A_grados);
			}
		});
		btn_Limpiar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_Limpiar.setBounds(209, 261, 136, 23);
		contentPane.add(btn_Limpiar);
		
		JButton btn_Cerrar = new JButton("Cerrar");
		btn_Cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] botones = {"Volver al Menú?","hacer una nueva Conversión","Cerrar el Programa"};
				int ventana = JOptionPane.showOptionDialog(null, 
						"¿Qué desea hacer?","Conversor 1.0",
						JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
						null,botones,botones[0]);
				switch (ventana) {
				case 0://volver al menú
					limpiar(text_valor, textResultado,Cbox_de, Cbox_a, Cbox_de_grados, Cbox_A_grados);
					mostrarMenu(Cbox_menu, lb_titulo);	
					limpiarTodo(lb_Titulo2, lb_monto,  lb_de,  lb_a,  lb_resultado,  Cbox_a, btnConvertir,  Cbox_de,  text_valor,  textResultado, Cbox_de_grados, Cbox_A_grados);
				    break;
				case 1://Nueva conversion
					limpiar(text_valor, textResultado,Cbox_de, Cbox_a, Cbox_de_grados, Cbox_A_grados);
				    break;	
				case 2://cerrar
					System.exit(0);
					break;
				}
			}
		});
		btn_Cerrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_Cerrar.setBounds(351, 261, 137, 23);
		contentPane.add(btn_Cerrar);
		
		btnConvertir.setVisible(true);
		
		JLabel lb_ver = new JLabel("Conversor 1.0");
		lb_ver.setFont(new Font("Arial", Font.PLAIN, 10));
		lb_ver.setBounds(467, 0, 79, 32);
		contentPane.add(lb_ver);
		


		
	}
	public void limpiarMenu (JComboBox Cbox_menu, JLabel lb_titulo) {
		Cbox_menu.setVisible(false);
		lb_titulo.setVisible(false);
	}
	
	
	private void limpiarTodo(JLabel lb_Titulo2, JLabel lb_monto, JLabel lb_de, JLabel lb_a, JLabel lb_resultado, JComboBox Cbox_a,
			JButton btnConvertir, JComboBox Cbox_de, JTextField text_valor, JTextArea textResultado,
			JComboBox Cbox_A_grados, JComboBox Cbox_de_grados) {
		  lb_monto.setVisible(false); 
		  lb_de.setVisible(false);
		  lb_a.setVisible(false);
		  lb_resultado.setVisible(false);
		  Cbox_a.setVisible(false);
		 // btnConvertir.setVisible(true);
		  Cbox_de.setVisible(false);
		  text_valor.setVisible(false);
		  textResultado.setVisible(false);
		  Cbox_A_grados.setVisible(false);
		  Cbox_de_grados.setVisible(false);
		  lb_Titulo2.setVisible(false);
		
	}
	
	private void verCamposTemperatura( JLabel lb_Titulo2, JLabel lb_monto, JLabel lb_de, JLabel lb_a, JLabel lb_resultado,
			JComboBox Cbox_a, JComboBox Cbox_de, JTextField text_valor, JTextArea textResultado,
			JComboBox Cbox_A_grados, JComboBox Cbox_de_grados) {
		  lb_monto.setVisible(true); 
		  lb_de.setVisible(true);
		  lb_a.setVisible(true);
		  lb_resultado.setVisible(true);
		  Cbox_a.setVisible(false);
		  Cbox_de.setVisible(false);
		//  btnConvertir.setVisible(true);		
		  text_valor.setVisible(true);
		  textResultado.setVisible(true);
		  Cbox_A_grados.setVisible(true);
		  Cbox_de_grados.setVisible(true);
		  crearSubTitulo(lb_Titulo2,"Conversor de Temperatura");
			
		
	}
	public void verCamposMoneda(JLabel lb_Titulo2 ,JLabel lb_monto,JLabel  lb_de, JLabel lb_a,JLabel  lb_resultado,  JComboBox Cbox_a,JComboBox  Cbox_de, JTextField text_valor,
		JTextArea textResultado, JComboBox Cbox_A_grados,JComboBox  Cbox_de_grados) {
		  lb_monto.setVisible(true); 
		  lb_de.setVisible(true);
		  lb_a.setVisible(true);
		  lb_resultado.setVisible(true);
		  Cbox_a.setVisible(true);
		 // btnConvertir.setVisible(true);
		  Cbox_de.setVisible(true);
		  text_valor.setVisible(true);
		  textResultado.setVisible(true);
		  Cbox_A_grados.setVisible(false);
		  Cbox_de_grados.setVisible(false);
		 // lb_Titulo2.setVisible(true);
		  crearSubTitulo(lb_Titulo2, "Conversor de Moneda");
	}
	
	public void crearSubTitulo(JLabel lb_Titulo2, String texto) {
			lb_Titulo2.setText(texto);
			lb_Titulo2.setVisible(true);
	}
			
	public void limpiar (JTextField text_valor, JTextArea textResultado, JComboBox Cbox_de,
		JComboBox Cbox_a, JComboBox Cbox_de_grados, JComboBox Cbox_A_grados) {
		text_valor.setText(null);
		textResultado.setText(null);
		Cbox_de.setSelectedIndex(0);
		Cbox_a.setSelectedIndex(0);	
		Cbox_de_grados.setSelectedIndex(0);
		Cbox_A_grados.setSelectedIndex(0);
		
	}	

	public void mostrarMenu(JComboBox Cbox_menu,JLabel lb_titulo) {
		Cbox_menu.setVisible(true);
		lb_titulo.setVisible(true);
	}
}
