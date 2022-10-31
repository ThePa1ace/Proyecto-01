public class Sensor{

  public static int tamano = 8;
  public static Sensor[] sensores = new Sensor[tamano];
  public static int posAnadir = 0;

  private String tipo;
  private double valor;


  public Sensor(String tipo, double valor) {
    this.tipo = tipo;
    this.valor = valor;
  }
  
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return this.tipo;
  }
  
  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return this.valor;
  }

  public static void agregar(Sensor n){
    sensores[posAnadir] = n;
    posAnadir ++;
  }

  public String toString() {
    return "El Sensor es tipo: " + this.tipo + "\n" + "Su valor es: " + this.valor + "\n\n";
  }

  public static String toStringSensores() {
    String salida = "";
    for (int x = 0; x < posAnadir; x++) {
      salida = salida + sensores[x].toString();
    }
    return salida;
  }

  public static String toStringTipo(Sensor[] temperatura) {
    String salida = "";
    for (int x = 0; x < posAnadir; x++) {
      if (temperatura[x].tipo.equals("Temperatura")) {
        salida += temperatura[x].toString();
      }
    }
    return salida;
  }

  public static int cantidadSensores() {
    return posAnadir;
  }

  public static Sensor[] ordenarSensores() {
    Sensor[] nuevo = sensores.clone();
    Sensor aux;

    for (int x = 1; x < posAnadir; x++){

      for (int y = 0; y < posAnadir - 1; y++) {

        if (nuevo[y].getValor() > nuevo[y + 1].getValor()) {
          aux = nuevo[y];
          nuevo[y] = nuevo[y + 1];
          nuevo[y + 1] = aux;
        }
      }
    }
    return nuevo;
  }
}