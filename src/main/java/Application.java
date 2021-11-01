public class Application {
    public static void main(String[] args) {

        Cat firstCat = new Cat("Murka",15);
        Cat secondCat = new Cat("Pushok",30);
        Cat thirdCat = new Cat("Leo",50);
        Cat fourthCat = new Cat("Barsik",70);
        Cat fifthCat = new Cat("Murzik",80);

        Plate firstPlate = new Plate(100);

        Cat[] cats = new Cat[] {firstCat, secondCat, thirdCat, fourthCat, fifthCat};

        for (int i = 0; i < cats.length; i ++) {
            firstPlate.info();
            cats[i].eat(firstPlate);
            System.out.println();
        }

        for (int i = 0; i < cats.length; i ++) {
            cats[i].printSatiety();
        }
        System.out.println();

        firstPlate.addEatInPlate(150);

        for (int i = 0; i < cats.length; i ++) {
            firstPlate.info();
            cats[i].eat(firstPlate);
            System.out.println();
        }
    }

}
