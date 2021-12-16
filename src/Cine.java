import java.util.Random;

public class Cine {
    public String nombre;
    private int arrayAsientos[][];
    public int numAsientos;


    public Cine(String nombre, int numFilas, int numColumnas){
        this.nombre = nombre;
        this.arrayAsientos = new int[numFilas][numColumnas];
        this.numAsientos = arrayAsientos.length * arrayAsientos[0].length;
    }

    public void llenarSala(){
        while (!IsLleno()){
            asignarAsiento();
        }
    }

    public void asignarAsiento(){
        Random r = new Random();
        int rFila = r.nextInt(arrayAsientos.length);
        int rColumna = r.nextInt(arrayAsientos[0].length);
        arrayAsientos[rFila][rColumna] = 1;
    }
    public boolean IsLleno(){
        for (int i=0; i<arrayAsientos.length; i++){
            for (int j=0; j<arrayAsientos[0].length;j++){
                if (arrayAsientos[i][j] == 0){
                    return false;
                }
            }
        }
        return true;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumAsientos() {
        return numAsientos;
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


    public void ImprimirTodoArray(){
        for (int i=0; i<arrayAsientos.length; i++){
            for (int j=0; j<arrayAsientos[0].length;j++){
                System.out.print(arrayAsientos[i][j]);
            }
            System.out.println();
        }
    }
}
