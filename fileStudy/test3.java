package JanStudy.fileStudy;

import java.io.File;

//删除非空文件夹
public class test3 {
    public static void main(String[] args) {
        File f1 = new File("/home/lht/aaa");
        deleteALl(f1);
    }

    public static void deleteALl(File file) {
        //判断是否为非空文件夹
        if (file==null||!file.exists()) {
            return;
        }
        if(file.isFile()){
            file.delete();
            return;
        }
        //遍历文件夹
        File[] files = file.listFiles();
        for (File f : files) {
            //如果f为文件则直接删除
            if (f.isFile()) {
                f.delete();
            } else {
                deleteALl(f);
            }
        }
        file.delete();
    }
}
