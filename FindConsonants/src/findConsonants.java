
public class findConsonants 
{
	public static void main(String[] args) 
	{    
        String con ="Touseeq Rasool Reshi keep working hard";
      //this is the string where java program is going to look for Consonants
        for(int i = 0; i < con.length(); i = i + 1)
        {
            if(!((con.charAt(i) == 'a') || 
                (con.charAt(i) == 'e')  ||
                (con.charAt(i) == 'i')  || 
                (con.charAt(i) == 'o')  ||
                (con.charAt(i) == 'u'))) 
            	//to give all the consonants it is better and easy to find Vowels and use NOT (!) arithmetic operator
            {
                System.out.println(" The Consonants in the String con are- " + con.charAt(i));
            }
        }
    }
}
