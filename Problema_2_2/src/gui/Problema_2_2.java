package gui;
import semana_02.Computadora;
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

public class Problema_2_2 extends JFrame implements ActionListener {
	
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
					Problema_2_2 frame = new Problema_2_2();
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
	public Problema_2_2() {
		setTitle("Problema_2_2");
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
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		// Creo el Objeto de acuerdo al orden del Constructor
		Computadora c = new Computadora(1234, "Lenovo", "Negro", 1250.0);
	
		// Imprimo por Primera vez
		listado(c);
		
		// Seteo : Hago los cambios
		c.setPrecioDolar(c.getPrecioDolar() * 0.9);
		
		// Vuelvo a imprimr
		listado(c);
	}
	
	//================================================================================
	
	void listado(Computadora x){
		imprimir("Dir. Memoria\t: " + x);
		imprimir("Código\t\t: " + x.getCodigo());
		imprimir("Marca\t\t: " + x.getMarca());
		imprimir("Color\t\t: " + x.getColor());
		imprimir("Pre. Dolar\t: " + x.getPrecioDolar());
		imprimir("Pre. Soles\t: " + x.retornarPrecioSoles());
		imprimir("Pre. Euro\t: " + x.retornarPrecioEuros());
		imprimir("");
	}
	
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}