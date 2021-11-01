public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (appetite <= this.food) {
            this.food -= appetite;
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("В тарелке: " + food);
    }

    public void addEatInPlate(int food) {
        this.food += food;

    }

}
