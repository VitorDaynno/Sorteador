import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import java.awt.Rectangle;
import java.awt.Color;

public class TelaResultados extends JFrame
{
	public TelaResultados(String texto) 
	{
		getContentPane().setBackground(new Color(250, 235, 215));
		setBounds(new Rectangle(200,200,360,196));
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Resultados");
		getContentPane().setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setOpaque(false);
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 374, 239);
		getContentPane().add(textArea);
		textArea.setText(texto);
		setVisible(true);
	}
}
