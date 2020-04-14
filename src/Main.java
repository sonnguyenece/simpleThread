public class Main {
    public static void main(String[] args) {
        NumberGenerator thread1 = new NumberGenerator("A : ");
        NumberGenerator thread2 = new NumberGenerator("B : ");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
