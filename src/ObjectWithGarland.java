public class ObjectWithGarland extends StandingDecor{
    public ObjectWithGarland(IStand something) {
        super(something);
    }

    @Override
    public void stand() {
        System.out.println("гирлянда весело мигает ");
        something.stand();
    }
}
