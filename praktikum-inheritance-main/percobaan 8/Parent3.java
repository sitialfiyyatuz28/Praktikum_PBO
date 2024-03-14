public class Parent3 {
    String parentName;
    Parent3(){}
    
    Parent3(String parentName){
        this.parentName = parentName;
        System.out.println("Konstruktor parent");
    }
}

class Baby extends Parent3 {
    String babyName;
    
    Baby(String babyName){
        super();
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
    }
    
    public void cry(){
        System.out.println("Owek owek");
    }
}
