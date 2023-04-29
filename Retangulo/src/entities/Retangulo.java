package entities;

public class Retangulo {
    public double largura;
    public double altura;

    public double area(){
        return this.altura * this.largura;
    }

    public double perimetro(){
        return (this.altura + this.largura) * 2;
    }

    public double diagonal(){
        double rL = Math.pow(largura, 2);
        double rA = Math.pow(altura, 2);
        return Math.sqrt(rL+rA) ;
    }
}
