package consultviewconsultoria.happyclient.object;

import java.io.Serializable;

/**
 * Created by janiel on 08/12/2018.
 */

public class Voto implements Serializable{
    private static final long serialVersionUID = 1L;
    public static final String VR_V = "VOTO";

    private long _idVoto;
    private int exelente;
    private int bom;
    private int regular;
    private int ruim;
    private int pessimo;

    public Voto() {
        _idVoto = 0;

    }

    public long get_idVoto() {
        return _idVoto;
    }

    public void set_idVoto(long _idVoto) {
        this._idVoto = _idVoto;
    }

    public int getExelente() {
        return exelente;
    }

    public void setExelente(int exelente) {
        this.exelente = exelente;
    }

    public int getBom() {
        return bom;
    }

    public void setBom(int bom) {
        this.bom = bom;
    }

    public int getRegular() {
        return regular;
    }

    public void setRegular(int regular) {
        this.regular = regular;
    }

    public int getRuim() {
        return ruim;
    }

    public void setRuim(int ruim) {
        this.ruim = ruim;
    }

    public int getPessimo() {
        return pessimo;
    }

    public void setPessimo(int pessimo) {
        this.pessimo = pessimo;
    }


    @Override
    public String toString() {
        return "Voto{" +
                "_idVoto=" + _idVoto +
        ", exele    nte=" + exelente +
                ", bom=" + bom +
                ", regular=" + regular +
                ", ruim=" + ruim +
                ", pessimo=" + pessimo +
                '}';
    }
}
