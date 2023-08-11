import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IStand> items = new ArrayList<>();
        items.add(new Spruce());
        items.add(new Oak());
        items.add(new Car());
        items.add(new Spruce());
        items.add(new Pillar());

        IStand christmasTree1 = new ObjectWithGarland(items.get(0));
        items.set(0, christmasTree1);
        printSnadingItems(items);
        IStand christmasCar = new ObjectWithGarland(items.get(2));
        items.set(2, christmasCar);
        printSnadingItems(items);

        IStand fruitOak = new ObjectWithFruits(items.get(1));
        items.set(1, fruitOak);
        printSnadingItems(items);
        IStand fruitChristmasCar = new ObjectWithFruits(items.get(2));
        items.set(2, fruitChristmasCar);
        printSnadingItems(items);

        items.set(1, new ObjectWithGoldenChain(items.get(1)));
        items.set(4, new ObjectWithGoldenChain(items.get(4)));
        printSnadingItems(items);
    }

    static void printSnadingItems(ArrayList<IStand> items)
    {
        System.out.println("--------------------------------");
        int i=0;
        for (IStand item: items    ) {
            System.out.println(" "+i);
            item.stand();
            i++;
        }
        System.out.println("=================================");
    }
}