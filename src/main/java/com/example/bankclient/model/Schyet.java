package com.example.bankclient.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Entity
@Table(name = "schyet")
public class Schyet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numberschyet;
    private Integer srok;
    @Enumerated(EnumType.STRING)
    private Status statuses;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private TypeSchyotov typeSchyotov;

    public Schyet() {
    }

    public Schyet(Long numberschyet, Integer srok, Status statuses, Client client, TypeSchyotov typeSchyotov) {
        this.numberschyet = numberschyet;
        this.srok = srok;
        this.statuses = statuses;
        this.client = client;
        this.typeSchyotov = typeSchyotov;
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

    public Integer getSrok() {
        return srok;
    }

    public void setSrok(Integer srok) {
        this.srok = srok;
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

    public TypeSchyotov getTypeSchyotov() {
        return typeSchyotov;
    }

    public void setTypeSchyotov(TypeSchyotov typeSchyotov) {
        this.typeSchyotov = typeSchyotov;
    }
}
