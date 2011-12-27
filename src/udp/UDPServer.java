package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(8888);
			String s="one two three";
			DatagramPacket dp=new DatagramPacket(s.getBytes(), 0,s.length(),InetAddress.getByName("127.0.0.1"),8888);
			ds.send(dp);
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
