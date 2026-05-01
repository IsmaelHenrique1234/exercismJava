public class JedliksToyCar {
    private int meters = 0;
    private int percentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        return percentage > 0 ? "Battery at " + percentage + "%" : "Battery empty";
    }

    public void drive() {
        if (percentage > 0) {
            meters += 20;
            percentage -= 1;
        }
    }
}
