package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class MiCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPantalla;
	private String numActual = "";
	private String numAcumulado = "";
	
	// operacion en un principio va a tomar valores "s", "r", "p", "d" y "i" (suma, resta, producto, división, igualdad)
	// A efectos prácticos y por simplificación de código, la iniciamos en igualdad.
	private String operacion = "i";
	
	// Contemplará el caso en el que haya realizado una operación y tenga que resetear pantalla
	private boolean nuevoNumero = true;
	
	// Botones
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnProducto;
	private JButton btnDivision;
	private JButton btnIgual;
	private JButton btnPuntoDecimal;
	private JButton btnSigno;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	
	// Constantes
	private static final String CERO = "0";
	private static final String UNO = "1";
	private static final String PUNTO = ".";
	private static final String SUMA = "s";
	private static final String RESTA = "r";
	private static final String PRODUCTO = "p";
	private static final String DIVISION = "d";
	private static final String IGUALDAD = "i";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiCalculadora frame = new MiCalculadora();
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
	public MiCalculadora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MiCalculadora.class.getResource("/imagenes/imagenCalculadora.png")));
		setTitle("Calculadora");
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(227, 237, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn9.getText());
			}
		});
		btn9.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn9.setBounds(127, 105, 87, 82);
		contentPane.add(btn9);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn8.getText());
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn8.setBounds(213, 105, 87, 82);
		contentPane.add(btn8);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn7.getText());
			}
		});
		btn7.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn7.setBounds(299, 105, 87, 82);
		contentPane.add(btn7);
		
		btnDivision = new JButton("÷");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opera(DIVISION);
			}
		});
		btnDivision.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btnDivision.setBounds(385, 105, 87, 82);
		contentPane.add(btnDivision);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn6.getText());
			}
		});
		btn6.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn6.setBounds(127, 187, 87, 82);
		contentPane.add(btn6);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn5.getText());
			}
		});
		btn5.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn5.setBounds(213, 187, 87, 82);
		contentPane.add(btn5);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn4.getText());
			}
		});
		btn4.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn4.setBounds(299, 187, 87, 82);
		contentPane.add(btn4);
		
		btnProducto = new JButton("X");
		btnProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opera(PRODUCTO);
			}
		});
		btnProducto.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btnProducto.setBounds(385, 187, 87, 82);
		contentPane.add(btnProducto);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn3.getText());
			}
		});
		btn3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn3.setBounds(127, 268, 87, 82);
		contentPane.add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn2.getText());
			}
		});
		btn2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn2.setBounds(213, 268, 87, 82);
		contentPane.add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btn1.getText());
			}
		});
		btn1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn1.setBounds(299, 268, 87, 82);
		contentPane.add(btn1);
		
		btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opera(RESTA);
			}
		});
		btnResta.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btnResta.setBounds(385, 268, 87, 82);
		contentPane.add(btnResta);
		
		btnPuntoDecimal = new JButton(".");
		btnPuntoDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCaracter(btnPuntoDecimal.getText());	
			}
		});
		btnPuntoDecimal.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btnPuntoDecimal.setBounds(127, 350, 87, 82);
		contentPane.add(btnPuntoDecimal);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Solo añadimos el 0 a la pantalla si la pantalla no está vacía ni hay ningún 0. No tiene sentido tener
				// ceros a la izquierda.
				if (!txtPantalla.getText().equals("0")) {
					setCaracter(btn0.getText());
				}
			}
		});
		btn0.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btn0.setBounds(213, 350, 87, 82);
		contentPane.add(btn0);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opera(IGUALDAD);
			}
		});
		btnIgual.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btnIgual.setBounds(299, 350, 87, 82);
		contentPane.add(btnIgual);
		
		btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opera(SUMA);
			}
		});
		btnSuma.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btnSuma.setBounds(385, 350, 87, 82);
		contentPane.add(btnSuma);
		
		txtPantalla = new JTextField();
		txtPantalla.setEditable(false);
		txtPantalla.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 22));
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setBackground(new Color(246, 246, 246));
		txtPantalla.setBounds(41, 26, 431, 65);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		btnSigno = new JButton("+/-");
		btnSigno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Modificamos el número actual y lo mostramos por pantalla
				if (!numActual.isEmpty()) {
					numActual = String.valueOf(-(Double.parseDouble(numActual)));
					txtPantalla.setText(String.valueOf(numActual));

				}
			}
		});
		btnSigno.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		btnSigno.setBounds(41, 350, 87, 82);
		contentPane.add(btnSigno);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btnSalir.setBounds(127, 479, 259, 65);
		contentPane.add(btnSalir);
		
		JLabel lblImagen1 = new JLabel("New label");
		lblImagen1.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/iconoCalculadora.png")));
		lblImagen1.setBounds(420, 479, 52, 65);
		contentPane.add(lblImagen1);
		
		JLabel lblImagen2 = new JLabel("");
		lblImagen2.setIcon(new ImageIcon(MiCalculadora.class.getResource("/imagenes/iconoCalculadora2.png")));
		lblImagen2.setBounds(41, 479, 66, 65);
		contentPane.add(lblImagen2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoNumero = true;
				numActual = "";
				numAcumulado = "";
				txtPantalla.setText("");
				operacion = IGUALDAD;
				activaDesactivaBotones(true);
			}
		});
		btnReset.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		btnReset.setBounds(41, 105, 87, 245);
		contentPane.add(btnReset);
	}
	
	private void setCaracter(String caracter) {
		// Si tengo un número nuevo, cambio la pantalla al añadir el primer carácter
		if (nuevoNumero) {
			nuevoNumero = false;
			txtPantalla.setText("");;
		}
		
		if (!caracter.equals(PUNTO) || (caracter.equals(PUNTO) && numActual.indexOf(PUNTO) < 0) ) {
			
			// Si el carácter es un punto decimal y no hay nada acumulado, tomamos cero como parte entera
			if(caracter.equals(PUNTO) && numActual.isEmpty()) {
				numActual += CERO;
				txtPantalla.setText(numActual);
			}
			
			numActual = numActual.equals(CERO) ? caracter : numActual + caracter;

			txtPantalla.setText(numActual);
			
		}
			
	}
	
	// Vamos a tener un método privado que realice la operación para la simplificación de código
	private void opera(String operacion) {
		// Siempre que pulsamos una operación, iniciamos nuevo número 
		// (aunque la pantalla muestre el resultado de la operación anterior)
		nuevoNumero = true;
		
		// Si el número nuevo está vacío y no hay número acumulado, significa que el primer botón 
		// al iniciar es una operación. Tomamos el número acumulado como 0 y almacenamos la operación
		if (numAcumulado.isEmpty() && numActual.isEmpty()) {
			numAcumulado = CERO;
		
		// Si no hay operación anterior o si la anterior fue un igual y esta no es un igual, 
		// solo reseteamos la pantalla y actualizamos variables
		} else if (this.operacion.equals(IGUALDAD) && !operacion.equals(IGUALDAD)) {
			/* Como contemplamos antes que sea la primera tecla pulsada el botón de operación, esta opción no puede ser.
			 Distinguimos entonces así si es la primera operación realizada o no.
			 Si es la primera operación, el número actual no está vacío. Si no lo es, está vacío y tomamos el acumulado
			 de la operación anterior */
			numAcumulado = numActual.isEmpty()? numAcumulado : numActual;
			numActual = "";
			txtPantalla.setText(numActual);	
		
			// Si la operación anterior no es un igual, hay que realizarla y modificar para la siguiente
		} else {
			
			switch (this.operacion) {
			// Caso en que la operación anterior era una suma
			case SUMA:
				// Si el número actual está aún vacío, sumamos cero
				numActual = numActual.isEmpty() ? CERO : numActual;
				
				// Sumamos
				numAcumulado = String.valueOf(Double.parseDouble(numAcumulado) + Double.parseDouble(numActual));
				break;
				
			// Caso en que la operación anterior era una resta	
			case RESTA:
				// Si el número actual está aún vacío, sumamos cero
				numActual = numActual.isEmpty() ? CERO : numActual;
				
				// Restamos
				numAcumulado = String.valueOf(Double.parseDouble(numAcumulado) - Double.parseDouble(numActual));
				break;
				
			// Caso en que la operación anterior era un producto	
			case PRODUCTO:
				// Si el número actual está aún vacío, multiplicamos por uno
				numActual = numActual.isEmpty() ? UNO : numActual;
				
				// Multiplicamos
				numAcumulado = String.valueOf(Double.parseDouble(numAcumulado) * Double.parseDouble(numActual));
				break;
			
			// Caso en que la operación anterior era una división
			case DIVISION:
				// Si el número actual está aún vacío, dividimos por uno
				numActual = numActual.isEmpty() ? UNO : numActual;
				
				// Comprobamos si dividimos por cero
				if (numActual.equals("0")) {
					numAcumulado = "ERROR [Pulse Reset o Salir]";
					activaDesactivaBotones(false);
				} else {
					numAcumulado = String.valueOf(Double.parseDouble(numAcumulado) / Double.parseDouble(numActual));
				}
				
				// Dividimos
				
				break;

			// Este caso se da cuando repetimos el pulsado de la igualdad
			case IGUALDAD:
				numAcumulado = numActual.isEmpty() ? numAcumulado : numActual;
				
			}
			
			// Siempre actualizamos el número actual y actualizamos la pantalla
			numActual = "";
			txtPantalla.setText(numAcumulado);
			
		}
		

		// Siempre modificamos la operación
		this.operacion = operacion;

	}
	
	// Método para activar y desactivar los botones en caso de error. Solo se permite reset o salir
	private void activaDesactivaBotones(boolean activaDesactiva) {
		btn0.setEnabled(activaDesactiva);
		btn1.setEnabled(activaDesactiva);
		btn2.setEnabled(activaDesactiva);
		btn3.setEnabled(activaDesactiva);
		btn4.setEnabled(activaDesactiva);
		btn5.setEnabled(activaDesactiva);
		btn6.setEnabled(activaDesactiva);
		btn7.setEnabled(activaDesactiva);
		btn8.setEnabled(activaDesactiva);
		btn9.setEnabled(activaDesactiva);
		btnSuma.setEnabled(activaDesactiva);
		btnResta.setEnabled(activaDesactiva);
		btnProducto.setEnabled(activaDesactiva);
		btnDivision.setEnabled(activaDesactiva);
		btnIgual.setEnabled(activaDesactiva);
		btnSigno.setEnabled(activaDesactiva);
		btnPuntoDecimal.setEnabled(activaDesactiva);
	}
}
