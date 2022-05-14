package com.example.bankclient.model;

import javax.persistence.*;

@Entity
@Table(name = "typeschyotov")
public class TypeSchyotov {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codetype;
    private String name;

    public TypeSchyotov() {
    }

    public TypeSchyotov(String codetype, String name) {
        this.codetype = codetype;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
