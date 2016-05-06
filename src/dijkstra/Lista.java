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
public class Lista {
    private ArrayList<Vertice> listaVertice = new ArrayList();
    private ArrayList listaValor = new ArrayList();
    
    
    
    
    public void inserirVertice (Vertice vertice, int peso){
        listaVertice.add(vertice);
        listaValor.add(peso);
    }
    
    public void inserirVerticeSemPeso (Vertice vertice){
        listaVertice.add(vertice);

    }
    
    
    
    
     public void removerVertice (Vertice vertice){
         if(listaVertice.contains(vertice)){
            listaValor.remove(ContemVertice(vertice));
            listaVertice.remove(vertice);
         }
         else{System.out.println("Não tem o vertice");}
  
        }
     
    public int ContemVertice(Vertice vertice){
        for(int i = 0; i < qtdDeVerice(); i ++){
            Vertice aux = listaVertice.get(i);
            if (aux.equals(vertice))
                return i;
 
        }
        return -1;
    }

    public int qtdDeVerice(){
        return listaVertice.size();
    }
    
    public int getPeso(Vertice vertice){
       return (int) listaValor.get(ContemVertice(vertice));
      
    
    }
    
    
    public Vertice getVertice(int i){
        return listaVertice.get(i);
    
    }
    
    public ArrayList vizinhos(){
        return listaVertice;
    
    }
    

    
    
}
