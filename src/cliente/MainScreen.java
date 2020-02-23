package cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import servidor.RMIInterface;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMinus;
	private JTextField textFieldOp1Suma;
	private JTextField textFieldOp2Suma;
	private JTextField textFieldOp1Resta;
	private JTextField textFieldOp2Resta;
	private JTextField textFieldOp1Multi;
	private JTextField textFieldOp2Multi;
	private JTextField textFieldOp1Dividir;
	private JTextField textFieldOp2Dividir;
	private JLabel lblRespMayus;
	private JLabel lblRespMinus;
	private JLabel lblRespSumar;
	private JLabel lblRespMultiplicacion;
	private JLabel lblRespDivision;
	RMIInterface useless = null;
	private JLabel lblRespRestar;
	

	
	public MainScreen() {
		
		Cliente c = new Cliente();
		c.register();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("To Mayus");
		
		JTextField textFieldMayus = new JTextField();
		textFieldMayus.setColumns(10);
		
		JButton btnMayus = new JButton("Mayus");
		btnMayus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblRespMayus.setText(c.toMayus(textFieldMayus.getText()));
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} 
		});
		
		JLabel lblToMinus = new JLabel("To Minus");
		
		textFieldMinus = new JTextField();
		textFieldMinus.setColumns(10);
		
		JButton btnMayus_1 = new JButton("Minus");
		btnMayus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblRespMinus.setText(c.toMinus(textFieldMinus.getText()));
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JLabel lblSumart = new JLabel("Sumar");
		
		textFieldOp1Suma = new JTextField();
		textFieldOp1Suma.setColumns(10);
		
		textFieldOp2Suma = new JTextField();
		textFieldOp2Suma.setColumns(10);
		
		JLabel lblRestar = new JLabel("Restar");
		
		JLabel lblMultiplicar = new JLabel("Multiplicar");
		
		textFieldOp1Resta = new JTextField();
		textFieldOp1Resta.setColumns(10);
		
		textFieldOp2Resta = new JTextField();
		textFieldOp2Resta.setColumns(10);
		
		textFieldOp1Multi = new JTextField();
		textFieldOp1Multi.setColumns(10);
		
		textFieldOp2Multi = new JTextField();
		textFieldOp2Multi.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dividir");
		
		textFieldOp1Dividir = new JTextField();
		textFieldOp1Dividir.setColumns(10);
		
		textFieldOp2Dividir = new JTextField();
		textFieldOp2Dividir.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblRespSumar.setText(c.sumar(Integer.parseInt(textFieldOp1Suma.getText()), Integer.parseInt(textFieldOp2Suma.getText()))+"");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblRespRestar.setText(c.restar(Integer.parseInt(textFieldOp1Resta.getText()), Integer.parseInt(textFieldOp2Resta.getText()))+"");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblRespMultiplicacion.setText(c.multiplicar(Integer.parseInt(textFieldOp1Multi.getText()), Integer.parseInt(textFieldOp2Multi.getText()))+"");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblRespDivision.setText(c.dividir(Double.parseDouble(textFieldOp1Resta.getText()), Double.parseDouble(textFieldOp2Resta.getText()))+"");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		lblRespMinus = new JLabel("");
		
		lblRespSumar = new JLabel("");
		
		lblRespMayus = new JLabel("");
		
		lblRespRestar = new JLabel("");
		
		lblRespMultiplicacion = new JLabel("");
		
		lblRespDivision = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(textFieldMayus, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMayus)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblRespMayus))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(textFieldOp1Dividir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textFieldOp2Dividir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblMultiplicar)
									.addGap(18)
									.addComponent(textFieldOp1Multi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textFieldOp2Multi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblRestar)
									.addGap(18)
									.addComponent(textFieldOp1Resta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textFieldOp2Resta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSumart)
									.addGap(18)
									.addComponent(textFieldOp1Suma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textFieldOp2Suma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblToMinus)
									.addGap(18)
									.addComponent(textFieldMinus, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnDividir, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblRespDivision))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnRestar, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblRespRestar))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnSumar)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblRespSumar))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnMayus_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblRespMinus))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnMultiplicar)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblRespMultiplicacion)))))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textFieldMayus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMayus)
						.addComponent(lblRespMayus))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblToMinus)
						.addComponent(textFieldMinus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMayus_1)
						.addComponent(lblRespMinus))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSumart)
						.addComponent(textFieldOp1Suma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldOp2Suma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSumar)
						.addComponent(lblRespSumar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRestar)
						.addComponent(textFieldOp1Resta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldOp2Resta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRestar)
						.addComponent(lblRespRestar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMultiplicar)
						.addComponent(textFieldOp1Multi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldOp2Multi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMultiplicar)
						.addComponent(lblRespMultiplicacion))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textFieldOp1Dividir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldOp2Dividir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDividir)
						.addComponent(lblRespDivision ))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
}
