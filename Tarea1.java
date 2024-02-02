package InterfazG;
import javax.swing.*;

public class Tarea1 {
	public Tarea1() {
		
		JFrame ventana = new JFrame("Agendar cita");
		ventana.setSize(350,400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel panelito = new JPanel();
		ventana.add(panelito);
		panelito.setLayout(null);
		
		JLabel etiqueta = new JLabel("Nombre:");
		etiqueta.setBounds(0,0,60,20);
		panelito.add(etiqueta);
		JLabel etiqueta2 = new JLabel("CURP:");
		etiqueta2.setBounds(0,30,60,20);
		panelito.add(etiqueta2);
		JLabel etiqueta3 = new JLabel("NSS:");
		etiqueta3.setBounds(0,60,60,20);
		panelito.add(etiqueta3);
		JLabel etiqueta4 = new JLabel("Genero:");
		etiqueta4.setBounds(0,90,60,20);
		panelito.add(etiqueta4);
		JLabel etiqueta5 = new JLabel("H");
		etiqueta5.setBounds(90,90,20,20);
		panelito.add(etiqueta5);
		JLabel etiqueta6 = new JLabel("M");
		etiqueta6.setBounds(170,90,20,20);
		panelito.add(etiqueta6);
		
		JTextField cuadrito = new JTextField();
		cuadrito.setBounds(70,0,200,25);
		panelito.add(cuadrito);
		JTextField cuadrito2 = new JTextField();
		cuadrito2.setBounds(70,30,200,25);
		panelito.add(cuadrito2);
		JTextField cuadrito3 = new JTextField();
		cuadrito3.setBounds(70,60,200,25);
		panelito.add(cuadrito3);
		
		JCheckBox cajita = new JCheckBox();
		cajita.setBounds(70,90,20,20);
		panelito.add(cajita);
		JCheckBox cajita2 = new JCheckBox();
		cajita2.setBounds(150,90,20,20);
		panelito.add(cajita2);
		
		JButton botoncito = new JButton("Atras");
		botoncito.setBounds(60,300,70,30);
		panelito.add(botoncito);
		JButton botoncito2 = new JButton("Fechas \n disponibles");
		botoncito2.setBounds(150,300,170,30);
		panelito.add(botoncito2);
		
		
		
		
	}
}
