import java.time.LocalDate;

class Principal{
  public static void main(String[] args) {
    mostrarFecha();
  }

  public static void mostrarFecha(){
    LocalDate fecha = LocalDate.now();
    System.out.println("Fecha actual: "+fecha);
  }
}
