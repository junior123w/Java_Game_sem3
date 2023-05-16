package wk2;

public abstract class Player {
    private String name;
    private double attack,health;

    public Player(String name, double attack, double health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.length()<3)
            throw new IllegalArgumentException("Name must be less than 3 characters");
        this.name=name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        if(attack<3 || attack>10)
            throw new IllegalArgumentException("Attack must be between 3 and 10");
        this.attack = attack;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if(health<20 || health>50)
            throw new IllegalArgumentException("Health must be between 20 and 50");
        this.health = health;
    }
    public abstract void useSuperPower();

    public void decreaseHealth(double value){
        health-=value;
    }
    public void increaseAttack(double value){
        attack+=value;
    }
}
