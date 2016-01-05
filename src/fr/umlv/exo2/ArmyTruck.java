package fr.umlv.exo2;

import java.util.List;
import java.util.Objects;

/**
 * @author Steeve Sivanantham
 */
public class ArmyTruck implements Military {
    private final Army army;
    private int fire;
    private final int speed = 10;
    private int health = 0;

    public static ArmyTruck getArmyTruck(List<Soldier> soldierList,Army army){
        Objects.requireNonNull(soldierList);
        Objects.requireNonNull(army);
        int health = soldierList.stream().mapToInt(Soldier::health).sum();
        int fire = soldierList.stream().mapToInt(soldier-> soldier.getArmy() == army? soldier.fire() : 0).sum();
        return new ArmyTruck(health,fire,army);
    }

    private ArmyTruck(int health,int fire,Army army){
        this.army = army;
        this.fire = fire;
        this.health = health;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public int health() {
        return this.health;
    }

    @Override
    public int fire() {
        return this.fire;
    }

    @Override
    public Army getArmy() {
        return army;
    }
}
