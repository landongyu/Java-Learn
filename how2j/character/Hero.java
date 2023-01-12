package character;
import property.Item;

public class Hero {
    public String name;
    protected float hp; //血量

    float armor; //护甲
    int moveSpeed; //移动速度

//    public void kill(Mortal m) {
//        m.die();
//    }
//
//    public static void battleWin(){
//        System.out.println("hero battle win");
//    }

    public void useItem(Item i) {
        System.out.println("hero use item");
        i.effect();
    }
    public Hero(){
        System.out.println("Hero的构造方法 ");
    }

    public static void main(String[] args) {
//        Hero h =new Hero();
//        h.name = "盖伦";
//
//        ADHero ad = new ADHero();
//        ad.name = "艾希";
//
//        APHero ap = new APHero();
//        ap.name = "安妮";
//
//        ADAPHero adap = new ADAPHero();
//        adap.name = "库奇";
//
//        h.kill(ad);
//        h.kill(ap);
//        h.kill(adap);
//        ad.kill(ap);
        new Hero();
    }
}
