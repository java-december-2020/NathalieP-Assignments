import java.util.*;
public class Project{

    private String name;
    private String description;
    private String lead;
    private Double initialCost;

    public Project(String name, String description){
        this.name= name;
        this.description= description;
    }      
    public Project() {
        this.lead= "Nathalie";
    }
    public Project(String name) {
        this.name= name;
    }
    public Project(Double initialCost){
        this.initialCost=initialCost;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getLead(){
        return this.lead;
    }
 
    public void setName(String name){
        this.name= name;
    }
    public void setDescription(String description){
        this.description= description;
    }
    public void setLead(String owner){
        this.lead= lead;
    }
    public Double getInitialCost(){
        return this.initialCost;
    }
    public void setInitialCost(Double initialCost){
        this.initialCost= initialCost;

    }
}