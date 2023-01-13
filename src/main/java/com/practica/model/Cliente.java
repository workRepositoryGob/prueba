package com.practica.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_cliente")
public class Cliente {

    @Id
    @Column(name="N_IDCLI")
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "generator", sequenceName = "SEQ_CLIENTE", allocationSize = 1)
    private Integer idCliente;

    @Column(name = "V_NOMBRE", nullable = false,length = 70)
    private String nombre;

    @Column(name = "V_APELLIDO", nullable = false,length = 70)
    private String apellido;

    @Column(name = "N_EDAD", nullable = false,length = 5)
    private Integer edad;

    @Column(name = "D_FECHANACIMIENTO", nullable = false)
    private LocalDate fechaNacimiento;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
