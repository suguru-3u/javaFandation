public class Matango{
  int hp;
  final int LEVEL = 10;
  char suffix;
  public Matango(char suffix){
    this.suffix = suffix;
    this.hp = 100;
  }

  public void attack(Hero h){
    System.out.println("キノコ" + this.suffix + "の攻撃");
    System.out.println("10のダメージ");
    h.hp -= 10;
  }
  // メゾット
  public void run(){
    System.out.println("お化けキノコ"+this.suffix+"は逃げ出した！");
  }
}
