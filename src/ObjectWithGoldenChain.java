public class ObjectWithGoldenChain extends StandingDecor{
    public ObjectWithGoldenChain(IStand something) {
        super(something);
    }

    @Override
    public void stand() {
        something.stand();
        System.out.println("Златая цепь на "+something);
    }
}
