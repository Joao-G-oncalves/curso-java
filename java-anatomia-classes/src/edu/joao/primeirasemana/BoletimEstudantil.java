package edu.joao.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        
        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if(mediaFinal == 6)
            System.out.println("Prova MINERVA");
        else
            System.out.println("APROVADO!");
    }
}