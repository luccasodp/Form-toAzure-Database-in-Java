package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class FormAluno extends JFrame {

	private JPanel contentPane;
	private JTextField avalA_1;
	private JTextField avalA_2;
	private JTextField avalA_3;
	private JTextField avalA_4;
	private JTextField avalA_5;
	private JTextField avalA_6;
	private JTextField avalA_8;
	private JTextField avalA_7;
	private JTextField Retorno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAluno frame = new FormAluno();
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
	public FormAluno() {
		setTitle("Form Aluno");
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insira seu nome:");
		lblNewLabel.setBounds(10, 13, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblInsiraSeuCpf = new JLabel("Insira seu CPF:");
		lblInsiraSeuCpf.setBounds(10, 63, 113, 14);
		contentPane.add(lblInsiraSeuCpf);
		
		JLabel lblInsiraSeuCep = new JLabel("Insira seu CEP:");
		lblInsiraSeuCep.setBounds(10, 38, 94, 14);
		contentPane.add(lblInsiraSeuCep);
		
		JLabel lblInsiraSeuTelefone = new JLabel("Insira seu telefone:");
		lblInsiraSeuTelefone.setBounds(10, 88, 166, 14);
		contentPane.add(lblInsiraSeuTelefone);
		
		JLabel lblInsiraSuaMatrcula = new JLabel("Insira sua matrícula:");
		lblInsiraSuaMatrcula.setBounds(10, 113, 166, 14);
		contentPane.add(lblInsiraSuaMatrcula);
		
		JLabel lblInsiraSuaTurma = new JLabel("Insira sua turma:");
		lblInsiraSuaTurma.setBounds(10, 138, 138, 14);
		contentPane.add(lblInsiraSuaTurma);
		
		JLabel lblInsiraSuaSrie = new JLabel("Insira sua série:");
		lblInsiraSuaSrie.setBounds(10, 163, 138, 14);
		contentPane.add(lblInsiraSuaSrie);
		
		JLabel lblInsiraSeuTurno = new JLabel("Insira seu turno:");
		lblInsiraSeuTurno.setBounds(10, 188, 166, 14);
		contentPane.add(lblInsiraSeuTurno);
		
		JButton btA = new JButton("Enviar");
		btA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retorno.setText("Carregando...");
				Aluno aluno = new Aluno();
				String nome=avalA_1.getText();
				String cep= (avalA_2.getText());
				String cpf=avalA_3.getText();
				String tel=(avalA_4.getText());
				String matricula=avalA_5.getText();
				String turma=avalA_6.getText();
				String serie=avalA_5.getText();
				String turno=avalA_5.getText();
				
				aluno.setAluno(nome, cep, cpf, tel, matricula, turma, serie, turno);
				avalA_1.setText("");
				avalA_2.setText("");
				avalA_3.setText("");
				avalA_4.setText("");
				avalA_5.setText("");
				avalA_6.setText("");
				avalA_7.setText("");
				avalA_8.setText("");
				
				Retorno.setText(aluno.setBCaluno()); 
				
			}
		});
		btA.setBounds(174, 351, 89, 23);
		contentPane.add(btA);
		
		avalA_1 = new JTextField();
		avalA_1.setBounds(133, 11, 133, 17);
		contentPane.add(avalA_1);
		avalA_1.setColumns(10);
		
		avalA_2 = new JTextField();
		avalA_2.setColumns(10);
		avalA_2.setBounds(133, 36, 133, 17);
		contentPane.add(avalA_2);
		
		avalA_3 = new JTextField();
		avalA_3.setColumns(10);
		avalA_3.setBounds(133, 61, 133, 17);
		contentPane.add(avalA_3);
		
		avalA_4 = new JTextField();
		avalA_4.setColumns(10);
		avalA_4.setBounds(143, 85, 123, 17);
		contentPane.add(avalA_4);
		
		avalA_5 = new JTextField();
		avalA_5.setColumns(10);
		avalA_5.setBounds(153, 109, 113, 17);
		contentPane.add(avalA_5);
		
		avalA_6 = new JTextField();
		avalA_6.setColumns(10);
		avalA_6.setBounds(133, 138, 133, 17);
		contentPane.add(avalA_6);
		
		avalA_8 = new JTextField();
		avalA_8.setColumns(10);
		avalA_8.setBounds(130, 188, 133, 17);
		contentPane.add(avalA_8);
		
		avalA_7 = new JTextField();
		avalA_7.setColumns(10);
		avalA_7.setBounds(130, 163, 133, 17);
		contentPane.add(avalA_7);
		
		Retorno = new JTextField();
		Retorno.setEditable(false);
		Retorno.setColumns(10);
		Retorno.setBounds(37, 276, 350, 46);
		contentPane.add(Retorno);
		
	}

}
