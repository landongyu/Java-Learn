package character;

public interface AD {
    public void physicAttack();
}

class ADHero extends Hero implements AD{
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
