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
public class Dijkstra {
    Grafo grafo;
    Vertice verticeInicial;
    Lista conjuntoS;
    Lista Antecessor;
    Lista distancia;
    Lista vizinhos;
    
    
    Dijkstra(Grafo grafo, Vertice verticeinicial){
      this.grafo = grafo;
      this.verticeInicial = verticeinicial;
      conjuntoS = new Lista();
      Antecessor = new Lista();
      distancia = new Lista();
      vizinhos = new Lista();
      conjuntoS.inserirVerticeSemPeso(verticeinicial);
      distancia.inserirValor(0);
      vizinhos = verticeinicial.vizinhos();
    
    }
    
    public void exeDijkstra(){
        Lista aux = vizinhos;
        while(vizinhos.qtdDeVertice() != 0){
            
        
        }
    
    
    }
    
    
    
    
    
    
    
    
    
}