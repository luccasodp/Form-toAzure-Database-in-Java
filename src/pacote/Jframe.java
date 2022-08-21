package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Jframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Bem vindo ao app do Luccão!!!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("O que você é?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox cbBox1 = new JComboBox();
		cbBox1.setEditable(true);
		cbBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String formOpen = cbBox1.getSelectedItem().toString();
				
				if (formOpen=="Menu") {
					
				}
				else if (formOpen=="Aluno") {
					FormAluno telaAluno = new FormAluno();
					telaAluno.setVisible(true);
				}
				else if (formOpen=="Professor") {
					FormProf telaProf = new FormProf();
					telaProf.setVisible(true);
				}
				else if (formOpen=="Funcionario") {
					FormFunc telaFunc = new FormFunc();
					telaFunc.setVisible(true);
				}
				else if (formOpen=="Responsável") {
					FormResp telaResp = new FormResp();
					telaResp.setVisible(true);
				}
				
			}
		});
		cbBox1.setModel(new DefaultComboBoxModel(new String[] {"Menu", "Responsável", "Aluno", "Professor", "Funcionario"}));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(97)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(79))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(153)
					.addComponent(cbBox1, 0, 138, Short.MAX_VALUE)
					.addGap(133))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(170)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
					.addGap(150))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
					.addGap(60)
					.addComponent(cbBox1)
					.addGap(102))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
