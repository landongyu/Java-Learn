package character;

public interface AP {
    public void magicAttack();


}
class APHero extends Hero implements AP{
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}