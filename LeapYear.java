
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int LeapYear;
        LeapYear = 2036;
        
        if ((LeapYear %100!= 0) && (LeapYear% 4==0))
        {
        System.out.print(LeapYear + " : is Leap Year");
        }
        else
        
        {
        	System.out.print(LeapYear + " : is Not Leap Year");
        }
        }

    }

