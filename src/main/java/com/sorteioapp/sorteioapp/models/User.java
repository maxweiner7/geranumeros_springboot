package com.sorteioapp.sorteioapp.models;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Column(unique = true)
    private String email;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Sorteio> sorteios;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long codigo) {
        this.id = codigo;
    }

    public List<Sorteio> getSorteios() {
        return sorteios;
    }

    public void setSorteios(List<Sorteio> sorteios) {
        this.sorteios = sorteios;
    }

    @Override
    public String toString() {
        return   "id=" + id;
    }
}

