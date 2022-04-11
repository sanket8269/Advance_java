 package Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuoteClient {

	public static void main(String[] args) throws IOException {

		// Start UDP Socket on a port assigned by OS
		DatagramSocket socket = new DatagramSocket();

		// Create a byte buffer
		byte[] buf = new byte[256];

		// Encapsulate Server's IP Address
		InetAddress address = InetAddress.getByName("127.0.0.1");

		// Create a new packet with Server IP Address and Port Number
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address,
				4445);

		// Send packet
		socket.send(packet);

		// Create an empty data packet to receive Server's packet
		packet = new DatagramPacket(buf, buf.length);

		// Wait for a packet and receive
		socket.receive(packet);

		// Display response
		String received = new String(packet.getData());

		System.out.println("Quote of the Moment: " + received);

		// Close Socket
		socket.close();
	}
}