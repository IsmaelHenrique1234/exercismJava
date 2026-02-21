public class CarsAssemble {
    
    private final int CAR_PER_HOUR = 221;
    
    public double successRate(int speed) {
        if (speed < 5) {
            return 1;
        }
        else if (speed < 9) {
            return 0.9;
        }
        else if (speed == 9) {
            return 0.8;
        }
        else {
            return 0.77;
        } 
    }
    
    public double productionRatePerHour(int speed) {
        return speed * CAR_PER_HOUR * successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

}
