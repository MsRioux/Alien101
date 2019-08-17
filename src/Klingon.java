public class Klingon extends Enemy
{
    boolean isFriendly = false;

    public Klingon(String name, String weapon, int lives, int health, boolean isFriendly)
    {
        super(name, weapon, lives, health);
        this.isFriendly = isFriendly;
    }//end full constructor with super

    @Override
    public String toString()
    {
        return "Klingon{" +
                "isFriendly=" + isFriendly +
                ", lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }// end toString
}//end class Klingon
