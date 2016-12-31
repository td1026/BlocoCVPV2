package models.entity;

import javax.persistence.*;

/**
 * Created by Telmo Dias on 06/10/2016.
 */

@NamedQueries({
    @NamedQuery(name = "Medicamento.list", query = "from Medicamento"),
    @NamedQuery(name = "Medicamento.getPorChave", query = "from Medicamento where id =:id"),
    @NamedQuery(name = "Medicamento.getNome", query = "from Medicamento where nome =:nome")
})

@Entity
@Table
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (nullable = false , unique = true)
    private String nome;
    @Column
    private String principioActivo;
    @Column
    private String doenca;
    @Column
    private String observacoes;


    public Medicamento(String nome, String principioActivo, String doenca, String observacoes) {
        this.nome = nome;
        this.principioActivo = principioActivo;
        this.doenca = doenca;
        this.observacoes = observacoes;
    }

    public Medicamento() {
        //TODO
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medicamento that = (Medicamento) o;

        if (id != that.id) return false;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nome.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", principioActivo='" + principioActivo + '\'' +
                ", doenca='" + doenca + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}