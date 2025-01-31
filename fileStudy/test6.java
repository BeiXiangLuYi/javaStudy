package JanStudy.fileStudy;

import java.io.*;
import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {
        //创建字节流输入管道
        /*InputStream is = new FileInputStream("/home/lht/IdeaProjects/study/study.txt");
        File file = new File("/home/lht/IdeaProjects/study/study.txt");
        long size = file.length();*/


        //创建字节流输出管道
        //FileOutputStream os = new FileOutputStream("study.txt",true);


        //写入内容
        /*os.write(97);
        os.write('b');


        //一次写入多个字节
        byte[] bytes = "中国我爱你123".getBytes();
        os.write(bytes,0,15);
        os.write(bytes);
        os.write("\r\n".getBytes());
        os.close();*/
        //字节流，一个一个读取


        /*int b;
        while((b=is.read())!=-1){
            //解码
            String rs="";
            rs+=(char)b;
            System.out.print(rs);
        }*/


        //一个数组一个数组的读取
        /*byte[] buffer = new byte[3];
        int read = is.read(buffer);
        String s = new String(buffer);
        System.out.println(s);
        */


        //循环改造
        /*byte[] buffer = new byte[3];
        int len;
        while((len=is.read(buffer))!=-1){
            String rs = new String(buffer,0,len);
            System.out.print(rs);
        }*/


        //以文件字节大小定义一个数组一次性获取所有文件内容
        /*byte[] bytes = new byte[(int) size];
        int len = is.read(bytes);
        String s = new String(bytes);
        System.out.println(s);*/
        /*byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));
        is.close();*/

        //复制文件
        /*FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream("/home/lht/IdeaProjects/study/study.txt");
            os = new FileOutputStream("/home/lht/IdeaProjects/study/study(2).txt");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(os!=null){os.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is!=null){is.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        try (FileInputStream is = new FileInputStream("/home/lht/IdeaProjects/study/study.txt");
             FileOutputStream os = new FileOutputStream("/home/lht/IdeaProjects/study/study(2).txt");) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
