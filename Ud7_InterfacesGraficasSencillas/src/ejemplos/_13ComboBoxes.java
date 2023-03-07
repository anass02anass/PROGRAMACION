package ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class _13ComboBoxes extends JFrame {
    public _13ComboBoxes() {
        super("ComboBoxes");
        setLayout(null);
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComboBox modulo = new JComboBox();
        modulo.setBounds(40,10, 180, 30);
       
        modulo.addItem("Bases de Datos");
        modulo.addItem("Inglés");
        modulo.addItem("Entornos de desarrollo");
        modulo.addItem("Programaci�n");
        add(modulo);
        JButton btnOpcion = new JButton("mostrar seleccion");
        btnOpcion.setBounds(40,50,180,20);
        add(btnOpcion);
        
        btnOpcion.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "has elegido la opcion "+modulo.getSelectedIndex(),"comoboxes",JOptionPane.INFORMATION_MESSAGE);
        	}
        		
        });
        	
        
        setVisible(true);
    }
    
     public static void main(String[] arguments) {
        _13ComboBoxes cb = new _13ComboBoxes();
    }
}
