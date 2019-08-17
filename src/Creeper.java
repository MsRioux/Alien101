public class Creeper extends Enemy
{
    boolean isAgressive = true;

    public Creeper(String name, String weapon, int lives, int health, boolean isAgressive)
    {
        super(name, weapon, lives, health);
        this.isAgressive = isAgressive;
    }//end full constructor with  call to super

    @Override
    public void Attack(int damage)
    {
        if(isAgressive)
            health -= damage;
        else
            System.out.println("Your cat saved you");
    }//end Overridden Attack method

    @Override
    public String toString()
    {
        return "Creeper{" +
                "isAgressive=" + isAgressive +
                ", lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }// end toString
}//end Creeper class
