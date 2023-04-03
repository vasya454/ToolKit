public class Roulette implements IDistanceMeasure{
    @Override
    public double measureDistance(Object a, Object b) {
        System.out.println("Приложить рулекту к " + a +", дотянуть до объекта " + b);
        return 0;
    }
}
