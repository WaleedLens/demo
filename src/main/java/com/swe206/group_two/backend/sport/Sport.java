package com.swe206.group_two.backend.sport;

import jakarta.persistence.*;

@Entity
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="number")
    private int number;

    public Long getId() {
        return id;
    }

    public Sport() {
    }

    public Sport(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
