package FebStudy.threadStudy;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程MyThread输出：" + i);
        }
    }
}
