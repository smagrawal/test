package test;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Date date = new Date();
   Timestamp ts = new Timestamp(date.getTime());
   System.out.println(ts);
   System.out.println(date.getTime());
   long l1 = ts.getTime() + 5*60*1000;
   //ts.setTime(ts.getTime() + 1*60*1000);
   Timestamp ts1 = new Timestamp(l1);
   if(ts1.after(ts)){
	   System.out.println("is before");
   }
   System.out.println(ts1);
	}

}
