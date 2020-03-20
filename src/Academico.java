public class Academico extends Persona{
    protected String paper;

    public Academico(String nombre, String ocupacion, int edad, String paper){
        super(nombre, ocupacion, edad);
        this.paper = paper;
    }
    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() { return "Aquí fastidiado con esta cosa del Zoom";}

    public String publicarPaper(){ return this.paper+"publicado";}
}
