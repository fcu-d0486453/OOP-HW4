package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NissanTiida HaHa = new NissanTiida();
		Scanner scannerObject = new Scanner(System.in);
		
		
		System.out.print("�п�J�Ʀr �� ");
		
		while( !scannerObject.hasNextInt() )
		{
			  System.out.print("�п�J��� �� ");
			  scannerObject.next();//�M����J�����e
		}
		
		
		HaHa.count = scannerObject.nextInt();
		HaHa.printP();
		
		scannerObject.close();
    }

}
