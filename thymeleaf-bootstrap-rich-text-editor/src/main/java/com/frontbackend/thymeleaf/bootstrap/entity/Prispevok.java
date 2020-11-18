package com.frontbackend.thymeleaf.bootstrap.entity;

import javax.persistence.*;

@Entity
@Table(name = "prispevok")
public class Prispevok {

    /** ID PRISPEVKU **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /** OBSAH PRISPEVKU **/
    @Column(name = "obsah")
    private String obsah;

    /** RANKING PRISPEVKU **/
    @Column(name = "ranking")
    private int ranking;

    /** ZAKLADATEL PRISPEVKU **/
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "uzivatel_meno3")
    private Uzivatel zakladatelPrispevku;

    /** VLAKNO PRISPEVKU**/
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                        CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "vlakno_id")
    private Vlakno vlaknoPrispevku;

    /** CONSTRUCTORS **/
    public Prispevok() {
    }

    public Prispevok(String obsah, int ranking) {
        this.obsah = obsah;
        this.ranking = ranking;
    }

    /** GETTERS AND SETTERS **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObsah() {
        return obsah;
    }

    public void setObsah(String obsah) {
        this.obsah = obsah;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Vlakno getVlaknoPrispevku() {
        return vlaknoPrispevku;
    }

    public void setVlaknoPrispevku(Vlakno vlaknoPrispevku) {
        this.vlaknoPrispevku = vlaknoPrispevku;
    }

    public Uzivatel getZakladatelPrispevku() {
        return zakladatelPrispevku;
    }

    public void setZakladatelPrispevku(Uzivatel zakladatelPrispevku) {
        this.zakladatelPrispevku = zakladatelPrispevku;
    }


    // add methods for bi-directional relationship
    /** PRIRADIT ZAKLADATELA PRISPVEKU **/
    public void addZakladatelaPrispevku(Uzivatel tempUzivatel) {
        zakladatelPrispevku = tempUzivatel;
    }

    /** PRIRADIT VLAKNO PRISPEVKU **/
    public void addVlaknoPrispevku(Vlakno tempVlakno) {
        vlaknoPrispevku = tempVlakno;
    }

}
