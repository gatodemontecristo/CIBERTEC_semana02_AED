package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_02.Asesor;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_2_4 extends JFrame implements ActionListener {
	
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
					Propuesto_2_4 frame = new Propuesto_2_4();
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
	public Propuesto_2_4() {
		setTitle("Propuesto_2_4");
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
		Asesor as = new Asesor(12345,25,"Erick Dejo Vicente",13.72);
		listado(as);
		
		as.setHor_trabajo(as.getHor_trabajo()+10);
		as.setTarifa(as.getTarifa()*.75);
		listado(as);
	}
	void listado(Asesor x){
		DecimalFormat df = new DecimalFormat("#.00");
		imprimir("Dir. Memoria\t: " + x);
		imprimir("Nombre\t\t: " + x.getNombre());
		imprimir("Código\t\t: " + x.getCodigo());
		imprimir("Hora trabajo\t: " + x.getHor_trabajo());
		imprimir("Tarifa\t\t: " + df.format(x.getTarifa()));
		imprimir("Sueldo bruto\t: " + df.format(x.sueldoBruto()));
		imprimir("Descuento\t: " + df.format(x.descuento()));
		imprimir("Sueldo neto\t: " + df.format(x.sueldoNeto()));
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}