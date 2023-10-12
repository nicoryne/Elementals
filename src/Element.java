// Also put Actinide and Uranium as inner class here
import java.util.Comparator;
public class Element {
    int atomic_numbers;
    String element_symbol;
    String element_name;
    double atomic_weight;

    double boiling_point;
    double melting_point;

    int state;

    public Element(int atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
        this.atomic_numbers = atomic_numbers;
        this.element_symbol = element_symbol;
        this.element_name = element_name;
        this.atomic_weight = atomic_weight;
        this.boiling_point = boiling_point;
        this.melting_point = melting_point;
    }

    public static class WeightComparator implements Comparator<Element> {

        @Override
        public int compare(Element o1, Element o2) {
            if (o1.atomic_weight < o2.atomic_weight) {
                return -1;
            }
            if (o1.atomic_weight == o2.atomic_weight) {
                return 0;
            }
            return 1;
        }
    }

    public int getState(double temp) {
        if (temp < getMelting_point()) {
            return 1;
        }

        if (temp > getMelting_point() && temp < getBoiling_point()) {
            return 0;
        }

        return -1;
    }

    public double getAtomic_numbers() {
        return atomic_numbers;
    }

    public String getElement_symbol() {
        return element_symbol;
    }

    public String getElement_name() {
        return element_name;
    }

    public double getAtomic_weight() {
        return atomic_weight;
    }

    public double getBoiling_point() {
        return boiling_point;
    }

    public double getMelting_point() {
        return melting_point;
    }


    public static class Actinide extends Element implements Radioactive {
        public Actinide(int atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
            super(atomic_numbers, element_symbol, element_name, atomic_weight, melting_point, boiling_point);
        }

        @Override
        public int half_life() {
            return 0;
        }

        @Override
        public void radiate() {
            System.out.println(this.atomic_numbers + " " + this.element_name + " emitting radiation");
            System.out.println(this.atomic_numbers + " " + this.element_name + "'s half-life: " + half_life());
        }


        public static class Uranium extends Actinide {
            /*public Uranium(double atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
                super(92, "U", "Uranium",238, 1132.2, 4131);
            }*/
            public Uranium() {
                super(92, "U", "Uranium", 238, 1132.2, 4131);
            }

            @Override
            public int half_life() {
                return 25166;
            }

            @Override
            public void radiate() {
                System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + " emitting radiation");
                System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + "'s half-life: " + half_life());
            }


        }
    }
}

