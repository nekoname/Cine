import java.util.Random;

public class Cine {
    private String nombre;
    private int numAsientos;
    private int[][] arrayAsientos;

    public Cine(String nombre, int numFilas, int numColumnas){
        this.nombre = nombre;
        this.numAsientos = numFilas*numColumnas;
        this.arrayAsientos = new int[numFilas][numColumnas];
    }

    public void AsignarAsientos(){
        for (int i = 0; i < arrayAsientos.length;i++) {
            Random r = new Random();
            r.nextInt(arrayAsientos.length - 1);
        }
    }
    /*
    public String getNombre() {
        return nombre;
    }
    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int[][] getArrayAsientos() {
        return arrayAsientos;
    }

    public void setArrayAsientos(int[][] arrayAsientos) {
        this.arrayAsientos = arrayAsientos;
    }
    */
    public void ImprimirTodoArray(){
        System.out.println(nombre);
        System.out.println(numAsientos);
        arrayAsientos[0][0] = 0;
        for(int i=0; i<arrayAsientos.length; i++){
            for (int j=0; j<arrayAsientos[0].length;j++){
                System.out.print(arrayAsientos[i][j]);
            }
        }
    }
}
