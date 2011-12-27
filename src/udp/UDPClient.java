package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {
		public static void main(String[] args) {
			try {
				DatagramSocket ds=new DatagramSocket(8888);
				byte  b[]=new byte[1024];
				DatagramPacket dp=new DatagramPacket(b, b.length);
				ds.receive(dp);				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
