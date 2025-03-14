package org.codenova.spring.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
public class Icecream {
    private int id;
    private String name;
    private int volume;
    private int calories;
    private LocalDate releaseDate;
}
