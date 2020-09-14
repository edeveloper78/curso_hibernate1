package br.com.fivecode.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Table(name = "computer")
public class Computer implements Serializable {

    private static final long serialVersionUID = -1465244635117625430L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @ManyToOne//(optional=false)
    @JoinColumn(name="id_usuario",insertable = false, updatable = false)
    private User usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
