package leetcode.thread;

public class TestSleep {
    public void test() {
        Thread thread = new Thread(new Task());
        System.out.println(Thread.currentThread().getName() + "開始執行!" + " 優先級為" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        thread.start();
        // try {
        // thread.join();
        // } catch (InterruptedException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        try {
            System.out.println(Thread.currentThread().getName() + " finished waiting for download task");

            Thread.sleep(100);
            System.out.println();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println(Thread.currentThread().getName() + "結束執行!" + " 優先級為" + Thread.currentThread().getPriority());

    }

}
