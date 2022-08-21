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

public class FormResp extends JFrame {

	private JPanel contentPane;
	private JTextField avalR_4;
	private JTextField avalR_3;
	private JTextField avalR_2;
	private JTextField avalR_1;
	private JTextField avalR_5;
	private JTextField Retorno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormResp frame = new FormResp();
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
	public FormResp() {
		setTitle("Form Resp");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 434, 262);
		contentPane.add(contentPane_1);
		
		JButton btF = new JButton("Enviar");
		btF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retorno.setText("Carregando...");
				Responsavel resp=new Responsavel();
				
				String nome=avalR_1.getText();
				String cep= avalR_2.getText();
				String cpf=avalR_3.getText();
				String tel=avalR_4.getText();
				String ctt=avalR_5.getText();
				
				
				resp.setResponsavel(nome, cep, cpf, tel, ctt);
				
				avalR_1.setText("");
				avalR_2.setText("");
				avalR_3.setText("");
				avalR_4.setText("");
				avalR_5.setText("");;
				Retorno.setText(resp.setBCresponsavel()); 
			}
		});
		btF.setBounds(176, 201, 89, 23);
		contentPane_1.add(btF);
		
		avalR_4 = new JTextField();
		avalR_4.setColumns(10);
		avalR_4.setBounds(135, 87, 119, 17);
		contentPane_1.add(avalR_4);
		
		JLabel lblInsiraSeuTelefone = new JLabel("Insira seu telefone:");
		lblInsiraSeuTelefone.setBounds(10, 86, 133, 14);
		contentPane_1.add(lblInsiraSeuTelefone);
		
		avalR_3 = new JTextField();
		avalR_3.setColumns(10);
		avalR_3.setBounds(121, 61, 133, 17);
		contentPane_1.add(avalR_3);
		
		JLabel lblInsiraSeuCpf = new JLabel("Insira seu CPF:");
		lblInsiraSeuCpf.setBounds(10, 61, 123, 14);
		contentPane_1.add(lblInsiraSeuCpf);
		
		avalR_2 = new JTextField();
		avalR_2.setColumns(10);
		avalR_2.setBounds(121, 36, 133, 17);
		contentPane_1.add(avalR_2);
		
		JLabel lblInsiraSeuCep = new JLabel("Insira seu CEP:");
		lblInsiraSeuCep.setBounds(10, 36, 123, 14);
		contentPane_1.add(lblInsiraSeuCep);
		
		avalR_1 = new JTextField();
		avalR_1.setColumns(10);
		avalR_1.setBounds(121, 11, 133, 17);
		contentPane_1.add(avalR_1);
		
		JLabel lblNewLabel = new JLabel("Insira seu nome:");
		lblNewLabel.setBounds(10, 11, 123, 14);
		contentPane_1.add(lblNewLabel);
		
		avalR_5 = new JTextField();
		avalR_5.setColumns(10);
		avalR_5.setBounds(135, 115, 119, 17);
		contentPane_1.add(avalR_5);
		
		JLabel lblInsiraSeuContato = new JLabel("Insira seu contato:");
		lblInsiraSeuContato.setBounds(10, 114, 161, 14);
		contentPane_1.add(lblInsiraSeuContato);
		
		Retorno = new JTextField();
		Retorno.setEditable(false);
		Retorno.setBounds(10, 144, 414, 46);
		contentPane_1.add(Retorno);
		Retorno.setColumns(10);
		
	}
}
