import java.time.LocalDate;
import java.util.Scanner;

class Principal{
  public static void main(String[] args) {
    mostrarFecha();
    parImpar();
  }

  public static void mostrarFecha(){
    LocalDate fecha = LocalDate.now();
    System.out.println("Fecha actual: "+fecha);
  }

  public static void parImpar(){
    Scanner teclado = new Scanner(System.in);
    int numero = 0;

    System.out.print("Ingrese un numero entero: ");
    numero = (int)teclado.nextDouble();
    if(numero % 2 == 0){
      System.out.println("El numero "+numero+" es par");
    }else{
      System.out.println("El numero "+numero+" es impar");
    }
  }
}
