package application;

import entities.Retangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura e a altura do retangulo:");
        retangulo.largura = s.nextDouble();
        retangulo.altura = s.nextDouble();

        System.out.printf("AREA: %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO: %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL: %.2f%n", retangulo.diagonal());
    }
}
