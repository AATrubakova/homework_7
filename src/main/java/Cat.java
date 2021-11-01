public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate myPlate) {
        if (this.satiety == true) {
            System.out.println("Кот " + this.name + " уже сыт");
        } else if (myPlate.decreaseFood(appetite) == true) {
            System.out.println("Кот " + this.name + " поел, он сыт");
            this.satiety = true;
        } else {
            System.out.println("Еды в тарелке меньше, чем требуется, кот " + this.name + " голодный");
        }
    }

    public void printSatiety() {
        if (this.satiety == true) {
            System.out.println("Кот " + this.name + " сыт");
        } else {
            System.out.println("Кот " + this.name + " голоден");
        }
    }
}
