package charactor;

public class ADAPHero extends Hero implements AD,AP {
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
