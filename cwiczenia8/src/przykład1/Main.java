package przykład1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WorkTool lyzka = new WorkTool("łyżka", 1991) {
            @Override
            public void use() {
                System.out.println("Nałożono zupe na łyżke");
            }
        };
        //lyzka.use();
        //System.out.println(lyzka);
        WorkTool widelec = new WorkTool("Widelec", 2020) {
            @Override
            public void use() {
                System.out.println("Użyto widelca");
            }
        };
        //widelec.use();
        ArrayList<WorkTool> workTools = new ArrayList<>();
        workTools.add(new Hammer("Młotek", 2024));
        workTools.add(new Screwdriver("Śrubokręt krzyżak", 2022));
        workTools.add(new Screwdriver("Śrubokręt płaski", 2024));
        workTools.add(new Saw("Piła do metalu", 2024));
        workTools.add(new Saw("Piła do drewna", 2024));
        for (WorkTool wt : workTools){
            wt.use();
        }
    }
    WorkTool srubokret = new Screwdriver("Śrubokręt", 1995);

}
