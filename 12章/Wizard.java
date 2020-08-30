public class Wizard extends Character{
  int mp;
  public void attack(Matango m){
    System.out.println(this.name + "の攻撃！");
    m.hp -= 6;
  }
  public void fireball(Matango m){
    System.out.println(this.name + "は火の玉を放った！");
    m.hp -= 20;
    this.mp -= 5;
  }
}
