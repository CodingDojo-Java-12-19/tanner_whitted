public class Project {
    private String name;
    private String description;
    private static String DefaultName = "Tanner";
    private static String DefaultDesc = "Red";

    public String getName() {return name;}
    public String getDesc() {return description;}

    public void setName(String name) {this.name = name;}
    public void setDesc(String description) {this.description = description;}

    public Project() {
        this.name = DefaultName;
        this.description = DefaultDesc;
    }
    public Project(String name) {
        this.name = name;
        this.description = DefaultDesc;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
}