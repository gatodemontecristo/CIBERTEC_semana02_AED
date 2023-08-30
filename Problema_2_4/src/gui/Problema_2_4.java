package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_02.Obrero;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_2_4 extends JFrame implements ActionListener {
	
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
					Problema_2_4 frame = new Problema_2_4();
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
	public Problema_2_4() {
		setTitle("Problema_2_4");
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
		
		Obrero o = new Obrero(12345,24,"Erick Dejo Vicente",13.5);
		listado(o);
		
		o.setHor_trabajadas(o.getHor_trabajadas()+8);
		double calculo = o.getTarifa() - (o.getTarifa()*0.015);
		o.setTarifa(calculo);
		
		listado(o);
	}	
	
	void listado(Obrero x){
		DecimalFormat df = new DecimalFormat("#.00");
		imprimir("Dir. Memoria\t: " + x);
		imprimir("Código\t\t: " + x.getCodigo());
		imprimir("Horas trab.\t: " + x.getHor_trabajadas());
		imprimir("Nombre\t\t: " + x.getNombre());
		imprimir("Tarifa por hora\t: " + x.getTarifa());
		imprimir("Sueldo bruto\t: " + df.format(x.sueldoBruto()));
		imprimir("Descuento AFP\t: " + df.format(x.descuentoAFP()));
		imprimir("Descuento EPS\t: " + df.format(x.descuentoEPS()));
		imprimir("Sueldo neto\t: " + df.format(x.sueldoNeto()));
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}