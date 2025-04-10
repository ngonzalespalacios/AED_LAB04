package Actividades;

public class TorresdeHanoi {
    public static void torresHanoi(int discos, int origen, int auxiliar, int destino) {
        if (discos == 1) {
            System.out.println("Mover disco de torre " + origen + " a torre " + destino);
        } else {
            torresHanoi(discos - 1, origen, destino, auxiliar);
            System.out.println("Mover disco de torre " + origen + " a torre " + destino);
            torresHanoi(discos - 1, auxiliar, origen, destino);
        }
    }

    public static void main(String[] args) {
        int n = 6; // Puedes cambiar el número de discos para hacer pruebas
        torresHanoi(n, 1, 2, 3);
    }

}
