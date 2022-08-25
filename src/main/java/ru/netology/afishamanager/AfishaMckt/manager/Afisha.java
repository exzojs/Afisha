package ru.netology.afishamanager.AfishaMckt.manager;

public class Afisha {
    private String[] films = new String[0];
    private int limit = 10;

    public Afisha() {
    }
    public Afisha(int limit) {
        this.limit = limit;
    }

    public void addedFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int lenght;
        if (films.length < limit) {
            lenght = films.length;
        } else {
            lenght = limit;
        }
        String[] tmp = new String[lenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}