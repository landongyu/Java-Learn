package character;

public class Support extends Hero implements Healer{
    public void heal() {
        System.out.println(name+"加了一口血");
    }
}
