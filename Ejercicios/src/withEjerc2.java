import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public  class withEjerc2 extends JFrame implements ActionListener {

	Container panel;
	JLabel jl_user, jl_password, jl_candadoAbierto, jl_candadoCerrado, jl_comentario;
	JPasswordField jpf_password;
	JTextField jtf_textuser;
	JButton jb_aceptar;

	public withEjerc2() {
		panel = getContentPane();
		panel.setLayout(null);

		// JLabel
		jl_user = new JLabel("Usuario: ");
		jl_user.setBounds(20, 20, 80, 20);
		panel.add(jl_user);
		jl_password = new JLabel("Contraseña: ");
		jl_password.setBounds(20, 60, 80, 20);
		panel.add(jl_password);
		jl_candadoAbierto = new JLabel();
		jl_candadoAbierto.setBounds(140, 110, 95, 130);
		ImageIcon iconoCandado1 = new ImageIcon("Imagenes/candado_abierto.png");
		jl_candadoAbierto.setIcon(iconoCandado1);
		jl_candadoAbierto.setVisible(false);
		panel.add(jl_candadoAbierto);
		jl_candadoCerrado = new JLabel();
		jl_candadoCerrado.setBounds(140, 110, 95, 130);
		ImageIcon iconoCandado2 = new ImageIcon("Imagenes/candado_cerrado.png");
		jl_candadoCerrado.setIcon(iconoCandado2);
		panel.add(jl_candadoCerrado);
		jl_comentario = new JLabel("Hola");
		jl_comentario.setBounds(20, 280, 100, 20);
		panel.add(jl_comentario);

		// JPasswordField
		jpf_password = new JPasswordField();
		jpf_password.setBounds(100, 60, 100, 20);
		panel.add(jpf_password);

		// JTextField
		jtf_textuser = new JTextField();
		jtf_textuser.setBounds(100, 20, 100, 20);
		panel.add(jtf_textuser);

		// JButton
		jb_aceptar = new JButton("Aceptar");
		jb_aceptar.setBounds(250, 40, 80, 20);
		panel.add(jb_aceptar);
		jb_aceptar.addActionListener(this);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		withEjerc2 ventana = new withEjerc2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}