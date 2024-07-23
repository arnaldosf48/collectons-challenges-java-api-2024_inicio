package List.Pesquisa;

import java.util.ArrayList;
import  java.util.List;

public class CatalogoLivros {
    //atributos

    private List<Livro> livrosList;

    public CatalogoLivros( ) {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao ){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }

            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesauisaPorIntervalosAnos (int anoInicial ,int anoFinal){
        List<Livro> listaPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaPorIntervaloAnos.add(l);
                }

            }

        }
        return listaPorIntervaloAnos;
    }

    public Livro pesquisarPorTItulo (String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo))
                    livroPorTitulo = l;
                break;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1994);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2025);

       System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
       System.out.println(catalogoLivros.pesauisaPorIntervalosAnos(2020, 2022));
       System.out.println(catalogoLivros.pesquisarPorTItulo("Livro 1"));

    }
}
