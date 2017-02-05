import java.util.ArrayList;
import java.util.Random;

public class Sorteador 
{
	private int inicio;
	private int fim;
	private int quant;
	
	public Sorteador(int inicio, int fim, int quant) 
	{
		this.inicio = inicio;
		this.fim = fim;
		this.quant = quant;
	}
	
	public ArrayList sortear()
	{
		Random sortear= new Random();
		int num,aux=0;
		ArrayList numeros=new ArrayList<>();
		int i=0;
		if(inicio==0)
		{
			aux=1;
		}
		while(i<quant)
		{
			num=inicio+sortear.nextInt(fim+aux);
			if(num<=fim)
			{
				if(!numeros.contains(num))
				{
					numeros.add(num);
					i++;
				}
			}
		}
		return numeros;
	}
	
	public int getInicio() 
	{
		return inicio;
	}
	
	public void setInicio(int inicio) 
	{
		this.inicio = inicio;
	}
	
	public int getFim() 
	{
		return fim;
	}
	
	public void setFim(int fim) 
	{
		this.fim = fim;
	}
	
	public int getQuant() 
	{
		return quant;
	}
	
	public void setQuant(int quant) 
	{
		this.quant = quant;
	}
}
