public class Enemy implements Actor
{
    //instance variables
    int lives = 0, health = 0;
    String name, weapon;

    //constructors
    public Enemy()
    {
        name =  "bblob";
        weapon = "none";

    }//end default constructor

    public Enemy(String name, String weapon, int lives, int health)
    {
        this.name = name;
        this.weapon = weapon;
        this.lives = lives;
        this.health = health;
    }//end  5 arg constructor

    @Override
    public void Attack(int damage)
    {

    }//end Overridden Attack method

    @Override
    public String toString()
    {
        return "Enemy{" +
                "lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }//end toString
}//end Enemy class
