import java.util.*;
public class Odev {

	public static void main(String[] args) {
	
	

				Scanner girdi = new Scanner(System.in);
				System.out.print("L�tfen a, b ve c de�i�kenlerini giriniz\n");
				System.out.println("a: ");
				int a = girdi.nextInt();
				System.out.println("b: ");
				int b = girdi.nextInt();
				System.out.println("c: ");
				int c = girdi.nextInt();
			double diskrement= Math.pow(b,2) - 4*a*c;
			System.out.print("diskrement= "+diskrement+"\n");
			if(diskrement==0)
			{
				double kok= (-b)/(2*a);
				System.out.println(" de�erleri birbirine e�it olan iki k�k� vard�r x1=x2="+kok+"\n");	
				
			}
			else if (diskrement>0)
			{ 
				double kok1= ((-b+Math.sqrt(diskrement))/(2*a));
				double kok2= ((-b-Math.sqrt(diskrement))/(2*a));
				System.out.println(" de�erleri birbirinden farkl� iki k�k� vard�r x1="+kok1 + "  x2="+kok2+"\n");
			}
			else 
			{
				System.out.println(" denklemin ger�el say�larla ifade edilebilecek bir k�k� yoktur");
			}
			} 

		}

	

