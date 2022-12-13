
public class LeluLuokka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}//End main

class Lelu
{
	String nimi;
	public double paino;

public Lelu()
	{
	nimi = "auto";
	paino = 0.2;
	}

public Lelu(String nimi, double paino)
	{
	this.nimi = nimi;
	this.paino = paino;
	}
public void naytaTiedot()
	{
	System.out.println("Lelun nimi: " + nimi);
	System.out.println("Lelun paino: " + paino);
	}
}
class Vieteriauto extends Lelu
	{
	int nopeus;
	
public void kiihdyta()
{
	nopeus++;
}
@Override
public void naytaTiedot()
{
System.out.println("Lelun nimi: " + nimi);
System.out.println("Lelun paino: " + paino);
System.out.println("Lelun nopeus: " + nopeus);
}
}