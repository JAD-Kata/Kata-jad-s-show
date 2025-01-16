package com.jad.show;

public enum MovieType {
    ACTION("Action"),
    ADVENTURE("Adenture"),
    COMEDY("Comedie"),
    DRAMA("Drame"),
    FANTASY("Fantastique"),
    HORROR("Horreur"),
    ROMANCE("Romance"),
    SCIENCE_FICTION("Science-Fiction"),
    THRILLER("Thriller");

    private final String name;

    MovieType(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
