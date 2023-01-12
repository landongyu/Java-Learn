package property;

public class Item {
    String name;
    int price;
    public void buy() {
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用过，可以有效果");
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
        LifePotion ip = new LifePotion();
        ip.effect();
        MagicPotion mp = new MagicPotion();
        mp.effect();
    }
}
