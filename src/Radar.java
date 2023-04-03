public class Radar implements IDistanceMeasure{
    @Override
    public double measureDistance(Object a, Object b) {
        System.out.println("Если " + a + " или " + b + " отражает радиоволны, то всё получится, а иначе - нет");
        return 0;
    }
}
