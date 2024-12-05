package przykład1;

import java.time.Year;

public abstract class WorkTool {
    String name;
    int productionYear;

    public WorkTool(){
        this.name="Narzędzie";
        this.productionYear=Year.now().getValue();
    }
    public WorkTool(String name, int productionYear){
        this.name = name;
        if(productionYear> Year.now().getValue()){
            this.productionYear=Year.now().getValue();
        }
        else{
            this.productionYear=productionYear;
        }
    }
    public abstract void use();//{
        //System.out.println("Użyto narzędzia");


}
