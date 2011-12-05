package tcp;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer {
	public static void main(String[] args) {
		
		try {
			//create server scocket
			ServerSocket server=new ServerSocket(8888);
			//listen the client
			Socket client=server.accept();
			//get the outprint stream
			PrintWriter pw=new PrintWriter(client.getOutputStream(),true); 
			//print message
			pw.print("no feeling man , give me some sadness!"); 
			client.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
