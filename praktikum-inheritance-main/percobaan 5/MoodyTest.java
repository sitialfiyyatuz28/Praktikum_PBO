public class MoodyTest {
    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        //test parent class
        m.speak();
        
        //test inheritance class
        m = new HappyObject();
        m.speak();
        m.laugh();
        
        // test inheritance class
        m = new SadObject();
        m.speak();
        m.cry();
    }
}
