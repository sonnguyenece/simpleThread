public class NumberGenerator extends Thread {

    NumberGenerator(String name){
        this.setName(name);
    }

    @Override
    public synchronized void run() {
       for (int i=1;i<=10;i++){
           System.out.println(this.hashCode() +" "+i);
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
