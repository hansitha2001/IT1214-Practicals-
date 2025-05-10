import it.*;
import it.hons.*;
import amc.*;

class App{
	public static void main(String[] ar){
		
		amc.FirstYear fya=new amc.FirstYear();         
		it.FirstYear fy=new it.FirstYear();            
		
		SecondYear sy=new SecondYear();                
		FourthYear itHons=new FourthYear();            
		
		fya.display();
		fy.display();
		sy.display();
		itHons.display();
	}
}