
public class LeluLuokka {

	public static void main(String[] args) {
	Lelu pehmoKissa = new Lelu("Miuku", 0.3);
	
	pehmoKissa.naytaTiedot();
	
	VieteriAuto kaara = new VieteriAuto();
	kaara.naytaTiedot();
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
private void naytaTiedot()
	{
	System.out.println("Lelun nimi: " + nimi);
	System.out.println("Lelun paino: " + paino);
	}
}
class VieteriAuto extends Lelu
	{
	int nopeus;
	
public void kiihdyta()
{
	nopeus++;
}

public void naytaTiedot()
{
System.out.println("Lelun nimi: " + nimi);
System.out.println("Lelun paino: " + paino);
System.out.println("Lelun nopeus: " + nopeus);
}
}