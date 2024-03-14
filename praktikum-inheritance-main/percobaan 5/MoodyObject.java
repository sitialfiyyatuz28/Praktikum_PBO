public class MoodyObject {
    protected String getMood (){
        return "moody";
    }
    public void speak(){
        System.out.println("I am " + getMood());
    }
    void laugh(){}
    void cry (){}
}
