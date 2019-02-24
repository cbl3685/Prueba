import java.lang.Math;

class Principal{
  public static void main(String[] args) {
    numeroRandom();
  }

  public static void numeroRandom(){
    int random = (int)(Math.random() * 10 + 1);
    System.out.println("Numero aleatorio: "+random);
  }
}
