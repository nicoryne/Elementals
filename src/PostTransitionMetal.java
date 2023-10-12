public class PostTransitionMetal extends Element{

    public PostTransitionMetal(int atomic_numbers, String element_symbol, String element_name, double atomic_weight, double melting_point, double boiling_point) {
        super(atomic_numbers, element_symbol, element_name, atomic_weight, melting_point, boiling_point);
    }

    public static class Tin extends PostTransitionMetal{
        public Tin(){
            super(50, "Sn", "Tin",118.7, 231.9, 2602);
        }


    }

    public static class Aluminum extends PostTransitionMetal implements Conductive{
        public Aluminum(){
            super(13, "Al","Aluminum",27, 660.3, 2470);
        }

        @Override
        public void conductivity() {
            System.out.println(this.atomic_numbers+" "+this.element_name+" ("+this.getElement_symbol()+")"+" conductivity is "+(percent_conductive())*100+"% ");
        }
        @Override
        public double percent_conductive() {
            return 0.61;
        }
    }

}