package Ultima_atividade_POO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Continente {
    private final String nome;
    private String europeu; // Nome do continente
    private ArrayList<Pais> paises;

    // Construtor
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Método para adicionar
    public void adicionarPais(Pais pais) {
        this.paises.add(pais);
    }

    // Método para retornar
    public double getDimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    // Método para retornar a população total do continente
    public long getPopulacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    // Método para retornar a densidade populacional do continente
    public double getDensidadePopulacional() {
        return getPopulacaoTotal() / getDimensaoTotal();
    }

    // Método para retornar o país com maior população no continente
    public Pais getPaisMaiorPopulacao() {
        return paises.stream().max(Comparator.comparing(Pais::getPopulacao)).orElse(null);
    }

    // Método para retornar o país com menor população no continente
    public Pais getPaisMenorPopulacao() {
        return paises.stream().min(Comparator.comparing(Pais::getPopulacao)).orElse(null);
    }

    // Método para retornar o país de maior dimensão territorial no continente
    public Pais getPaisMaiorDimensao() {
        return paises.stream().max(Comparator.comparing(Pais::getDimensao)).orElse(null);
    }

    // Método para retornar o país de menor dimensão territorial no continente
    public Pais getPaisMenorDimensao() {
        return paises.stream().min(Comparator.comparing(Pais::getDimensao)).orElse(null);
    }

    // Método para retornar a razão territorial do maior pais em relação ao menor país
    public double getRazaoTerritorial() {
        Pais paisMaiorDimensao = getPaisMaiorDimensao();
        Pais paisMenorDimensao = getPaisMenorDimensao();
        if (paisMaiorDimensao != null && paisMenorDimensao != null) {
            return paisMaiorDimensao.getDimensao() / paisMenorDimensao.getDimensao();
        } else {
            return 0; // Se não houver países no continente
        }
    }
}

// Classe Pais
class Pais {
    private String nome; // Nome do país
    private double dimensao; // Dimensão territorial do país em quilômetros quadrados
    private long populacao; // População do país

    // Construtor
    public Pais(String nome, double dimensao, long populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public long getPopulacao() {
        return populacao;
    }
}