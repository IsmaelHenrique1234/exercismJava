
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[7];
        lastWeek = birdsPerDay;
        return lastWeek;
    }

    public int getToday() {
        int today = birdsPerDay[6];
        return today;
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay)
            if (i == 0)
                return true;
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int max = 0;
        for (int i = 0; i < numberOfDays && i < 7; i++) {
            max += birdsPerDay[i];
        }
        return max;
    }
    public int getBusyDays() {
        int busy = 0;
        for (int i : birdsPerDay)
            if (i > 4)
                busy++;
        return busy;
    }
        
}
