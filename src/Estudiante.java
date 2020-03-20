public class Estudiante extends Persona{

    public Estudiante(String nombre, String ocupacion, int edad){
        super(nombre, ocupacion, edad);
    }
    public void comer() {
        System.out.println("Ñom Ñom completito de gorbea");
    }

    public void dormir() {
        System.out.println("ZzzZzZz");
    }

    public String hacerLoSuyo() { return "Aquí viendo animes y series"; }
}
