public class PoisonMatango extends Matango{
  int a = 5;

  public PoisonMatango(char suffix){
    super(suffix);
  }
  public void attack(Hero h){
    super.attack(h);
    if(a != 0){
      System.out.println("さらに毒の胞子をばらまいた");
      int b = h.hp / 5;
      System.out.println(b + "ポイントのダメージ");
      h.hp -= b;
      a -= 1;
    }
  }
}
