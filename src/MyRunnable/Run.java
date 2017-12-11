package MyRunnable;

public class Run {
    public static void main(String[] args)
    {
        MyRunnable runnable =new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
