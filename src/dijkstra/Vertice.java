/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

/**
 *
 * @author dwoloszin
 */
public class Vertice {
   private Lista verticesVizinhos;
   private String nome;
   private Vertice verticeAntecessorDeMenorCusto;
   
   Vertice(String nome){
     verticesVizinhos = new Lista(); 
     this.nome = nome;
     this.verticeAntecessorDeMenorCusto = null;
   }
   
   public String getNome(){
       return nome;
   }
   
   public Vertice getVerticeAntecessorDeMenorCusto(){
       return verticeAntecessorDeMenorCusto;
   }
   
   
   public void setVerticeAntecessorDeMenorCusto(Vertice vertice){
       this.verticeAntecessorDeMenorCusto = vertice;
   
   }
   
   public void removerVerticeVizinho(Vertice vertice){
       verticesVizinhos.removerVertice(vertice);
   }
   
   public void inserirVerticeVizinho(Vertice vertice, int peso){
      verticesVizinhos.inserirVertice(vertice, peso);
   
   }
   
   public int getTamanhoListaVizinho(){
       return verticesVizinhos.qtdDeVertice();
   
   }
   
   public void printListaVizinho(){
       verticesVizinhos.printLista();
   }
   

   
   
   
  
}
