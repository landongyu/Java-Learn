package character;

public class Hero {
    public String name;
    protected float hp; //血量

    float armor; //护甲
    int moveSpeed; //移动速度

    public static void main(String[] args) {
        ADHero ad = new ADHero();
        Hero h = ad;
        AD adi = (AD) h;
        //APHero ap = (APHero) adi;
    }
}
