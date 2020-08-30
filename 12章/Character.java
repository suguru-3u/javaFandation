public abstract class Character{
  String name;
  int hp;
  public void run(){
    System.out.println("逃げろ~");
  }
  public abstract void attack(Matango m);
}
