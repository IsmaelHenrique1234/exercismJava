public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        
        double cars = 221;
        
        if (speed < 5) {
            return speed * cars;
        }
        else if (speed < 9) {
            return speed * (cars * 0.9);
        }
        else if (speed == 9) {
            return speed * (cars * 0.8);
        }
        else {
            return speed * (cars * 0.77);
        } 
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
