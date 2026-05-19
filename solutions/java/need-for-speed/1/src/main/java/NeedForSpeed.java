class NeedForSpeed {
   public int speed;
   public int battery = 100;
   public int batteryDrain;
   public int meters;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
       return this.battery >= this.batteryDrain ? false:true;
    }

    public int distanceDriven() {
        return this.meters;
    }

    public void drive() {
        if (battery >= batteryDrain) {
            this.meters += speed;
            this.battery-=batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained())
            car.drive();
        return car.distanceDriven() >= this.distance ? true : false;
    }
}
