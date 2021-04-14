class DVDPlayer {
    private static final String DVD_PLAYING = "DVD playing";
    private static final String DVD_RECORDING = "DVD recording";
    boolean canRecord = false;

    void recordDVD() {
        System.out.println(DVD_RECORDING);
    }

    void playDVD() {
        System.out.println(DVD_PLAYING);
    }
}

class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}