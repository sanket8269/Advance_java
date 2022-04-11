package Net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloTCPServer {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		// Create a Server
		ServerSocket server = new ServerSocket(1234);
		// Wait for Client
		Socket client = server.accept();
		// Open Client’s Input Stream
		DataInputStream in = new DataInputStream(client.getInputStream());
		// Open Client’s Output Stream
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		// Read greeting sent by Client
		String greeting = in.readLine();
		// Open Client’s Input Stream
		System.out.println(greeting);

		// Write greetings to Client
		out.writeBytes("Hello Client\n");
		// Close connection with Client
		client.close();
		// Close Server
		server.close();

	}
}
