package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		System.out.println("Je suis Client pas encore connecte");
		try {
			Socket s= new Socket("localhost",1234);
			System.out.println("Je suis Client connecte");
			int nb ;
		    Scanner scanner=new Scanner(System.in);
			nb=scanner.nextInt();
		    OutputStream os= s.getOutputStream();
		    InputStream is= s.getInputStream();
		    os.write(nb);
		    int rep=is.read();
		    System.out.println("le produit"+nb+"*5"+rep);
			System.out.println("dec");
			s.close();
			scanner.close();
			System.out.println("dec");
			s.close();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
	}

}
