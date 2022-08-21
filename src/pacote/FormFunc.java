package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class FormFunc extends JFrame {

	private JPanel contentPane;
	private JTextField avalF_1;
	private JTextField avalF_2;
	private JTextField avalF_4;
	private JTextField avalF_3;
	private JTextField avalF_5;
	private JTextField avalF_6;
	private JTextField avalF_7;
	private JTextField Retorno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormFunc frame = new FormFunc();
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
	public FormFunc() {
		setTitle("Form Funcionario");
		
		setBounds(100, 100, 450, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		avalF_1 = new JTextField();
		avalF_1.setColumns(10);
		avalF_1.setBounds(131, 14, 133, 17);
		contentPane.add(avalF_1);
		
		JLabel lblNewLabel = new JLabel("Insira seu nome:");
		lblNewLabel.setBounds(10, 14, 111, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblInsiraSeuCep = new JLabel("Insira seu CEP:");
		lblInsiraSeuCep.setBounds(10, 39, 111, 14);
		contentPane.add(lblInsiraSeuCep);
		
		avalF_2 = new JTextField();
		avalF_2.setColumns(10);
		avalF_2.setBounds(131, 39, 133, 17);
		contentPane.add(avalF_2);
		
		JLabel lblInsiraSeuCpf = new JLabel("Insira seu CPF:");
		lblInsiraSeuCpf.setBounds(10, 64, 111, 14);
		contentPane.add(lblInsiraSeuCpf);
		
		JLabel lblInsiraSeuTelefone = new JLabel("Insira seu telefone:");
		lblInsiraSeuTelefone.setBounds(10, 89, 111, 14);
		contentPane.add(lblInsiraSeuTelefone);
		
		avalF_4 = new JTextField();
		avalF_4.setColumns(10);
		avalF_4.setBounds(141, 89, 123, 17);
		contentPane.add(avalF_4);
		
		avalF_3 = new JTextField();
		avalF_3.setColumns(10);
		avalF_3.setBounds(131, 64, 133, 17);
		contentPane.add(avalF_3);
		
		JLabel lblInsiraSuaCtps = new JLabel("Insira sua CTPS:");
		lblInsiraSuaCtps.setBounds(10, 117, 111, 14);
		contentPane.add(lblInsiraSuaCtps);
		
		avalF_5 = new JTextField();
		avalF_5.setColumns(10);
		avalF_5.setBounds(131, 117, 133, 17);
		contentPane.add(avalF_5);
		
		JLabel lblInsiraSeuSalrio = new JLabel("Insira seu salário:");
		lblInsiraSeuSalrio.setBounds(10, 144, 111, 14);
		contentPane.add(lblInsiraSeuSalrio);
		
		avalF_6 = new JTextField();
		avalF_6.setColumns(10);
		avalF_6.setBounds(131, 142, 133, 17);
		contentPane.add(avalF_6);
		
		JLabel lblInsiraSeuCargo = new JLabel("Insira seu cargo:");
		lblInsiraSeuCargo.setBounds(10, 169, 123, 14);
		contentPane.add(lblInsiraSeuCargo);
		
		avalF_7 = new JTextField();
		avalF_7.setColumns(10);
		avalF_7.setBounds(131, 170, 133, 17);
		contentPane.add(avalF_7);
		
		JButton btF = new JButton("Enviar");
		btF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retorno.setText("Carregando...");
				Funcionario func =new Funcionario();
				String nome=avalF_1.getText();
				String cep= (avalF_2.getText());
				String cpf=(avalF_3.getText());
				String tel=(avalF_4.getText());;
				String CTPS=(avalF_5.getText());;
				String salario=(avalF_6.getText());;
				String cargo=avalF_7.getText();
				
				func.setFunc(nome,cep, cpf, tel,CTPS,salario,cargo);
				
				avalF_1.setText("");
				avalF_2.setText("");
				avalF_3.setText("");
				avalF_4.setText("");
				avalF_5.setText("");
				avalF_6.setText("");
				avalF_7.setText("");
				Retorno.setText(func.setBCfunconario()); 
			}
		});
		btF.setBounds(179, 292, 89, 23);
		contentPane.add(btF);
		
		Retorno = new JTextField();
		Retorno.setEditable(false);
		Retorno.setColumns(10);
		Retorno.setBounds(10, 235, 414, 46);
		contentPane.add(Retorno);
		
	}
	
}
