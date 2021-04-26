
package br.senai.sp.model.entity;


public class Produto {
    
    private long id;
    private String nome;
    private long idMarca;
    private long idDept;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(long idMarca) {
        this.idMarca = idMarca;
    }

    public long getIdDept() {
        return idDept;
    }

    public void setIdDept(long idDept) {
        this.idDept = idDept;
    }

       


    
}
