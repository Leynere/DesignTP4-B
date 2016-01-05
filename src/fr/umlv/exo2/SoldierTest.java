package fr.umlv.exo2;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Steeve Sivanantham
 */
public class SoldierTest {

    @Test
    public void test(){
        Soldier medic = new Soldier(Soldier.SoldierKind.Medic);
        Soldier infantryMan = new Soldier(Soldier.SoldierKind.InfantryMan);
        Soldier aviator = new Soldier(Soldier.SoldierKind.Aviator);
        Soldier flameThrower = new Soldier(Soldier.SoldierKind.FlameThrower);

        Assert.assertEquals(medic.speed()+infantryMan.speed()+aviator.speed()+flameThrower.speed(),10);
        Assert.assertEquals(medic.health()+infantryMan.health()+aviator.health()+flameThrower.health(),70);
        Assert.assertEquals(medic.fire()+infantryMan.fire()+aviator.fire()+flameThrower.fire(),80);
    }

}
