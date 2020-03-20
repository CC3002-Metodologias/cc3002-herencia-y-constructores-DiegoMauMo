public class Main {

    public static void main(String[] args) {
        Persona senku = new Estudiante("Senku","Cienticero", 3700);
        Persona bergel = new Academico("Bergel","profesor",34, "Metodologías de programación");
        senku.comer(); senku.dormir();
        System.out.println(senku.hacerLoSuyo());
        bergel.comer(); bergel.dormir();
        System.out.println(bergel.hacerLoSuyo());
        System.out.println(bergel.publicarPaper());
    }
}
