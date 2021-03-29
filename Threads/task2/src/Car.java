public class Car {
    public double miles;
    public double odometer;
    public String name;
    public double maxMiles;

    public Car(String name,double miles){
        this.miles = miles;
        odometer = 0;
        this.name = name;
        this.maxMiles = miles;
    }

    public void move(double miles){

        if(this.miles > 0){
            odometer += miles;
            this.miles = this.miles - miles;
        }

        /* TODO
move should subtract  'miles' from the miles left to travel and add 'miles' to the odometer. The miles to travel cannot be less than zero. */
    }

    public void charge(){
        this.miles = maxMiles;
    }

    public String toString(){
        return name+": odo:"+odometer+" - miles left:"+miles;
    }



 /* TODO 
Exact same methods and constructor as the Car in task 1*/
}
