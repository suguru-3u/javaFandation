public class Main3{
  public static void main(String[] args){
    // 勇者を生成
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者"+h.name+"を生み出しました!");

    // お化けキノコを生成
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    // 冒険の始まり
    h.slip();
    m1.run();
    m2.run();
    h.run();
    // 勇者よ戦え
    // お化けキノコ逃げろ
  }
}
