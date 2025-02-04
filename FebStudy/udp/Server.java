package FebStudy.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket s = new DatagramSocket(6666);
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        s.receive(dp);
        int len = dp.getLength();
        String rs = new String(buffer,0,len);
        System.out.println(rs);
        s.close();
    }
}
