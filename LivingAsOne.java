import java.io.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LivingAsOne {
	

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Hamza\\Desktop\\dates.txt"));
		String str;

		List<String> list = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    list.add(str);
		}

		String[] stringArr = list.toArray(new String[0]);
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM d, yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMMM-dd-yyyy");
		SimpleDateFormat sdf4 = new SimpleDateFormat("MMMM dd, yyyy");

		
		

		String NEW_FORMAT = "yyyy-MM-dd";
		String newDateString;
		for (int i = 0; i < stringArr.length; i++) {
			
		String date = stringArr[i];
		
		/*Date dates1 = sdf1.parse(date);
		sdf1.applyPattern(NEW_FORMAT);
		newDateString = sdf1.format(dates1);
		System.out.println(newDateString);*/
		
		try {
		Date dates1 = sdf1.parse(date);
		sdf1.applyPattern(NEW_FORMAT);
		newDateString = sdf1.format(dates1);
		System.out.println(newDateString);
		}
		catch (Exception e1)
		{
			System.out.println("Converting date..");
		}
		try {
			Date dates2 = sdf2.parse(date);
			sdf2.applyPattern(NEW_FORMAT);
			newDateString = sdf2.format(dates2);
			System.out.println(newDateString);
			}
			catch (Exception e2)
			{
				System.out.println("Converting date..");
			}
		
		try {
			Date dates3 = sdf3.parse(date);
			sdf3.applyPattern(NEW_FORMAT);
			newDateString = sdf3.format(dates3);
			System.out.println(newDateString);
			}
			catch (Exception e3)
			{
				System.out.println("Converting date..");
			}
		try {
			Date dates4 = sdf4.parse(date);
			sdf4.applyPattern(NEW_FORMAT);
			newDateString = sdf4.format(dates4);
			System.out.println(newDateString);
			}
			catch (Exception e4)
			{
				System.out.println("Converting date..");
			}
		
				
			}
		}
		
		
		
		
		
		
		
	
		

		
		
	}


