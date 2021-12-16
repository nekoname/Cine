public class Main {

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Cine c1 = new Cine("Ocimax",5,5);
        System.out.println(c1.nombre);
        System.out.println(c1.numAsientos);
        c1.llenarSala();
        c1.ImprimirTodoArray();
    }
}
