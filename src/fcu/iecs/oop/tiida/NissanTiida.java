package fcu.iecs.oop.tiida;



public class NissanTiida {
	
	public int count;
	int i,j;
	
	
	void printP()
	{
		if(count<=0)
		{
			System.out.println("��J�ƭȿ��~  ��������");
			System.exit(1);
		}
			for(i=0 ; i<count ; i++)
        {
        	for(j=0 ; j<count ; j++)
        	{
        		System.out.print('*');
        	}
        	System.out.println();
        }
	}
	
}
