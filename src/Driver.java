import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.JTextField;

public class Driver {

	private JFrame frmCalculadora;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver window = new Driver();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Driver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setResizable(false);
		frmCalculadora.setTitle("Calculadora 1.0");
		frmCalculadora.setBounds(100, 100, 280, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 61, 236, 189);
		frmCalculadora.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.gridheight = 2;
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 0;
		panel.add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("2");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.BOTH;
		gbc_btn2.gridheight = 2;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 1;
		gbc_btn2.gridy = 0;
		panel.add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("3");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.BOTH;
		gbc_btn3.gridheight = 2;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 0;
		panel.add(btn3, gbc_btn3);
		
		JButton btnmenos = new JButton("-");
		GridBagConstraints gbc_btnmenos = new GridBagConstraints();
		gbc_btnmenos.fill = GridBagConstraints.BOTH;
		gbc_btnmenos.gridheight = 2;
		gbc_btnmenos.insets = new Insets(0, 0, 5, 5);
		gbc_btnmenos.gridx = 3;
		gbc_btnmenos.gridy = 0;
		panel.add(btnmenos, gbc_btnmenos);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		GridBagConstraints gbc_btnclear = new GridBagConstraints();
		gbc_btnclear.fill = GridBagConstraints.BOTH;
		gbc_btnclear.gridheight = 2;
		gbc_btnclear.insets = new Insets(0, 0, 5, 0);
		gbc_btnclear.gridx = 4;
		gbc_btnclear.gridy = 0;
		panel.add(btnclear, gbc_btnclear);
		
		JButton btn4 = new JButton("4");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.BOTH;
		gbc_btn4.gridheight = 2;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 2;
		panel.add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("5");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.gridheight = 2;
		gbc_btn5.fill = GridBagConstraints.BOTH;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 1;
		gbc_btn5.gridy = 2;
		panel.add(btn5, gbc_btn5);
		
		JButton btn6 = new JButton("6");
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.fill = GridBagConstraints.BOTH;
		gbc_btn6.gridheight = 2;
		gbc_btn6.gridx = 2;
		gbc_btn6.gridy = 2;
		panel.add(btn6, gbc_btn6);
		
		JButton btnmas = new JButton("+");
		GridBagConstraints gbc_btnmas = new GridBagConstraints();
		gbc_btnmas.fill = GridBagConstraints.BOTH;
		gbc_btnmas.gridheight = 2;
		gbc_btnmas.insets = new Insets(0, 0, 5, 5);
		gbc_btnmas.gridx = 3;
		gbc_btnmas.gridy = 2;
		panel.add(btnmas, gbc_btnmas);
		
		JButton btnmulti = new JButton("*");
		GridBagConstraints gbc_btnmulti = new GridBagConstraints();
		gbc_btnmulti.fill = GridBagConstraints.BOTH;
		gbc_btnmulti.gridheight = 2;
		gbc_btnmulti.insets = new Insets(0, 0, 5, 0);
		gbc_btnmulti.gridx = 4;
		gbc_btnmulti.gridy = 2;
		panel.add(btnmulti, gbc_btnmulti);
		
		JButton btn7 = new JButton("7");
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.BOTH;
		gbc_btn7.gridheight = 2;
		gbc_btn7.insets = new Insets(0, 0, 0, 5);
		gbc_btn7.gridx = 0;
		gbc_btn7.gridy = 4;
		panel.add(btn7, gbc_btn7);
		
		JButton btn8 = new JButton("8");
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.BOTH;
		gbc_btn8.gridheight = 2;
		gbc_btn8.insets = new Insets(0, 0, 0, 5);
		gbc_btn8.gridx = 1;
		gbc_btn8.gridy = 4;
		panel.add(btn8, gbc_btn8);
		
		JButton btn9 = new JButton("9");
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.insets = new Insets(0, 0, 0, 5);
		gbc_btn9.fill = GridBagConstraints.BOTH;
		gbc_btn9.gridheight = 2;
		gbc_btn9.gridx = 2;
		gbc_btn9.gridy = 4;
		panel.add(btn9, gbc_btn9);
		
		JButton btn0 = new JButton("0");
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.gridheight = 2;
		gbc_btn0.gridx = 3;
		gbc_btn0.gridy = 4;
		panel.add(btn0, gbc_btn0);
		
		JButton btndivi = new JButton("/");
		GridBagConstraints gbc_btndivi = new GridBagConstraints();
		gbc_btndivi.fill = GridBagConstraints.BOTH;
		gbc_btndivi.gridheight = 2;
		gbc_btndivi.gridx = 4;
		gbc_btndivi.gridy = 4;
		panel.add(btndivi, gbc_btndivi);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 236, 37);
		frmCalculadora.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
	}
}
