package FebStudy.tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(8888);
        Socket socket = s.accept();
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String rs = dis.readUTF();
        rs.startsWith("s");
        System.out.println(rs);
        dis.close();
        socket.close();
        s.close();
    }
}
