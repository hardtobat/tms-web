package wlf0;

import java.util.Map;

import cn.com.higinet.tms4.model.cache.SocketClient;

public class wlf003 {

	
	public String refresh(String refreshMsg) {

		
		String refreshInfo = "";
//		long currentTime = System.currentTimeMillis();
		
//			long activeTime = Long.parseLong(MapUtil.getString(server, "ACTIVETIME"));
//			long pingDelay = Long.parseLong(MapUtil.getString(server, "PINGDELAY"));
			String ip  = "10.18.12.45";
			String port = "7000"; 
			
//			if(currentTime-activeTime>pingDelay){
				//refreshInfo += ip+"端口"+port+"上的缓存刷新服务已失效；";
//				System.out.println("currentTime-activeTime="+(currentTime-activeTime));
//				continue;
//			} else {
			try{
				Map<String, byte[]> res = CacheSynService.getMessage(refreshMsg);
				byte[] b = res.get("b");
				byte[] ws = res.get("ws");
				CacheSynService.sendMessage(ip, port,b, ws, 3);
			}catch(Exception e){
				refreshInfo += e.getMessage();
			}
//			}
	
		return refreshInfo;
	}
	
	public static void sendMessage(String ip, String port, byte[] b, byte[] ws, int count){
		try {
			new SocketClient(ip, Integer.parseInt(port)).send(b, ws);
		} catch (Exception e) {
			if (count <= 0) {
			
			}
			count--;
			sendMessage(ip, port, b, ws, count);
			//sendMessage("10.18.12.44","70000", b, ws, count);
		}
	}
	
	
	
	public static String getXmlHead(String messageProp){
		StringBuffer sb = new StringBuffer();				
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<Message").append(messageProp==null?"":messageProp).append(">");
		return sb.toString();
	}	
	
	
	
	
	public static void main(String args[]){
		
		wlf003 ss = new wlf003();
		
		ss.refresh("TMS_MGR_ROSTERVALUE");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
