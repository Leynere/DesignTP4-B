package fr.umlv.exo2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Steeve Sivanantham
 */
public class ArmyTruckTest {

    @Test
    public void test(){
        ArrayList<Soldier> soldiers= new ArrayList<>();
        soldiers.add(new Soldier(Soldier.SoldierKind.Medic));
        soldiers.add(new Soldier(Soldier.SoldierKind.InfantryMan));
        soldiers.add(new Soldier(Soldier.SoldierKind.Aviator));
        soldiers.add(new Soldier(Soldier.SoldierKind.FlameThrower));

        ArmyTruck truck = ArmyTruck.getArmyTruck(soldiers,Army.EARTH);

        Assert.assertEquals(truck.health(),70);
        Assert.assertEquals(truck.fire(),70);
        Assert.assertEquals(truck.speed(),10);

    }
}
