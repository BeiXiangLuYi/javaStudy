package JanStudy.fileStudy;

import java.io.File;

public class test2{
    public static void main(String[] args) {
        File f1 = new File("/home");
        searchFile(f1, "test2.java");
    }

    public static void searchFile(File dir, String name) {
        //判断要遍历的是否为文件夹
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        //遍历文件夹
        File[] files = dir.listFiles();
        //判断文件夹是否为空
        if (files != null) {
            for (File file : files) {
                //判断file是否为要查找的文件,如果为文件夹则递归继续遍历
                if (file.isFile() && file.getName().contains(name)) {
                    System.out.println("找到了" + file.getAbsolutePath());
                } else {
                    searchFile(file, name);
                }
            }
        }
    }
}
