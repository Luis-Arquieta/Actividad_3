/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


class Card {
    private String palo;
    private String color;
    private String valor;
    
    public Card(String palo,String color,String valor){
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    
    public String toString(){
        return palo +","+ color +","+ valor;
    }
}

class Deck {
    private List<Card> cards;
    private Set<Card> uniqueCards;
    
    public Deck(){
        cards = new ArrayList();
        iniciarDeck();
        

   
}
public void iniciarDeck(){
String[] palos = {"Tréboles","Corazones","Picas","Diamantes"};
String[] colores;
String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
 
for (String palo : palos) {
    if (palo.equals("Corazones") || palo.equals("Diamantes")) {
            colores = new String[]{"Rojo"};
        } else {
            colores = new String[]{"Negro"};
        }
            for (String color : colores) {
                for (String valor : valores) {
                    cards.add(new Card(palo, color, valor));
                }
            }
        }
}

// Método shuffle
public void shuffle(){
    Collections.shuffle(cards);
    System.out.println("Se mezcló el Deck");
    
}

// Método head
public void head(){
    if(!cards.isEmpty()){
        int randomIndex = (int) (Math.random() * cards.size());
        Card card = cards.remove(randomIndex);
        System.out.println(card);
        System.out.println("Quedan "+cards.size() +" cartas en deck");
    } else {
        System.out.println("No quedan cartas en el deck");
    }
}

// Método pick
public void pick(){
    if (!cards.isEmpty()) {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en deck");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
}

//Método hand
public void hand() {
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card);
            }
            System.out.println("Quedan " + cards.size() + " cartas en deck");
        } else {
            System.out.println("No hay suficientes cartas en el deck para formar una mano.");
        }
    }
}




public class Actividad_3 {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
}
