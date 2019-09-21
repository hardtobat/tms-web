package wlf0;

public class wlf001 {
	public static void main(String[] args){
		
		String reg = "~`#$￥%^&*{}][【】《》><?？/\\'=";	//特殊字符（描述信息可能会有中英文分号、叹号）
		String str = "123~";
		for(int j=0;j<reg.length();j++){
			if(str.indexOf(reg.charAt(j))!=-1){
				
				break;
			};
		}
		
	System.out.print(str.indexOf("~"));

}
		
	
	}
