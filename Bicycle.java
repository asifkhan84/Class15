public class Bicycle {
    private int speed = 0;
    private String color;
    private int maxSpeed = 0;

    public Bicycle(){
        setSpeed(0);
        setColor("White");
        setMaxSpeed(25);
    }
    public Bicycle(int speed,String color,int maxSpeed){
        setSpeed(speed);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public void setSpeed(int speed){
        if(speed<this.maxSpeed){
            this.speed = speed;
        }
        else
            this.speed=this.maxSpeed;
    }

    public void setColor(String color){
        this. color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(int amount){
        this.speed  = this.speed + amount;
        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    public void brake(int amount){
        this.speed = this.speed - amount;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public String toString(){
        return("Color: " + this.color + "\nCurrent speed: " + this.speed + "\nMax speed: " + this.maxSpeed + "\n" );
    }
}
