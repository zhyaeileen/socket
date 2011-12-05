package tcp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost",8888);
			
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader buf=new BufferedReader(isr);
			System.out.println(buf.readLine());
			buf.close();
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
