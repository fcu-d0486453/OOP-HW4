package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NissanTiida HaHa = new NissanTiida();
		Scanner scannerObject = new Scanner(System.in);
		
		
		System.out.print("請輸入數字 → ");
		
		while( !scannerObject.hasNextInt() )
		{
			  System.out.print("請輸入整數 → ");
			  scannerObject.next();//清除輸入的內容
		}
		
		
		HaHa.count = scannerObject.nextInt();
		HaHa.printP();
		
		scannerObject.close();
    }

}
