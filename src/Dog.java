public class Dog extends Animal{ // Animal is the super class of the subclass Dog.

    private String earShape;
    private String tailShape;

    public Dog() {
        super("St. Bernard", "Giant", 145);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Droopy", "fluffy");
    }

    public Dog(String type, double weight,
               String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


    @Override
    public void makeNoise(){ //

        if (type == "Wolf") {
            System.out.print("Ow Woooo! ");
        }
        bark();
        System.out.println();
    };

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");

        if(speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();

    }

    private void bark() {
        System.out.print("Woof!");
    }
    private void run() {
        System.out.print("Dog Running ");
    }

    private void walk() {
        System.out.print("Dog Walking ");
    }
    private void wagTail() {
        System.out.print("Tail Wagging!");
    }


}
