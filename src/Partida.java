/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Partida {

    private Time timeDaCasa;
    private Time timeVisitante;
    private int golsTimeDaCsa;
    private int golsTimeVisitante;

    
    @Override
    public String toString() {
        return "Partida{" + "timeDaCasa=" + timeDaCasa + ", timeVisitante=" + timeVisitante + ", golsTimeDaCsa=" + golsTimeDaCsa + ", golsTimeVisitante=" + golsTimeVisitante + '}';
    }

    public Time getTimeDaCasa() {
        return timeDaCasa;
    }

    public void setTimeDaCasa(Time timeDaCasa) {
        this.timeDaCasa = timeDaCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getGolsTimeDaCsa() {
        return golsTimeDaCsa;
    }

    public void setGolsTimeDaCsa(int golsTimeDaCsa) {
        this.golsTimeDaCsa = golsTimeDaCsa;
    }

    public int getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    public void setGolsTimeVisitante(int golsTimeVisitante) {
        this.golsTimeVisitante = golsTimeVisitante;
    }

    public Partida(Time timeDaCasa, Time timeVisitante, int golsTimeDaCsa, int golsTimeVisitante) {
        this.timeDaCasa = timeDaCasa;
        this.timeVisitante = timeVisitante;
        this.golsTimeDaCsa = golsTimeDaCsa;
        this.golsTimeVisitante = golsTimeVisitante;
    }

    public Partida() {
    }

}
