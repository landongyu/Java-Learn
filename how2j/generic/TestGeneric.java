package generic;

import java.util.ArrayList;

import character.ADHero;
import character.APHero;
public class TestGeneric {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        heros.add(new APHero());
        heros.add(new ADHero());
        APHero apHero =  (APHero) heros.get(0);
        ADHero adHero =  (ADHero) heros.get(1);
        ADHero adHero2 =  (ADHero) heros.get(0);
    }
}
