package being;

public class Human extends Being implements Move,Fly{

  private String name;
  private int height;

    public Human(String name, int height) {
        this.name = name;
        this.height = height;
    }
  
  
    
  
  @Override
  public void walk() {
      System.out.println("Un humano esta caminando erguido");
  }
  
  @Override
  public void fly() {
      System.out.println("Un humano esta volando como Goku");
  }
  
  @Override
  public void run(){
      System.out.println("Un humano esta corriendo como Naruto");
  }

    @Override
    public void crawl() {
        System.out.println("Un humano emepezo a gatear");
    }
  
}
