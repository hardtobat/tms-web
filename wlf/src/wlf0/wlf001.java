package wlf0;

public class wlf001 {
	public static void main(String[] args){
		
		String reg = "~`#$��%^&*{}][��������><?��/\\'=";	//�����ַ���������Ϣ���ܻ�����Ӣ�ķֺš�̾�ţ�
		String str = "123~";
		for(int j=0;j<reg.length();j++){
			if(str.indexOf(reg.charAt(j))!=-1){
				
				break;
			};
		}
		
	System.out.print(str.indexOf("~"));

}
		
	
	}
