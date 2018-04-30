package Main;

import Factory.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Graph graph1 = new Graph("data01.txt", "graph1");
        System.out.println(graph1);

        //Solution initiale
        Solution solInitiale1 = graph1.getSolutionInitiale();
        System.out.println(solInitiale1);
        System.out.println(" cout de la solution initiale:   " + solInitiale1.getCoutTotal() + "\n\n");

        //Test du recuit simulé avec 50*50 itération
        System.out.println("-------------------------------RECUIT SIMULE-------------------------------");
        Solution solRecuit = graph1.recuitSimule(50, 50);
        System.out.println(solRecuit);
        System.out.println("cout de la solution du recuit:   " + solRecuit.getCoutTotal() + "\n");
        System.out.println("-------------------------------FIN RECUIT SIMULE-------------------------------");

        System.out.println(solInitiale1.getVoisinage(1) + "\n\n");
        System.out.println(solInitiale1);

        graph1.algoGenetique();





/*
      //TODO TESTS SUR LES GRAPH (fonctionne)
        Graph graph1 = new Graph("data01.txt", "graph1");
        Graph graph2 = new Graph("data02.txt", "graph2");
        Graph graph3 = new Graph("data03.txt", "graph3");
        Graph graph4 = new Graph("data04.txt", "graph4");
        Graph graph5 = new Graph("data05.txt", "graph5");

        System.out.println(graph1);
        Solution solInitiale1 = graph1.getSolutionInitiale();
        System.out.println(solInitiale1);
        System.out.println(solInitiale1.getCoutTotal());
        System.out.println(solInitiale1.getVoisinage(3));
        Solution solRecuit1 = graph1.recuitSimule(50, 50);
        System.out.println(solRecuit1);
        System.out.println("cout de la solution du recuit:   " + solRecuit1.getCoutTotal() + "\n");

        System.out.println(graph2);
        Solution solInitiale2 = graph2.getSolutionInitiale();
        System.out.println(solInitiale2);
        System.out.println(solInitiale2.getCoutTotal());
        System.out.println(solInitiale2.getVoisinage(3));
        Solution solRecuit2 = graph2.recuitSimule(50, 50);
        System.out.println(solRecuit2);
        System.out.println("cout de la solution du recuit:   " + solRecuit2.getCoutTotal() + "\n");

        System.out.println(graph3);
        Solution solInitiale3 = graph3.getSolutionInitiale();
        System.out.println(solInitiale3);
        System.out.println(solInitiale3.getCoutTotal());
        System.out.println(solInitiale3.getVoisinage(3));
        Solution solRecuit3 = graph3.recuitSimule(50, 50);
        System.out.println(solRecuit3);
        System.out.println("cout de la solution du recuit:   " + solRecuit3.getCoutTotal() + "\n");

        System.out.println(graph4);
        Solution solInitiale4 = graph4.getSolutionInitiale();
        System.out.println(solInitiale4);
        System.out.println(solInitiale4.getCoutTotal());
        System.out.println(solInitiale4.getVoisinage(3));
        Solution solRecuit4 = graph4.recuitSimule(50, 50);
        System.out.println(solRecuit4);
        System.out.println("cout de la solution du recuit:   " + solRecuit4.getCoutTotal() + "\n");

        System.out.println(graph5);
        Solution solInitiale5 = graph5.getSolutionInitiale();
        System.out.println(solInitiale5);
        System.out.println(solInitiale5.getCoutTotal());
        System.out.println(solInitiale5.getVoisinage(3));
        Solution solRecuit5 = graph5.recuitSimule(50, 50);
        System.out.println(solRecuit5);
        System.out.println("cout de la solution du recuit:   " + solRecuit5.getCoutTotal() + "\n");
*/





    }

}