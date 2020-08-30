public class Dancer extends Character{
  public void dance(){
    System.out.println(this.name + "は情熱的に踊った");
  }
  public void attack((Matango m){
    System.out.println(this.name + "は攻撃した");
    m.hp -= 5;
  }
}
