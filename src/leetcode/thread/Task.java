package leetcode.thread;

public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println(
                Thread.currentThread().getName() + ":跑起來了!!!" + " 優先級為" + Thread.currentThread().getPriority());
        try {
            Thread.sleep(200);
            System.out.println(
                    Thread.currentThread().getName() + ":睡覺完要關閉了" + " 優先級為" + Thread.currentThread().getPriority());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("your thread is interrupted");
            e.printStackTrace();
        }

    }

}
