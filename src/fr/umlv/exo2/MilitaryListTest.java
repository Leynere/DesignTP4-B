package fr.umlv.exo2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Steeve Sivanantham
 */
public class MilitaryListTest {
    @Test
    public void test(){
        ArrayList<Soldier> soldiers= new ArrayList<>();
        soldiers.add(new Soldier(Soldier.SoldierKind.Aviator));
        soldiers.add(new Soldier(Soldier.SoldierKind.FlameThrower));

        ArrayList<Military> militaries = new ArrayList<>();
        militaries.add(new Soldier(Soldier.SoldierKind.Medic));
        militaries.add(new Soldier(Soldier.SoldierKind.InfantryMan));
        militaries.add( ArmyTruck.getArmyTruck(soldiers,Army.EARTH));

        int sumSpeed = militaries.stream().mapToInt(Military::speed).sum();
        int sumHealth = militaries.stream().mapToInt(Military::health).sum();
        int sumFire = militaries.stream().mapToInt(Military::fire).sum();

        Assert.assertEquals(sumSpeed,15);
        Assert.assertEquals(sumHealth,70);
        Assert.assertEquals(sumFire,70);
    }
}
