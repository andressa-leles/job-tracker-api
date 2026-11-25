package com.example.demo.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidaturas")
public class Candidatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    private String cargo;

    @Column(name = "data_candidatura")
    private LocalDate dataCandidatura;

    @Column(name = "status_candidatura")
    private String statusCandidatura;

    @Column(name = "link_vaga")
    private String linkVaga;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Empresa getEmpresa() { return empresa; }
    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public LocalDate getDataCandidatura() { return dataCandidatura; }
    public void setDataCandidatura(LocalDate dataCandidatura) { this.dataCandidatura = dataCandidatura; }

    public String getStatusCandidatura() { return statusCandidatura; }
    public void setStatusCandidatura(String statusCandidatura) { this.statusCandidatura = statusCandidatura; }

    public String getLinkVaga() { return linkVaga; }
    public void setLinkVaga(String linkVaga) { this.linkVaga = linkVaga; }
}
