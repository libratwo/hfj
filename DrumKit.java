class DrumKit {
    boolean topHat = true;
    boolean snare  = true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

}
class DrumKitTestDrive {
    public static void main(String [] args) {
        DrumKit d = new DrumKit();
        if (d.snare == true) {
            d.playSnare();
        }
        if (d.topHat == true) {
            d.playTopHat();
        }
    }
}