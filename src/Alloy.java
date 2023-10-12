import java.text.DecimalFormat;

public class Alloy {
    String name;
    String Element1;
    String Element2;

    public Alloy(String name, String element1, String element2) {

        this.name = name;
        Element1 = element1;
        Element2 = element2;

    }

    public static class Steel extends Alloy implements Magnetic{
        /*public Steel(String name, String element1, String element2) {
            super("Steel", "Iron", "Copper");
        }*/
        public Steel(){
            super("Steel", "Iron", "Copper");
        }

        @Override
        public int magnetic_strength() {
            return 1950;
        }

        public void magnetize(){
            System.out.println(name+" is "+magnetic_type()+" with strength of "+magnetic_strength());
        }

        @Override
        public String magnetic_type() {
            return "ferromagnetic";
        }
    }

    public static class Bronze extends Alloy{
        /*public Bronze(String name, String element1, String element2) {
            super("Bronze", "Tin", "Copper");
        }*/
        public Bronze(){
            super("Bronze", "Tin", "Copper");
        }
    }


    public static class Brass extends Alloy implements Conductive{
        /*public Brass(String name, String element1, String element2) {
            super("Brass", "Copper", "Zinc");
        }*/
        @Override
        public void conductivity() {
            //System.out.println(name+" conductivity is "+((percent_conductive())*100)+"% ");
            System.out.printf("%s conductivity is %.1f%%\n", name, ((percent_conductive())*100));
        }

        public Brass(){
            super("Brass", "Copper", "Zinc");
        }

        @Override
        public double percent_conductive() {
            return 0.28;
        }
    }

    public String getName() {
        return name+" consists of "+getElement1()+", "+getElement2();
    }

    public String getElement1() {
        return Element1;
    }

    public String getElement2() {
        return Element2;
    }
}