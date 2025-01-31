package JanStudy.fileStudy;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data="l昊t";
        //编码
        byte[] bytes = data.getBytes();
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes1));
        //解码
        String s = new String(bytes);
        String gbk = new String(bytes1,"GBK");
        System.out.println(s);
        System.out.println(gbk);
    }
}
