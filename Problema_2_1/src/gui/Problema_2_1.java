package gui;
import semana_02.Celular;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_2_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_2_1 frame = new Problema_2_1();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_2_1() {
		setTitle("Problema_2_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	
	//===========================================================================================
	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Celular c = new Celular(954231542, "Juan R�os", 6000, .10);
		listado(c);
		
		// Seteo
		c.setSegundos(c.getSegundos() + 20);  // Aumento en 20 lo que tiene el atributo
		c.setPrecio(c.getPrecio() * .95);
		listado(c);
	}
	
	//===========================================================================================
	
	void listado(Celular x){
		imprimir("Dir. Memoria\t: " + x);
		imprimir("N�mero\t\t: " + x.getNumero());
		imprimir("Usuario\t\t: " + x.getUsuario());
		imprimir("Segundos\t: " + x.getSegundos());
		imprimir("Precio Seg.\t: " + x.getPrecio());
		imprimir("Costo Consumo\t: " + x.calcularCostoconsumo());
		imprimir("Impuesto IGV\t: " + x.calcularCostoIGV());
		imprimir("Total a Pagar\t: " + x.calcularTotalPagar());
		imprimir("");
	}
	
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}