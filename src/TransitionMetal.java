public class TransitionMetal extends Element {
    public TransitionMetal(int atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
        super(atomic_numbers, element_symbol, element_name, atomic_weight, melting_point, boiling_point);
    }


    public static class Titanium extends TransitionMetal {
        /*public Titanium(double atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
            super(22,"Ti","Titanium",47.9 , 1668, 3287);
        }*/
        public Titanium() {
            super(22, "Ti", "Titanium", 47.9, 1668, 3287);
        }
    }

    public static class Gold extends TransitionMetal implements Conductive {
        /*public Gold(double atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
            super(79,"Au","Gold",197, 1064, 2970);
        }*/
        public Gold() {
            super(79, "Au", "Gold", 197, 1064, 2970);
        }


        @Override
        public double percent_conductive() {
            return 0.7;
        }


        @Override
        public void conductivity() {
            System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + " conductivity is " + (percent_conductive()) * 100 + "% ");
        }
    }

    public static class Zinc extends TransitionMetal implements Conductive {
        /*public Zinc(double atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
            super(30,"Zn","Zinc",65.4, 419.5, 907.0);
        }*/

        public Zinc() {
            super(30, "Zn", "Zinc", 65.4, 419.5, 907.0);
        }

        @Override
        public double percent_conductive() {
            return 0.27;
        }

        @Override
        public void conductivity() {
            System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + " conductivity is " + (percent_conductive()) * 100 + "% ");
        }
    }

    public static class Iron extends TransitionMetal implements Magnetic {
        /*public Iron(double atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
            super(26,"Fe","Iron",55.8, 1538, 2862);
        }*/
        public void magnetize() {
            System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + " is " + magnetic_type() + " with strength of " + magnetic_strength());
        }

        public Iron() {
            super(26, "Fe", "Iron", 55.8, 1538, 2862);
        }

        @Override
        public int magnetic_strength() {
            return 1710;
        }

        @Override
        public String magnetic_type() {
            return "ferromagnetic";
        }
    }

    public static class Copper extends TransitionMetal implements Conductive {
        /*public Copper(double atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
            super(29,"Cu","Copper",63.5, 1085, 2562);
        }*/

        public Copper() {
            super(29, "Cu", "Copper", 63.5, 1085, 2562);
        }

        @Override
        public double percent_conductive() {
            return 1.0;
        }

        @Override
        public void conductivity() {
            System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + " conductivity is " + (percent_conductive()) * 100 + "% ");
        }
    }

    public static class Technetium extends TransitionMetal implements Conductive, Magnetic, Radioactive {
        /*public Technetium(double atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
            super(43,"Tc","Technetium",98, 2157, 4265);
        }*/

        public Technetium() {
            super(43, "Tc", "Technetium", 98, 2157, 4265);
        }

        @Override
        public double percent_conductive() {
            return 0.65;
        }

        @Override
        public int magnetic_strength() {
            return 270;
        }

        @Override
        public String magnetic_type() {
            return "paramagnetic";
        }

        public void magnetize() {
            System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + " is " + magnetic_type() + " with strength of " + magnetic_strength());
        }

        @Override
        public int half_life() {
            return 61;
        }

        @Override
        public void radiate() {
            System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + " emitting radiation");
            System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + "'s half-life: " + half_life());
        }

        @Override
        public void conductivity() {
            System.out.println(this.atomic_numbers + " " + this.element_name + " (" + this.getElement_symbol() + ")" + " conductivity is " + (percent_conductive()) * 100 + "% ");
        }
    }
}
