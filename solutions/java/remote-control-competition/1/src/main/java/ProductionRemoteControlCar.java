class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;
    private int numberOfVictories;

    public ProductionRemoteControlCar() {
    }

    public ProductionRemoteControlCar(int distanceTravelled, int NumberOfVictories) {
        this.distanceTravelled = distanceTravelled;
        this.numberOfVictories = numberOfVictories;
    }

    public void drive() {
        this.distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    
    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(this.numberOfVictories, other.numberOfVictories);
    }
}
