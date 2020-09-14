package br.com.fivecode.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "options")
public class Opcao implements Serializable {

    private static final long serialVersionUID = 7331555111171595311L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @ManyToMany(fetch=FetchType.LAZY,
            cascade = { CascadeType.ALL})
    @JoinTable(name="usuario_opcoes",
            joinColumns=@JoinColumn(name="id_opcoes"),
            inverseJoinColumns=@JoinColumn(name="id_usuario"))
    private List<User> usuarios;

    public List<User> getUsuarios() {

        if(this.usuarios==null)
            this.usuarios = new ArrayList<>();

        return usuarios;
    }

    public void setUsuario(List<User> usuario) {
        this.usuarios = usuario;
    }

    public void addUsuario(User usuario){
        if(usuarios==null){
            usuarios = new ArrayList<>();
        }
        usuarios.add(usuario);
    }

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

    @Override
    public String toString() {
        return "Opcao{" +
                "id=" + id +
                ", name=' " + name + '\'' +
                ", usuario= " + usuarios +
                '}';
    }
}
