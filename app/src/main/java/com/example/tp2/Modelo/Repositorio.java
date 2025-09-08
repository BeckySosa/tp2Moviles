package com.example.tp2.Modelo;

import com.example.tp2.R;

import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Libro> lista;

    public Repositorio() {
        Libro l1=new Libro("Harry Potter"," J.K. Rowling","Las aventuras de Harry Potter y sus amigos en Hogwarts,el colegio de magia",1997, R.drawable.libro1);
        Libro l2=new Libro("Señor de los anillos"," J. R. R. Tolkien.","La novela narra el viaje del protagonista principal, Frodo Bolsón, hobbit de la Comarca, para destruir el Anillo Único",1954,R.drawable.libro2);
        Libro l3= new Libro("Alas de Hierro","Rebecca Yarros.","Alas de hierro (Empíreo 2) Rebecca Yarros Todos esperaban que Violet Sorrengail muriera en su primer año en el Colegio de Guerra de Basgiath, incluso ella misma",2024,R.drawable.libro3);
        Libro l4 =new Libro("Habitos Atomicos","James Clear"," ¿Cómo podemos vivir mejor? Sabemos que unos buenos hábitos nos permiten mejorar significativamente nuestra vida, pero con frecuencia nos desviamos del camino",2023,R.drawable.libro4);
        Libro l5= new Libro("Carolina Winograd","Carolina Winograd","A través de su historia personal y de herramientas prácticas basadas en ciencia, medicina tradicional china, neurociencia y sabiduría emocional, la autora nos guía en un viaje de transformación.",2025,R.drawable.libro5);
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(l5);
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }
    public Libro buscarLibro(String nombre){
        String buscado=nombre.toLowerCase();
        for (Libro libro:lista) {
            if(libro.getTitulo().toLowerCase().contains(buscado)){
                return libro;
            }
        }
        return null;
    }
}
