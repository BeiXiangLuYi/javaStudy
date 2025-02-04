package FebStudy.threadStudy;

import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
        MyCallable call = new MyCallable(100);
        FutureTask<String> f1 = new FutureTask<>(call);
        new Thread(f1).start();
        System.out.println(f1.get());
    }
}
