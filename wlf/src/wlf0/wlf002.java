package wlf0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class wlf002 {
	
	public static void main(String args[]){
		
		
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
		String time=format.format(date);
		
		System.out.println(time);
		String ss = "123";
		
	 long ss1 = 19700308150502l;
	 System.out.println(ss1);
		
		 int arr[][] = new int[][] { { 1 }, { 1, 2 }, { 1, 2, 3 } };
		 for (int i = 0; i < arr.length; i++) {
		  int[] arr2 = arr[i];
		  System.out.println(arr2);
//		  for (int c = 0; c < arr2.length; c++) {
//		   System.out.print(arr2[c]);
//		  }
		  
		 }
		
		
	}

}
