public class Main extends Thread{
    static Philosopher[] philosophers = new Philosopher[5];
    static Chopstick[] chopsticks = new Chopstick[5];

    public static void main(String[] args) {
        //initialize the philosophers and chopsticks
        for (int i = 0; i < 5; i++) {
            chopsticks[i] = new Chopstick(i);
            philosophers[i] = new Philosopher(i);
            philosophers[i].start(); //start all threads
        }

    }
}

class Philosopher extends Thread{
    int id;

    Philosopher(int id){
        this.id = id;
    }
    public void run(){
        try {
            sleep(3000);
            System.out.println("testing from " + id);
            sleep(1000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Chopstick{
    int id;
    boolean inUse;

    Chopstick(int id){
        this.id = id;
    }
    public synchronized void pickUp(){
        /*while inUse
            wait

         otherwise take it
         inUse = true
        */
    }
    public synchronized void drop(){

    }
}