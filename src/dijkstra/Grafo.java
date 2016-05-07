/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

import java.util.ArrayList;

/**
 *
 * @author dwoloszin
 */
public class Grafo {
    private Lista grafoVertice;
    
    Grafo(){
       grafoVertice = new Lista(); 
    }
    
   public void inserirVerticeNoGrafo(Vertice vertice){
    grafoVertice.inserirVerticeSemPeso(vertice);
   
   } 
   
   
   public void removerVerticeNoGrafo(Vertice vertice){
       grafoVertice.removerVertice(vertice);
   }
   
   
   

   
   public void inserirAresta(Vertice origem, Vertice destino, int peso){
       int aux1 = grafoVertice.ContemVertice(origem);
       int aux2 = grafoVertice.ContemVertice(destino);
       if(aux1 != -1 && aux2 != -1){
           for(int i = 0; i < grafoVertice.qtdDeVertice(); i ++){
               if (grafoVertice.getVertice(i).equals(origem)){
                   grafoVertice.getVertice(i).inserirVerticeVizinho(destino, peso);
                   System.out.println("Inserida aresta entre:" + origem.getNome() + " -> " + destino.getNome() +" [" + peso + "]");
                   break;
               }
           
           }
       
       }
   
   
   }
   
   public void removerAresta(Vertice origem, Vertice destino){
       int aux1 = grafoVertice.ContemVertice(origem);
       int aux2 = grafoVertice.ContemVertice(destino);
       if(aux1 != -1 && aux2 != -1){
           for(int i = 0; i < grafoVertice.qtdDeVertice(); i ++){
               if (grafoVertice.getVertice(i).equals(origem)){
                   grafoVertice.getVertice(i).removerVerticeVizinho(destino);
                   System.out.println("Removida aresta entre:" + origem.getNome() + " -> " + destino.getNome());
                   break;
               }
           
           }
       
       }
   
   
   }
   
   
   
   public void printGrafo(){
       for(int i = 0; i < grafoVertice.qtdDeVertice(); i ++){
           System.out.print(grafoVertice.getVertice(i).getNome()+ ": ");
           grafoVertice.getVertice(i).printListaVizinho();
           System.out.print(" \n");
       }
   
   }
   
   

   
   


    
    
    }
    

    
    
    


