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
           for(int i = 0; i < grafoVertice.qtdDeVerice(); i ++){
               if (grafoVertice.getVertice(i).equals(origem)){
                   grafoVertice.inserirVertice(destino, peso);
                   System.out.println("test");
               }
           
           }
       
       }
   
   
   }
   
   


    
    
    }
    

    
    
    


