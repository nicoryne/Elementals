import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        List<Alloy> alloys = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter element/alloy: ");
            input = sc.nextLine();
            switch (input) {
                case "Copper":
                    elements.add(new TransitionMetal.Copper());
                    break;
                case "Titanium":
                    elements.add(new TransitionMetal.Titanium());
                    break;
                case "Gold":
                    elements.add(new TransitionMetal.Gold());
                    break;
                case "Zinc":
                    elements.add(new TransitionMetal.Zinc());
                    break;
                case "Iron":
                    elements.add(new TransitionMetal.Iron());
                    break;
                case "Technetium":
                    elements.add(new TransitionMetal.Technetium());
                    break;
                case "Tin":
                    elements.add(new PostTransitionMetal.Tin());
                    break;
                case "Aluminum":
                    elements.add(new PostTransitionMetal.Aluminum());
                    break;
                case "Uranium":
                    elements.add(new Element.Actinide.Uranium());
                    break;
                case "Steel":
                    alloys.add(new Alloy.Steel());
                    break;
                case "Brass":
                    alloys.add(new Alloy.Brass());
                    break;
                case "Bronze":
                    alloys.add(new Alloy.Bronze());
                    break;
                // TODO add more cases here
            }
        } while (!input.equals("DONE"));

        do {
            System.out.print("Enter action: ");
            input = sc.nextLine();
            switch (input){
                case "Radiate":
                    // TODO Radiate here
                    int ctr1 = 0;
                    for(Element e : elements) {
                        if(e instanceof Radioactive) {
                            ctr1++;
                            ((Radioactive) e).radiate();
                        }
                    }
                    if(ctr1 == 0){
                        System.out.println("No radioactive materials present");
                    }
                    break;
                case "Magnetize":
                    int ctr2 = 0;
                    for(Element e : elements) {
                        if(e instanceof Magnetic) {
                            ctr2++;
                            ((Magnetic) e).magnetize();
                        }
                    }
                    for(Alloy a : alloys) {
                        if(a instanceof Alloy.Steel) {
                            ctr2++;
                            ((Alloy.Steel) a).magnetize();
                        }
                    }
                    if(ctr2 == 0){
                        System.out.println("No magnetic materials present");
                    }
                    break;
                case "Conduct":
                    int ctr3 = 0;
                    for(Element e : elements) {
                        if(e instanceof Conductive) {
                            ctr3++;
                            ((Conductive) e).conductivity();
                        }
                    }
                    for(Alloy a : alloys) {
                        if(a instanceof Conductive) {
                            ctr3++;
                            ((Conductive) a).conductivity();
                        }
                    }
                    if(ctr3 == 0) {
                        System.out.println("No conductive materials present");
                    }
                    break;
                case "Alloy Components":
                    int ctr4 = 0;
                    for(Alloy a : alloys) {
                        ctr4++;
                        System.out.println(a.getName());
                    }
                    if(ctr4 == 0) {
                        System.out.println("No alloys present");
                    }
                    break;
                case "Get State":
                    System.out.print("Enter temperature: ");
                    double temp = sc.nextDouble();
                    sc.nextLine(); // This is to clear the newline
                    // TODO print state of elements
                    for(Element e : elements) {
                        System.out.print(e.atomic_numbers + " " + e.element_name + " (" + e.element_symbol+") is ");
                        if(e.getState(temp) == 1) System.out.println("solid");
                        else if(e.getState(temp) == 0) System.out.println("liquid");
                        else System.out.println("gas");
                    }
                    break;
                case "Sort by Weight":
                    Collections.sort(elements, new Element.WeightComparator());
                    for (Element e : elements) {
                        System.out.println(e.atomic_numbers + " " + e.element_name + " (" + e.element_symbol + ")" + " = " + e.getAtomic_weight());
                    }
                    if (elements.isEmpty()) {
                        System.out.println("No elements present");
                    }
                    break;
            }
        } while (!input.equals("DONE"));
    }
}
