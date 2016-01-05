package fr.umlv.exo2;

public class Soldier implements Military {
    public enum SoldierKind {
      InfantryMan  (30, 3, 20,Army.EARTH),
      Medic        (0,  2, 10,Army.NONE),
      Marine       (30, 3, 20,Army.SEA),
      Aviator      (10, 3, 20,Army.SKY),
      FlameThrower (40, 2, 20,Army.EARTH),
      ;
      final int fire;
      final int speed;
      final int health;
      final Army army;

      private SoldierKind(int fire,int speed, int health, Army army){
        this.fire = fire;
        this.speed = speed;
        this.health = health;
        this.army = army;
      }
    }
    
    private final SoldierKind kind;
    private int health;
    
    public Soldier(SoldierKind kind){
      this.health = kind.health;  // implicit null check
      this.kind = kind;
    }
    
    @Override
    public int speed() {
      return kind.speed;
    }
    
    @Override
    public int health() {
      return health;
    }
    
    @Override
    public int fire() {
      return kind.fire;
    }

    @Override
    public Army getArmy() {
        return kind.army;
    }

    public SoldierKind kind() {
      return kind;
    }
    
    @Override
    public String toString() {
      return kind.name();
    }
  }