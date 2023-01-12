package character;

public class ADHero extends Hero implements AD,Mortal {
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public void die() {
        System.out.println(name+"死亡");
    }

    //隐藏父类的battleWin方法
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String[] args) {
//        Hero.battleWin();
//        ADHero.battleWin();
    }
}
