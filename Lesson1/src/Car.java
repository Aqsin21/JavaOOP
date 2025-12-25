public class Car {
    private   String brend;
    private   String color;
    private   String model;
    private  int year;
    private int speed=0;
    private boolean engineWorking = false;

    public Car(String brend, String color, String model, int year)
    {
        this.brend=brend;
        this.color=color;
        this.model=model;
        this.year=year;
    }
    public  String getBrend(){
        return  brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void startEngine(){
        if(!engineWorking){
            engineWorking=true;
            System.out.println(brend+model+"engine is starting");
        }
        else {
            System.out.println("Engine is working");
        }


    }
    public  void  stopEngine(){
        if(engineWorking){
            engineWorking=false;
            speed=0;
            System.out.println(brend + model+ "stoped");
        }
        else {
            System.out.println("Before start engine");
        }
    }
    public  void increaseSpeed(int increase){
        if(engineWorking){
            speed +=increase;
            System.out.println(brend +speed+ "speed increased");
        }
        else
        {
            System.out.println("Before start engine");
        }
    }
    public void decreaseSpeed(int decrease){
        if(engineWorking){
            speed-=decrease;
            System.out.println(brend+speed+"speed decreased");
        }
        else{
            System.out.println("Before start Engine");
        }
    }


    public void showInfo() {
        System.out.println("=== Car Information ===");
        System.out.println("Brend  : " + brend);
        System.out.println("Model   : " + model);
        System.out.println("Color    : " + color);
        System.out.println("Year     : " + year);
        System.out.println("Hız     : " + speed + " km/s");
        System.out.println("Motor   : " + (engineWorking ? "Çalışıyor" : "Kapalı"));
        System.out.println("-----------------------");
    }
}
