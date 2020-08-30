public class Main{
  public static void main(String[] args){
    SuperHero sh = new SuperHero();
    sh.run();
    PoisonMatango pm = new PoisonMatango('A');
    pm.attack(sh);
  }
}
