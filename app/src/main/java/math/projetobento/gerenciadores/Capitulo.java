package math.projetobento.gerenciadores;

import java.io.Serializable;

/**
 * Created by txring on 29/08/2018.
 */
public class Capitulo implements Serializable {

    private int idCapitulo;
    private String nome;
    private int cor;
    private String texto;

    public int getIdCapitulo() {
        return idCapitulo;
    }

    public void setIdCapitulo(int idCapitulo) {
        this.idCapitulo = idCapitulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
