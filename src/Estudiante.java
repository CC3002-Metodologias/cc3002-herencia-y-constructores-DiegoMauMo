public class Estudiante extends Persona{

    public Estudiante(String nombre, String ocupacion, int edad){
        super(nombre, ocupacion, edad);
    }
    public void comer() {
        System.out.println("Ñom Ñom completito de gorbea");
    }

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public String hacerLoSuyo() { return "En cuarentena, viendo animes y series"; }
}
