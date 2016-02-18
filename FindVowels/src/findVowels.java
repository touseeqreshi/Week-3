
public class findVowels 
{
	public static void main(String[] args) 
	{    
        String tou ="My name is touseeq Rasool Reshi. I study MS Information Technology at CUW";
        //this is the string where java program is going to look for Vowels
        for(int i = 0; i < tou.length(); i = i + 1)
        {
            if((tou.charAt(i) == 'a')  || 
                (tou.charAt(i) == 'e') ||
                (tou.charAt(i) == 'i') || 
                (tou.charAt(i) == 'o') ||
                (tou.charAt(i) == 'u')) 
            {
                System.out.println(" The Vowels in the String tou are- " + tou.charAt(i));
            }
        }
    }
}
