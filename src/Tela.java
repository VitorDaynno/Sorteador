import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Tela extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField inicio;
	private JTextField ultimo;
	private JTextField quantidade;
	private TelaResultados resultados;
	private TelaResultados resultados2;
	
	public Tela()
	{
		getContentPane().setBackground(new Color(250, 235, 215));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(200,200,360,196);
		getContentPane().setLayout(null);
		
		inicio = new JTextField();
		inicio.setBounds(30, 80, 80, 20);
		getContentPane().add(inicio);
		inicio.setColumns(10);
		
		ultimo = new JTextField();
		ultimo.setBounds(140, 80, 80, 20);
		getContentPane().add(ultimo);
		ultimo.setColumns(10);
		
		quantidade = new JTextField();
		quantidade.setBounds(250, 80, 80, 20);
		getContentPane().add(quantidade);
		quantidade.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				sortear();
			}
		});
		btnOk.setBounds(255, 133, 89, 23);
		getContentPane().add(btnOk);
		
		JLabel label0 = new JLabel("N\u00B0 inicial");
		label0.setBounds(30, 60, 80, 14);
		getContentPane().add(label0);
		
		JLabel lblNFinal = new JLabel("N\u00B0 final");
		lblNFinal.setBounds(140, 60, 46, 14);
		getContentPane().add(lblNFinal);
		
		JLabel lblQuantidade = new JLabel("Quantidade ");
		lblQuantidade.setBounds(250, 60, 80, 14);
		getContentPane().add(lblQuantidade);
		setVisible(true);
	}	
	
	private void sortear()
	{
		if(Integer.parseInt(quantidade.getText())<=Integer.parseInt(ultimo.getText())-(Integer.parseInt(inicio.getText())-1)&&Integer.parseInt(inicio.getText())!=0)
		{
			Sorteador sorteio= new Sorteador(Integer.parseInt(inicio.getText()),Integer.parseInt(ultimo.getText()),Integer.parseInt(quantidade.getText()));
			resultados = new TelaResultados(sorteio.sortear().toString());
		}
		else if(Integer.parseInt(quantidade.getText())<=1+Integer.parseInt(inicio.getText())+Integer.parseInt(ultimo.getText())&&Integer.parseInt(inicio.getText())==0)
		{
			Sorteador sorteio= new Sorteador(Integer.parseInt(inicio.getText()),Integer.parseInt(ultimo.getText()),Integer.parseInt(quantidade.getText()));
			resultados2 = new TelaResultados(sorteio.sortear().toString());
		}
		else
		{
			System.out.println("Erro");
		}
		
	}
}
