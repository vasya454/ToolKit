public class Main {
    public static void main(String[] args) {
//        example1();
//        example2();
        example3();
    }

    private static void example3() {
        Table tab1 = new Table("Кофейный столик");
        Table tab2 = new Table("Рабочий стол");
        IDistanceMeasure meter = new IDistanceMeasure() {
            @Override
            public double measureDistance(Object a, Object b) {
                System.out.println("Шагаем от " + a + " до " + b + " и умножаем количество шагов на длину шага");
                return 0;
            }
        };
        System.out.println(meter.measureDistance(tab1,tab2));

        System.out.println(new IDistanceMeasure() {
            @Override
            public double measureDistance(Object a, Object b) {
                System.out.println("Шагаем от " + a + " до " + b + " и умножаем количество шагов на длину шага");
                return 0;
            }
        }.measureDistance(tab1,tab2));

        System.out.println(((IDistanceMeasure) (a, b) -> {
            System.out.println("Шагаем от " + a + " до " + b + " и умножаем количество шагов на длину шага");
            return 0;
        }).measureDistance(tab1,tab2));

        IDistanceMeasure izm = (a, b) -> {
            System.out.println("Шагаем от " + a + " до " + b + " и умножаем количество шагов на длину шага");
            return 0;
        };
        System.out.println(izm.measureDistance(tab1,tab2));
    }

    private static void example2() {
        Table tab1 = new Table("Кофейный столик");
        Table tab2 = new Table("Рабочий стол");

        class Ruler implements IDistanceMeasure {

            @Override
            public double measureDistance(Object a, Object b) {
                System.out.println("Прикладываем линейку между " + a + " и " + b);
                return 0;
            }
        }
        Ruler r = new Ruler();
        System.out.println(r.measureDistance(tab1, tab2));
    }

    private static void example1() {
        Table tab1 = new Table("Кофейный столик");
        Table tab2 = new Table("Рабочий стол");
        Roulette rul = new Roulette();
        double d = rul.measureDistance(tab1, tab2);
        System.out.println(d);
        Radar r1 = new Radar();
        System.out.println(r1.measureDistance(tab1, tab2));
        System.out.println(new RangeMeter().measureDistance(tab1, tab2));
    }
}

class Table {
    String name;

    public Table(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return '{' + name + '}';
    }
}