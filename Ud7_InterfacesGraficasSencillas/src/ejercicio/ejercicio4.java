package ejercicio;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ejercicio4 extends JFrame {
	Container panel;
	JButton btn1, btn2;
	JLabel texto1, texto2;
	JTextField dt1;
	JPasswordField dt2;

	public ejercicio4() {
		panel = this.getContentPane();
		panel.setLayout(null);
		
		setTitle("iniciar session");
		
		//texto
		texto1 = new JLabel("nombre");
		texto2 = new JLabel("contraseña");
		texto1.setBounds(120, 90, 45, 20);
		texto2.setBounds(120, 140, 65, 20);

		panel.add(texto1);
		panel.add(texto2);
		
		// Botones 
		btn1 = new JButton("iniciar");
		btn2 = new JButton("exit");
		btn1.setBounds(220,280,150,20);
		btn2.setBounds(220,340,150,20);

		panel.add(btn1);
		panel.add(btn2);
	
		//Text field 
		dt1 = new JTextField(6);
		dt1.setBounds(190,90,150,20);
		dt2 = new JPasswordField(6);
		dt2.setBounds(190,140,150,20);
		panel.add(dt1);
		panel.add(dt2);
		
		// events 
		
		btn1.addActionListener(new ActionValidation());
		
		
		panel.add(dt2);
		setSize(700, 460);
		setVisible(true);
	}

	public static void main(String[] args) {
		ejercicio4 ej4 = new ejercicio4();
	}
	
	class ActionValidation implements  ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String user  = "user";
			String contraseña = "1234";
			if(dt1.getText().equals(user) && dt2.getText().equals(contraseña)) {
				JOptionPane.showMessageDialog(null,"iniciar sesion exitoso","mensaje",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"Datos incorrectos","error",JOptionPane.ERROR_MESSAGE);
			
			}
		}
	}

}
