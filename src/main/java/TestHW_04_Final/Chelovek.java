package TestHW_04_Final;

public abstract class Chelovek implements Random {
    private String name;
    private  int hp;
    protected int speed = random.nextInt(4, 12);
    public Chelovek(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }
    public void reduceHp(int demage) {
        hp -= demage;
        if (hp < 0) {
            hp = 0;
        }
    }

}
