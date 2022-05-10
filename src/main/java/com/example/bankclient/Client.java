package com.example.bankclient;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long id;
    @Column(name = "imiya")
    private String imiya;
    @Column(name = "familiya")
    private String familiya;
    @Column(name = "otchestvo")
    private String otchestvo;
    @Column(name = "data_rojdeniya")
    private Date data_rojdeniya;

    public String getSrok_passporta() {
        return srok_passporta;
    }

    public void setSrok_passporta(String srok_passporta) {
        this.srok_passporta = srok_passporta;
    }

    @Column(name = "address")
    private String address;
    @Column(name = "number_passport")
    private String number_passport;

    @Column(name = "srok_passporta")
    private String srok_passporta;

    public Client() {
    }

    public Client(Long id, String imiya, String familiya, String otchestvo, Date data_rojdeniya, String address, String number_passport) {
        this.id = id;
        this.imiya = imiya;
        this.familiya = familiya;
        this.otchestvo = otchestvo;
        this.data_rojdeniya = data_rojdeniya;
        this.address = address;
        this.number_passport = number_passport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImiya() {
        return imiya;
    }

    public void setImiya(String imiya) {
        this.imiya = imiya;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public Date getData_rojdeniya() {
        return data_rojdeniya;
    }

    public void setData_rojdeniya(Date data_rojdeniya) {
        this.data_rojdeniya = data_rojdeniya;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber_passport() {
        return number_passport;
    }

    public void setNumber_passport(String number_passport) {
        this.number_passport = number_passport;
    }
}
