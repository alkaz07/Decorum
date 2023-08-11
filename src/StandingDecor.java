public abstract class StandingDecor implements IStand{
    protected IStand something;

    public StandingDecor(IStand something) {
        this.something = something;
    }
}
