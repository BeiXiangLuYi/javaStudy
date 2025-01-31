package JanStudy.fileStudy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class test7 {
    public static void main(String[] args){
        /*try (FileReader fr = new FileReader("/home/lht/IdeaProjects/study/study.txt");) {
            //每次读取一个字符
            int len;
            while ((len = fr.read()) != -1) {
                System.out.print((char) len);
            }
            //每次读取一个数组的字符
            char[] buffer = new char[3];
            int len;
            while ((len=fr.read(buffer))!=-1){
                System.out.print(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //写入字符
        try (FileWriter fw = new FileWriter("/home/lht/IdeaProjects/study/study.txt(3)",true)) {
            fw.write('1');
            fw.write("外蒙古工业小学");
            char[] c="张三到此一游".toCharArray();
            fw.write(c,0,2);
            fw.write("\r\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
