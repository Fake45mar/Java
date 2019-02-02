public class Artifact {
    private int century, number;
    private String peoples, centuryDoesnttExist;
    public Artifact(int number){
        this.number = number;
        this.peoples = "Info doesn't exist";
        this.centuryDoesnttExist = "Century info doesn't exist";
    }
    public Artifact(int number, int century){
        this.number = number;
        this.century = century;
        this.peoples = "Info doesn't exist";
    }
    public Artifact(int number, int century, String peoples){
        this.number = number;
        this.century = century;
        this.peoples = peoples;
    }
    public Artifact(int number, String peoples){
        this.number = number;
        this.peoples = peoples;
        this.centuryDoesnttExist = "Century info doesn't exist";
    }
    public void getInfo(){
        System.out.println("The number is - " + this.number);
        System.out.println("The peoples is - " + this.peoples);
        if(century != 0)
            System.out.println("The century is - " + this.century);
        else
            System.out.println("The century is - " + this.centuryDoesnttExist);
        System.out.println("");
        System.out.println("");
    }
}
