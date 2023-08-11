public class ObjectWithFruits extends StandingDecor{
    public ObjectWithFruits(IStand something) {
        super(something);
    }

    @Override
    public void stand() {
        System.out.println("Фрукты вкусно пахнут");
        this.something.stand();
    }


}
