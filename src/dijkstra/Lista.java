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
    private ArrayList<Vertice> listaVertice;
    private ArrayList listaValor;
 
    
    Lista(){
    listaVertice = new ArrayList();
    listaValor = new ArrayList();
    }
    
    
    public void inserirVertice (Vertice vertice, int peso){
        listaVertice.add(vertice);
        listaValor.add(peso);
    }
    
    public void inserirVerticeIndice(int indice, Vertice vertice){
       listaVertice.add(indice, vertice);
       listaValor.add(indice, vertice.getPeso(vertice));
    
    
    }
    
    
    public void inserirVerticeSemPeso (Vertice vertice){
        listaVertice.add(vertice);

    }
    
    public void inserirValor(int valor){
        listaValor.add(valor);

    }
    
    
    
    
    
     public void removerVertice (Vertice vertice){
         if(listaVertice.contains(vertice)){
            listaValor.remove(ContemVertice(vertice));
            listaVertice.remove(vertice);
         }
         else{System.out.println("Não tem o vertice");}
  
        }
     
    public int ContemVertice(Vertice vertice){
        for(int i = 0; i < qtdDeVertice(); i ++){
            Vertice aux = listaVertice.get(i);
            if (aux.equals(vertice))
                return i;
 
        }
        return -1;
    }

    public int qtdDeVertice(){
        return listaVertice.size();
    }
    
    public int getPeso(Vertice vertice){
       return (int) listaValor.get(ContemVertice(vertice));
      
    
    }
    
    public int getpeso(int indice){
        return (int) listaValor.get(indice);
    
    }
    
    public void ordenarListaPeso(){
        Vertice auxVertice;
        int auxInt;
        for(int i = 0; i < listaValor.size(); i++){
            for (int j = 0; j < listaValor.size(); j++){
                if ((int)listaValor.get(j) > (int)listaValor.get(j+1)){
                    auxVertice = listaVertice.get(j);
                    auxInt = (int)listaValor.get(i);
                    
                    listaVertice.add(j, listaVertice.get(j+1));
                    listaVertice.add((j+1), auxVertice);
                    
                    listaValor.add(j, (int)listaValor.get(j+1));
                    listaValor.add((j+1), auxInt);
   
                }
            
            }
        
        }
    
    }
    
    
    
    
    
    
    public Vertice getVertice(int i){
        return listaVertice.get(i);
    
    }
    
    
    public void printLista(){
        
        for(int i = 0; i < listaVertice.size(); i++){
            System.out.print(listaVertice.get(i).getNome() +"[" + listaValor.get(i) + "]" + ",");
        }
    
    }
    
public Lista vizinhos (){
    Lista lista = new Lista();
    for(int i = 0; i > listaVertice.size(); i++){
      lista.inserirVertice(listaVertice.get(i), (int) listaValor.get(i));
    
    }
    return lista;
}
      
    

    
    
}
