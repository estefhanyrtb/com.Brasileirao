
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Escola
 */
public class Time {

    private String nome;
    private Tecnico tecnico;
    private List<Jogador> jogadores;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Time() {
        jogadores = new ArrayList<>();

    }

    Time(String grêmio, Tecnico tecnicoDoGremio, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void adicionarJogador(Jogador jogador) {
        if ((jogadores.size() < 11) && (!jogadores.contains(jogador))) {
            jogadores.add(jogador);
        } else {
            System.out.println("Jogador não pode ser adicionado!");
        }
    }

    public Time(String nome, Tecnico tecnico, List<Jogador> jogadores, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = jogadores;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", tecnico=" + tecnico + ", jogadores=" + jogadores + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + '}';
    }

}
