package FebStudy.threadStudy;

public class ThreadTest2 {
    public static void main(String[] args) {
        /*Runnable target = new MyRunnable();
        new Thread(target).start();*/


        //new Thread(new MyRunnable()).start();


        //匿名内部类写法


        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程1输出了：" + i);
                }
            }
        };
        new Thread(target).start();


        //简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2输出了：" + i);
                }
            }
        }).start();


        //lambda表达式
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程2输出了：" + i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出了：" + i);
        }
    }
}
