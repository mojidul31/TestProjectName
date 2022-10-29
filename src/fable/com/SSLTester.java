package fable.com;

import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SSLTester {

	public static void main(String[] args) {
		SSLSocketFactory f = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = null;
		try {
			socket = (SSLSocket) f.createSocket("efm.sandbox.vovici.com", 443 );
		} catch (IOException e1) {
			e1.printStackTrace();
			System.err.println(e1.toString());
		}
        try {
            printSocketInfo(socket);
            socket.startHandshake();    
            System.out.println("----------------------------------SUCCESS----------------------------------");

            BufferedReader r = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String m = null;
            while ((m = r.readLine()) != null) {
                System.out.println(m);

            }
            r.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.toString());
        }
    }

    private static void printSocketInfo(SSLSocket s) {
        System.out.println("Socket class: " + s.getClass());
        System.out.println("    Remote address = "
                + s.getInetAddress().toString());
        System.out.println("    Remote port = " + s.getPort());
        System.out.println("    Local socket address = "
                + s.getLocalSocketAddress().toString());
        System.out.println("    Local address = "
                + s.getLocalAddress().toString());
        System.out.println("    Local port = " + s.getLocalPort());
        System.out.println("    Need client authentication = "
                + s.getNeedClientAuth());
        SSLSession ss = s.getSession();
        System.out.println("    Cipher suite = " + ss.getCipherSuite());
        System.out.println("    Protocol = " + ss.getProtocol());
    }

}
