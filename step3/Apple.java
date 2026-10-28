package step3;

public class Apple {
    private Color color;
    private double peso;
    public Apple(Color color, double peso) {
        this.color = color;
        this.peso = peso;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}