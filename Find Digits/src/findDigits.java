
public class findDigits 
{
	public static void main(String[] args) 
	{    
        String Dig ="Student ID = F00327086, Cell NO. = +1-651-955-8685" ;
      //this is the string where java program is going to look for Digits
        for(int i = 0; i < Dig.length(); i = i + 1)
        {
        	char D = Dig.charAt(i);
        	
            if(((D == '0')  || 
                (D == '1')  ||
                (D == '2')  || 
                (D == '3')  ||
                (D == '4')  ||
                (D == '5')  ||
                (D == '6')  ||
                (D == '7')  ||
                (D == '8')  ||
                (D == '9'))) 
            {
                System.out.println(" The Digits in the String Dig are- " + Dig.charAt(i));
            }
        }
    }
}
