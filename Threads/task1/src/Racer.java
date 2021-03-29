public class Racer implements Runnable/* TODO
Add something here so that you can pass this Racer to the constructor of Thread*/{
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    public Racer(Car c){
        this.c = c;
    }
    /* TODO 
Create a constructor that receives a Car objec and initializes c.*/
    @Override

    public void run() {
        do{
            if (c.miles==0){
                System.out.print(c);
                System.out.println("Charging");
                c.charge();
                try {
                    Thread.sleep((int) c.miles);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            } else {
                c.move(1);
            }
        }
        while (c.odometer<distance);

        System.out.println("Finish:"+c);
    }

    /* TODO 
Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
}
