package test1_important;

public class ThreadB extends Thread{
    private Service service;
    private MyObject object;

    public ThreadB(Service service, MyObject object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
