package ServerPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args)  {
	
	
		try {
			System.out.println("Je suis un Server");
			ServerSocket ss;
			ss = new ServerSocket(1234);
			Socket s =ss.accept() ;
		    System.out.println("un client est connecte"); 
		    OutputStream os= s.getOutputStream();
		    InputStream is= s.getInputStream();
		    int nb=is.read();
		    int rep=nb*5;
		    os.write(rep);
		    System.out.println("dec");
		    s.close();
		    ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
     
	}

}


