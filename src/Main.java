/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Main {
    public static void main(String[] args){
        Tecnico tecnicoDoGremio = new Tecnico("Renato", 59, 20000);
        Tecnico tecnicoDoInter = new Tecnico("Mano", 49, 20000);
        
        Jogador suarez = new Jogador("Suarez", 9, Posicao.ATACANTE);
        Jogador adriel = new Jogador("Adriel", 1, Posicao.GOLEIRO); 
        Jogador geromel = new Jogador("Geromel", 3, Posicao.ZAGUEIRO);
        Jogador kannemann = new Jogador("Kannemann", 4, Posicao.ZAGUEIRO);
        Jogador bitello = new Jogador("Bitello", 8, Posicao.MEIA);
        
        Time gremio = new Time("Grêmio", tecnicoDoGremio, 0,0,0);
        Time inter = new Time("Inter", tecnicoDoInter, 0,0,0);
        
        gremio.adicionarJogador(suarez);
        gremio.adicionarJogador(adriel);
        gremio.adicionarJogador(geromel);
        gremio.adicionarJogador(kannemann);
        gremio.adicionarJogador(bitello);
        
        Partida partida = new Partida(gremio, inter, 2, 1);
        
        System.out.println(gremio);
        System.out.println(inter);

        


    }
}
