package wlf0;

import java.util.HashMap;
import java.util.Map;
import cn.com.higinet.cmc.util.StringUtil;
import cn.com.higinet.tms35.comm.StaticParameters;
import cn.com.higinet.tms4.model.cache.SocketClient;

public class CacheSynService {
	
	public static Map<String, byte[]> getMessage(String refreshMsg) {
		Map<String, byte[]> result = new HashMap<String, byte[]>();
		try {
			StringBuffer body = new StringBuffer();
			body.append(getXmlHead(null));
			body.append(StringUtil.appendXmlMessage("tableName", refreshMsg));
			body.append("</Message>");
			
			byte[] b = MSG_HEADER;
			byte[] ws = body.toString().getBytes("UTF-8");

			String len = String.valueOf(ws.length);
			len = "00000000".substring(len.length()) + len;
			System.arraycopy(len.getBytes(), 0, b, 0, 8);
			result.put("b", b);
			result.put("ws", ws);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("未能成功生成缓存刷新请求报文");
		}
	}

	public static final byte[] MSG_HEADER = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',// 报文体长度
			'T', 'M', 'S', ' ', ' ', ' ', ' ', ' ',// 服务号
			'0', '0', '0', '5', // 交易号
			'X', 'M', 'L', ' ', // 报文体类型
			' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' // 返回码
	};
	
	
	
	public static String getXmlHead(String messageProp){
		StringBuffer sb = new StringBuffer();				
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<Message").append(messageProp==null?"":messageProp).append(">");
		return sb.toString();
	}	
	
	
	
	
	
	
	public static void sendMessage(String ip, String port, byte[] b, byte[] ws, int i) {
		// TODO Auto-generated method stub
		try {
			new SocketClient(ip, Integer.parseInt(port)).send(b, ws);
		} catch (Exception e) {
			if (i <= 0) {
			}
			i--;
			sendMessage(ip, port, b, ws, i);
		}
	}

}
