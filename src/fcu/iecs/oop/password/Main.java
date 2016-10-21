package fcu.iecs.oop.password;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scannerObject= new Scanner(System.in);
        System.out.println("Please key in your want to encode string.");
        System.out.print("Encode string ¡÷ ");
        
        PasswordEncoder passWord = new PasswordEncoder();
        
       String wantEncrypt = new String();
              wantEncrypt = scannerObject.nextLine(); 
              
        passWord.Encode(wantEncrypt);
        
        
        
        
	}

	

}
