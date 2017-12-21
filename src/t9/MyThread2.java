package t9;

public class MyThread2 extends Thread {
    private MyOneList list;
    public MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        MyService msRef = new MyService();
        msRef.addServiceMethod(list,"B");
    }
}
