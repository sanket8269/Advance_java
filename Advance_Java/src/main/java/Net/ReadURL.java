package Net;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class ReadURL {

	public static void main(String[] args) throws IOException {

		InputStream inStream = null;

		URL u = null;
		try {
			u = new URL("http://www.yahoo.com");
			inStream = u.openStream();

		} catch (Exception e) {
			System.out.println("Error in URL");
			System.exit(0); // Terminate execution.
		}

		Scanner in = new Scanner(inStream);

		while (in.hasNext()) {
			String str = in.nextLine().replace("Yahoo", "Sunrays");

			System.out.println(str);
		}

		in.close();

	}

}
