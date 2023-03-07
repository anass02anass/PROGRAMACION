package ejercicio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ejercicio5 extends JFrame implements ActionListener {
	Container panel;
	JButton btn1, btn2, btn3, btn4, btn5, btnhombre;
	JLabel texto1, texto2;
	JTextField jt1, jt2, jt3;

	public ejercicio5() {
		panel = this.getContentPane();
		panel.setLayout(null);

		setTitle("Calucualdora");

		// texto
		texto1 = new JLabel("Dato1");
		texto2 = new JLabel("Dato2");
		texto1.setBounds(120, 90, 45, 20);
		texto2.setBounds(120, 140, 45, 20);
		panel.add(texto1);
		panel.add(texto2);

		// paneles

		jt1 = new JTextField();
		jt1.setBounds(190, 90, 50, 20);
		jt2 = new JTextField();
		jt2.setBounds(190, 140, 50, 20);
		panel.add(jt1);
		panel.add(jt2);

		// text field null
		jt3 = new JTextField();
		jt3.setBounds(220, 160, 60, 20);
		jt3.setEditable(false);
		jt3.setForeground(Color.red);
		panel.add(jt3);

		btn1 = new JButton("+");
		btn1.setBounds(220, 320, 90, 20);
		btn2 = new JButton("-");
		btn2.setBounds(220, 190, 90, 20);
		btn3 = new JButton("*");
		btn3.setBounds(220, 220, 90, 20);
		btn4 = new JButton("/");
		btn4.setBounds(220, 250, 90, 20);

		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);

		// iamge

		ImageIcon icon = new ImageIcon("imagenes\\calculadora.jpg");
		JLabel imag = new JLabel(icon);
		imag.setBounds(205, 15, 70, 70);
		imag.setIcon(icon);
		panel.add(imag);

		ImageIcon hombre = new ImageIcon("imagenes\\hombre.png");
		btnhombre = new JButton(hombre);
		btnhombre.setBounds(220, 350, 70, 70);
		btnhombre.setIcon(hombre);
		panel.add(btnhombre);

		// panel
		setSize(700, 460);
		setVisible(true);
		
		
		// eventos
		btnhombre.addActionListener(this);
	
	}

	public static void main(String[] args) {
		ejercicio5 eje5 = new ejercicio5();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnhombre) {
			System.exit(-1);
		}
	}
	
	 
}
