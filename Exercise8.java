package lab3;

public class Exercise8 {
	public static boolean positiveOrNegative(String str)
	{
		int n = str.length(); 
		  
        for (int i = 1; i < n; i++) 
        {
        	if (str.charAt(i) < str.charAt(i - 1)) 
        	{ 
                return false;
        	}
        }
        return true;
  
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "aabbbcc"; 
        if (positiveOrNegative(s)) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
	}

}
