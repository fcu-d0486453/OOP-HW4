package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObject = new Scanner(System.in);
		String  E = new String("exit");
		
		while (true) 
		{
		System.out.println("Please key in your want to encode string.");
		System.out.print("Encode string → ");
        PasswordEncoder passWord = new PasswordEncoder();//建立一個物件
		                                                //為PasswordEncoder 類別
        /*給定類別內的pW*/
		passWord.pW = scannerObject.nextLine();
		
				if ( passWord.pW.compareToIgnoreCase(E) != 0 )
				{
					passWord.Encode(); 
					System.out.println("");
					System.out.println("");
				}
				else
				{	
				    break;
		        }
		}
		System.out.println("End of program.");
    
		scannerObject.close();
	}

}
