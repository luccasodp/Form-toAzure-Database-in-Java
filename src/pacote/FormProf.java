package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class FormProf extends JFrame {
	

	private JPanel contentPane;
	private JTextField avalP_7;
	private JTextField avalP_6;
	private JTextField avalP_5;
	private JTextField avalP_4;
	private JTextField avalP_3;
	private JTextField avalP_2;
	private JTextField avalP_1;
	private JTextField avalP_8;
	private JTextField Retorno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormProf frame = new FormProf();
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
	public FormProf() {
		setTitle("Form Professor");
		setBounds(100, 100, 450, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btF = new JButton("Enviar");
		btF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retorno.setText("Carregando...");
				Professor prof =new Professor();
				String nome=avalP_1.getText();
				String cep= avalP_2.getText();
				String cpf=avalP_3.getText();;
				String tel=avalP_4.getText();;
				String CTPS=avalP_5.getText();;
				String salario=avalP_6.getText();;
				String cargo=avalP_7.getText();
				String forma=avalP_8.getText();
				
				
				prof.setProf(nome,cep, cpf, tel,CTPS,salario,cargo,forma);
				
				avalP_1.setText("");
				avalP_2.setText("");
				avalP_3.setText("");
				avalP_4.setText("");
				avalP_5.setText("");
				avalP_6.setText("");
				avalP_7.setText("");
				avalP_8.setText("");
				
				Retorno.setText(prof.setBCprofessor()); 
			}
		});
		btF.setBounds(194, 308, 89, 23);
		contentPane.add(btF);
		
		avalP_7 = new JTextField();
		avalP_7.setColumns(10);
		avalP_7.setBounds(122, 169, 133, 17);
		contentPane.add(avalP_7);
		
		JLabel lblInsiraSeuCargo = new JLabel("Insira seu cargo:");
		lblInsiraSeuCargo.setBounds(10, 171, 142, 14);
		contentPane.add(lblInsiraSeuCargo);
		
		avalP_6 = new JTextField();
		avalP_6.setColumns(10);
		avalP_6.setBounds(122, 143, 133, 17);
		contentPane.add(avalP_6);
		
		JLabel lblInsiraSeuSalrio = new JLabel("Insira seu salário:");
		lblInsiraSeuSalrio.setBounds(10, 145, 170, 14);
		contentPane.add(lblInsiraSeuSalrio);
		
		avalP_5 = new JTextField();
		avalP_5.setColumns(10);
		avalP_5.setBounds(122, 117, 133, 17);
		contentPane.add(avalP_5);
		
		JLabel lblInsiraSuaCtps = new JLabel("Insira sua CTPS:");
		lblInsiraSuaCtps.setBounds(10, 117, 142, 14);
		contentPane.add(lblInsiraSuaCtps);
		
		avalP_4 = new JTextField();
		avalP_4.setColumns(10);
		avalP_4.setBounds(132, 89, 123, 17);
		contentPane.add(avalP_4);
		
		JLabel lblInsiraSeuTelefone = new JLabel("Insira seu telefone:");
		lblInsiraSeuTelefone.setBounds(10, 89, 142, 14);
		contentPane.add(lblInsiraSeuTelefone);
		
		avalP_3 = new JTextField();
		avalP_3.setColumns(10);
		avalP_3.setBounds(122, 64, 133, 17);
		contentPane.add(avalP_3);
		
		JLabel lblInsiraSeuCpf = new JLabel("Insira seu CPF:");
		lblInsiraSeuCpf.setBounds(10, 64, 123, 14);
		contentPane.add(lblInsiraSeuCpf);
		
		avalP_2 = new JTextField();
		avalP_2.setColumns(10);
		avalP_2.setBounds(122, 39, 133, 17);
		contentPane.add(avalP_2);
		
		JLabel lblInsiraSeuCep = new JLabel("Insira seu CEP:");
		lblInsiraSeuCep.setBounds(10, 39, 142, 14);
		contentPane.add(lblInsiraSeuCep);
		
		avalP_1 = new JTextField();
		avalP_1.setColumns(10);
		avalP_1.setBounds(122, 14, 133, 17);
		contentPane.add(avalP_1);
		
		JLabel lblNewLabel = new JLabel("Insira seu nome:");
		lblNewLabel.setBounds(10, 14, 123, 14);
		contentPane.add(lblNewLabel);
		
		avalP_8 = new JTextField();
		avalP_8.setColumns(10);
		avalP_8.setBounds(143, 195, 112, 17);
		contentPane.add(avalP_8);
		
		JLabel lblInsiraSuaFormao = new JLabel("Insira sua formação:");
		lblInsiraSuaFormao.setBounds(10, 197, 170, 14);
		contentPane.add(lblInsiraSuaFormao);
		
		Retorno = new JTextField();
		Retorno.setEditable(false);
		Retorno.setColumns(10);
		Retorno.setBounds(10, 251, 409, 46);
		contentPane.add(Retorno);
	}

}
