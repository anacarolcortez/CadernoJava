package src;

import java.time.LocalDate;

import src.br.com.dio.projetos.Bootcamp;
import src.br.com.dio.projetos.Conteudo;
import src.br.com.dio.projetos.Curso;
import src.br.com.dio.projetos.Dev;
import src.br.com.dio.projetos.Mentoria;

class Main {
    public static void main(String[] args) {
      
      Conteudo cursoJavaPoo = new Curso("POO em Java", "Programação Orientada a Objetos na linguagem Java", 40);
      Conteudo cursoJavaCollections = new Curso("Collections", "Conhecendo as coleções da linguagem Java", 60);
      Conteudo cursoJavaStreams = new Curso("Streams do Java 8", "Aprendendo a utilizar a API de Streams, introduzida no Java 8", 20);
      Conteudo mentoriaOrangeTech1 = new Mentoria("Bootcamp OrangeTech - Java", "Tema abordado: cultura sangue laranja", LocalDate.now());

      Bootcamp orangeTechBackend = new Bootcamp("Orange Tech Back-end", "Bootcamp de Java no Back-end, promovido pelo Inter, focado em mulheres e pessoas negras");
      orangeTechBackend.getConteudos().add(cursoJavaPoo);    
      orangeTechBackend.getConteudos().add(cursoJavaCollections);    
      orangeTechBackend.getConteudos().add(cursoJavaStreams);    
      orangeTechBackend.getConteudos().add(mentoriaOrangeTech1); 
      
      Dev anacarol = new Dev("Ana Carolina");

      anacarol.inscreverBootcamp(orangeTechBackend);

      System.out.println("Status Ana Carol");
      anacarol.progredir();
      System.out.println(anacarol.getConteudosInscritos());
      System.out.println(anacarol.getConteudosConcluidos());
      System.out.println(anacarol.calcularXP());

      System.out.println("**************************");

      Dev anaheapster = new Dev("Ana Heapster");

      anaheapster.inscreverBootcamp(orangeTechBackend);

      System.out.println("Status Ana Heapster");
      anaheapster.progredir();
      anaheapster.progredir();
      anaheapster.progredir();
      System.out.println(anaheapster.getConteudosInscritos());
      System.out.println(anaheapster.getConteudosConcluidos());
      System.out.println(anaheapster.calcularXP());

    }
  }