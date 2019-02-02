public class newRelationShips {
    private String name, sex, ageDoesntWrote;
    int age;
    public newRelationShips(String name){
        this.name = name;
        this.sex = "Sex is not switched";
        this.ageDoesntWrote = "Age is not touched";
    }
    public newRelationShips(String name, String sex){
        this.name = name;
        this.sex = sex;
        this.ageDoesntWrote = "Age is not touched";
    }
    public newRelationShips(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void getInfo(){
        System.out.println("The name is - " + this.name);
        System.out.println("The sex is - " + this.sex);
        if(age != 0)
            System.out.println("The age is - " + this.age);
        else
            System.out.println(ageDoesntWrote   );
    }
}
