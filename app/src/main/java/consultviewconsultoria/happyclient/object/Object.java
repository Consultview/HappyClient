package consultviewconsultoria.happyclient.object;

import java.io.Serializable;

/**
 * Created by janiel on 08/12/2018.
 */

public class Object implements Serializable{



    private long _idVoto;
    private int exelente;
    private int bom;
    private int regular;
    private int ruim;
    private int pessimo;

    public Object() {

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
}
