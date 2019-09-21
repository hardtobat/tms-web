package wlf0;



public class wlf {
	public static void main(String args[]){
	
/**		
		double jine=0;
		double sum=0;
        double sum_total=0;
	
	do{
		
		jine++;
		sum=0;
		for(int i=0;i<5;i++){
			System.out.println(i);
			if(i<1){
           sum = sum+jine*(1+0.06);	
           System.out.println(sum);
			}else{
           sum=sum*(1+0.06)+jine;
           System.out.println(sum);
			}
		}
		
		
	}while(sum<300);
	
	
	System.out.print(sum);
	
	System.out.print("**************"+jine);
	
	System.out.print("**************"+jine);
}
*/
		String[] ss ={"T04020101","1000277"};
		String[] ssss={"[T04020101]"};
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
		
		
		
		
		
		
		
		
		
		
String str = "1000243,1000244,1000238,1000247,1000255,1000254,1000253,1000252,1000250,1000249,1000245,1000242,1000240,1000011,1000012,1000013,1000014,T04020101,1000277,1000003,1000281,1000284,1000268,1000285,1000288,1000282,1000267,1000266,1000278,1000279,1000286,1000295,1000273,1000289,1000265,1000287,1000294,T04020102,T04020103,T04020104,T04020201,T04020202,T04020203,T04020301,T04020302,T040301,1000274,T04030201,1000297,1000296,T04030202,T04030301,1000299,T04030302,T0403030301,T0403030302,T0403030303,T04030304,T04030305,T04030306,T04030307,T04030308,1000276,1000306,1000304,1000303";
String[] str1 = str.split(",");
for(int i=0;i<str1.length;i++){
	if(str1[i].startsWith("T")){
		System.out.println("this this this :::"+str1[i]);
		str1[i]="123";
		
	}
	System.out.println(str1[i]);
	
}
		
		
		
		
		

		
//long s =CalendarUtil.parseStringToTimeMillis("20180980900572", CalendarUtil.FORMAT10.toPattern());
		
		
		
		
		
		
	}

}
