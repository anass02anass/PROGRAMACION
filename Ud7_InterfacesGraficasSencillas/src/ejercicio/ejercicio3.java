package ejercicio;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ejercicio3 extends JFrame {

	Container panel;
	JButton botonCalcular, btn2;
	JTextField Num1, Num2, calculo;
	JLabel etiqueta1, etiqueta2;

	public ejercicio3() {
		super("Calcular");
		panel = getContentPane();
		panel.setLayout(null);
		// para mostrar el texto
		etiqueta1 = new JLabel("Num 1");
		etiqueta2 = new JLabel("Num 2 ");

		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 60, 20);
		panel.add(etiqueta2);
		Num1 = new JTextField(5);
		Num1.setBounds(50, 20, 45, 20);
		panel.add(Num1);
		Num2 = new JTextField(6);
		Num2.setBounds(50, 50, 45, 20);
		panel.add(Num2);
		botonCalcular = new JButton("suma");
		botonCalcular.setBounds(40, 90, 75, 20);
		panel.add(botonCalcular);
		calculo = new JTextField(6);
		calculo.setBounds(120, 90, 45, 20);
		panel.add(calculo);
		calculo.setEditable(false);
		calculo.setForeground(Color.red);
		botonCalcular.addActionListener(new OyenteBoton());
		btn2 = new JButton("resta");
		btn2.setBounds(35, 120, 95, 20);
		

		panel.add(btn2);
		btn2.addActionListener(new OyenteBoton1());
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ejercicio3 ej = new ejercicio3();
	}
// 
	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado = Double.parseDouble(Num1.getText()) + Double.parseDouble(Num2.getText()) ;
			resultado = Math.rint(resultado) ;
			calculo.setText(resultado.toString());
		}
	}
	class OyenteBoton1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Double resultado = Double.parseDouble(Num1.getText())-Double.parseDouble(Num2.getText());
			resultado=Math.rint(resultado );
			calculo.setText(resultado.toString());
			
		}
	}
}
