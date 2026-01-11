class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return !archerIsAwake && (petDogIsPresent || (!knightIsAwake && prisonerIsAwake));
    }
    public static void main(String[] args) {
        AnnalynsInfiltration.canFastAttack(false);
        AnnalynsInfiltration.canSpy(false, true, false);
        AnnalynsInfiltration.canSignalPrisoner(false, true);
        AnnalynsInfiltration.canFreePrisoner(false, false, true, true);
    }
}
