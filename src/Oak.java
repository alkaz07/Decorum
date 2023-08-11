public class Oak implements IStand{
    @Override
    public void stand() {
        System.out.println("У Лукоморья дуб зеленый");
    }

    @Override
    public String toString() {
        return "Дуб";
    }
}
