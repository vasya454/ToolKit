public class RangeMeter implements IDistanceMeasure{
    @Override
    public double measureDistance(Object a, Object b) {
        System.out.println("Встать около объекта "+ a +", направить на объект " + b);
        return 0;
    }
}
