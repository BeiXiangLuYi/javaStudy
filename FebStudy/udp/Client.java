package FebStudy.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket c = new DatagramSocket();
        byte[] data = "到此一游".getBytes();
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 6666);
        c.send(dp);
        c.close();
    }
}
