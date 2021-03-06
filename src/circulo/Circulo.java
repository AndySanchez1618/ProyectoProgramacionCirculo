package circulo;

public class Circulo implements Comparable<Circulo> {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI * radio*radio;
    }   
    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("%s: %f %n %s: %f %n %s: %f %n", "Radio",radio, "Area",area(),"Perimetro",perimetro());
    
    }
    
    @Override
    public int compareTo(Circulo c) {
        if (c.getRadio() > radio) {
            return -1;
        } else {
            return 1;
        }
    }
   
}
