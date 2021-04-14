class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) { // x必定自增, 否则此处会一直进入
                System.out.print(" ");
            }
            System.out.print("n");

            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1; // 循环控制次数, 根据换行次数确定
        }
    }
}