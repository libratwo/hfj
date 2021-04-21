public class Duck {
    int size;

    public Duck() {
        System.out.println("Quack");
    }

    public void setSize(int size) {
        this.size = size;
    }
}

/**
 * UseADuck
 */
class UseADuck {

    public static void main(String[] args) {
        Duck d = new Duck();

        d.setSize(42);
    }
}
