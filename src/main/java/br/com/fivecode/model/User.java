package br.com.fivecode.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
public class User implements Serializable {


    private static final long serialVersionUID = -1486973701657974837L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn (name="id_address")
    private Address address;

    @Column(name="username")
    private String username;

    @Column(name="firstname")
    private String firsname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="created")
    private Date created;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id_usuario")
    private List<Computer> computadores;


    @ManyToMany(fetch=FetchType.LAZY,
    cascade = { CascadeType.ALL })
    @JoinTable(name="usuario_opcoes",
            joinColumns=@JoinColumn(name="id_usuario"),
            inverseJoinColumns=@JoinColumn(name="id_opcoes"))
    private List<Opcao> opcoes;

    public List<Opcao> getOptions() {

        return opcoes;
    }

    public void setOpcoes(List<Opcao> opcoes) {
        this.opcoes = opcoes;
    }

    public List<Computer> getComputadores() {
        if(this.computadores==null)
            this.computadores = new ArrayList<>();
        return computadores;
    }

    public void setComputadores(List<Computer> computadores) {
        this.computadores = computadores;
    }

//    public void addOpcoes(Opcao opcao){
//        if(opcoes == null){
//            opcoes = new ArrayList<>();
//        }
//        opcoes.add(opcao);
//    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUsuario=" + idUsuario +
                ", username='" + username + '\'' +
                ", firsname='" + firsname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", created=" + created +
                '}';
    }
}
