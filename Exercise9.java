package lab3;
import java.time.*;
public class Exercise9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LocalDate pdate = LocalDate.of(2018, 03, 10);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
        System.out.printf("\nDifference is %d years, %d months and %d days\n\n",
        		diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
