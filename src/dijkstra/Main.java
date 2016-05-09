/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

/**
 *
 * @author dario.lwoloszin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //criando os vertices
        Vertice v1 = new Vertice("V1");
        Vertice v2 = new Vertice("V2");
        Vertice v3 = new Vertice("V3");
        Vertice v4 = new Vertice("V4");
        Vertice v5 = new Vertice("V5");
        Vertice v6 = new Vertice("V6");
        Vertice v7 = new Vertice("V7");
        //criando o grafo
        Grafo g1 = new Grafo();
        //inserir os vertices no grafo
        g1.inserirVerticeNoGrafo(v1);
        g1.inserirVerticeNoGrafo(v2);
        g1.inserirVerticeNoGrafo(v3);
        g1.inserirVerticeNoGrafo(v4);
        g1.inserirVerticeNoGrafo(v5);
        g1.inserirVerticeNoGrafo(v6);
        g1.inserirVerticeNoGrafo(v7);
        
        // inserir as arestas
        g1.inserirAresta(v1, v2, 2);
        g1.inserirAresta(v1, v3, 1);
        
        g1.inserirAresta(v2, v4, 4);
        g1.inserirAresta(v2, v3, 1);
        g1.inserirAresta(v2, v5, 7);
        
        g1.inserirAresta(v3, v2, 1);
        g1.inserirAresta(v3, v4, 5);
        
        g1.inserirAresta(v4, v6, 2);
        g1.inserirAresta(v4, v5, 3);
        
        g1.inserirAresta(v5, v7, 1);
        g1.inserirAresta(v5, v3, 2);
        
        g1.inserirAresta(v6, v7, 2);
        g1.printGrafo();
        
        g1.removerAresta(v5, v7);
        g1.printGrafo();
        
        
        
        
        Lista text = v1.vizinhos();
        
        
        text.printLista();
        
    }
    
}
