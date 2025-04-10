package Actividades;
import java.awt.*;
import javax.swing.*;

class ArbolPitagoras extends JPanel {
    int nivelMax = 10;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        dibujarArbol(g2, 400, 500, -90, 100, nivelMax);
    }

    void dibujarArbol(Graphics2D g, int x1, int y1, double angulo, double longitud, int nivel) {
        if (nivel == 0 || longitud < 2) return;

        int x2 = x1 + (int) (Math.cos(Math.toRadians(angulo)) * longitud);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angulo)) * longitud);

        g.drawLine(x1, y1, x2, y2);
        dibujarArbol(g, x2, y2, angulo - 45, longitud *0.6, nivel - 1);
        dibujarArbol(g, x2, y2, angulo + 45, longitud *0.6, nivel - 1);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Árbol de Pitágoras");
        ArbolPitagoras panel = new ArbolPitagoras();
        ventana.add(panel);
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}