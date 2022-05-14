package com.example.bankclient.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "schyet")
public class Schyet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numberschyet;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private TypeSchyotov typeSchyotov;
    private Date srok_deistvie;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Client client;
    @Enumerated(EnumType.STRING)
    private Status statuses;

    public Schyet() {
    }

    public Schyet(Long id, Long numberschyet, TypeSchyotov typeSchyotov, Date srok_deistvie, Status statuses, Client client) {
        this.id = id;
        this.numberschyet = numberschyet;
        this.typeSchyotov = typeSchyotov;
        this.srok_deistvie = srok_deistvie;
        this.statuses = statuses;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumberschyet() {
        return numberschyet;
    }

    public void setNumberschyet(Long numberschyet) {
        this.numberschyet = numberschyet;
    }

    public TypeSchyotov getTypeSchyotov() {
        return typeSchyotov;
    }

    public void setTypeSchyotov(TypeSchyotov typeSchyotov) {
        this.typeSchyotov = typeSchyotov;
    }

    public Date getSrok_deistvie() {
        return srok_deistvie;
    }

    public void setSrok_deistvie(Date srok_deistvie) {
        this.srok_deistvie = srok_deistvie;
    }

    public Status getStatuses() {
        return statuses;
    }

    public void setStatuses(Status statuses) {
        this.statuses = statuses;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
