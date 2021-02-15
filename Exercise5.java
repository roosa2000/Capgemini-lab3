package lab3;

public class Exercise5 {
	public void count(String str)
	{
		char[] ch = str.toCharArray();
		int ctr=0;
        for (int i = 0; i < ch.length; i++) 
        {
        	String s = "";
        	while (i < ch.length && ch[i] != ' ')
        	{ 
                s = s + ch[i]; 
                i++; 
            } 
        	if (s.length() > 0)
        		ctr=ctr+s.length();
                
        }
        System.out.println("No of Characters: "+ctr);
	}
	public static int word(String str)
	{
		if (str == null || str.isEmpty()) 
            return 0;
		 String[] words = str.split("\\s+");
		 return words.length; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I live in Kolkata"; 
		Exercise5 obj=new Exercise5();
        obj.count(str);
        System.out.println("No of words : " + 
                word(str));

	}

}
