public class Hero{
  private int hp;
  private String name;
  Sword sword;

  void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は眠って回復しました！");
  }

  public void die(){
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVER");
  }
  public void attack(Matango m){
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5 ;
    System.out.println("５ポイントのダメージを与えた");
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
}
