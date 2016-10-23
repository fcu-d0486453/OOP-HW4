package fcu.iecs.oop.password;

public class PasswordEncoder {

	public String pW = new String();
	
	
	public void Encode(/*String CipherText*/) 
	{
	    char element[];
	    
	    
	    element = pW.toCharArray();//Âà¦¨¦r¤¸°}¦C
		
	    System.out.print("After encord  ¡÷ ");
		for( int i=0 ; i<pW.length() ; i++ )
		{
			switch ( element[i] )
			{
			    case 'A':case 'a':
			    	element[i]='4';
			    	break;
			    case 'E':case 'e':
			    	element[i]='3';
			    	break;
			    case 'I':case 'i':
			    	element[i]='1';
			    	break;
			    case 'O':case 'o':
			    	element[i]='0';
			    	break;
			    case 'T':case 't':
			    	element[i]='7';
			    	break;	
			    
			}
			System.out.printf("%c",element[i]);
		}
	}

}
