package resueltos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio02 extends JFrame {
  Container panel;
  JButton botonCalcular , btn2;
  JTextField base, altura, calculo;
  JLabel etiqueta1, etiqueta2;

  public Ejercicio02() {
	super("C�lculo �rea tri�ngulo");
    panel = getContentPane();
    panel.setLayout((null));
    
	etiqueta1=new JLabel("Base");
	etiqueta2=new JLabel("Altura");
    etiqueta1.setBounds(10, 20, 60,20);
    panel.add(etiqueta1);
    etiqueta2.setBounds(10, 50, 60,20);
    panel.add (etiqueta2);
    base = new JTextField(5);
    base.setBounds(50, 20, 45, 20);
	panel.add(base);
	altura = new JTextField(6);
	altura.setBounds(50, 50, 45, 20);
	panel.add(altura);
	botonCalcular = new JButton("Area");
	botonCalcular.setBounds(40, 90, 75, 20);
	panel.add(botonCalcular);
	calculo=new JTextField(6);
	calculo.setBounds(120, 90, 45,20);
	 panel.add(calculo);
	calculo.setEditable(false);
	calculo.setForeground(Color.red);
	botonCalcular.addActionListener(new OyenteBoton());
	btn2= new JButton("buton2");
	btn2.setBounds(120, 120, 75, 20);
	panel.add(btn2);
	btn2.addActionListener(new OyenteBoton());

	
	
    setSize(300, 200);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Ejercicio02 ventana = new Ejercicio02();
  }

  class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e){
        //Faltar�a aqu� la comprobaci�n de datos reales de la base y de la altura
    	// de forma similar a c�mo se ha hecho en el Ejercicio01.java
    	if(e.getSource().equals(botonCalcular)) {
        	Double resultado =Double.parseDouble(base.getText())* Double.parseDouble(altura.getText())/2;
        	resultado=Math.rint(resultado*100)/100;
            calculo.setText(resultado.toString());    		
    	}else {
    		JOptionPane.showMessageDialog(null, "has pulsado un button q no debes pulsar ");
    	}

    }
  }
}



