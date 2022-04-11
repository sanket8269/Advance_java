package Net;

import java.io.IOException;

public class MultiThreadQuoteServer {
	public static void main(String[] args) throws IOException {
		new QuoteServerThread().start();
	}
}
