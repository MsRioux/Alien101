public class Alien101Driver
{
    public static void main(String[] args)
    {
        Fighter joe = new Fighter("Captain", "Joe", "Spork", 28, 1000);
//        Enemy generic = new Enemy("generic", "floon", 356, 5 );
        Creeper creepie = new Creeper("Creepie", "TNT", 1, 20, true);
        Klingon worf = new Klingon("Worf", "Phaser", 1, 1000, true);
        Klingon burtog = new Klingon("Burtog", "bat'leth", 1, 1000, false);

//        System.out.println(joe);
////        System.out.println(generic);
        System.out.println(creepie);
//        System.out.println(worf);
//        System.out.println(burtog);

        creepie.Attack(10);
        System.out.println(creepie);
    }
}//end Driver class
