package ru.netology.afishamanager.AfishaMckt.managertest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.afishamanager.AfishaMckt.manager.Afisha;

public class AfishaTest {

    Afisha afisha = new Afisha(10);

    @Test
    public void findAllFilms() {
        afisha.addedFilm("Film1");
        afisha.addedFilm("Film2");
        afisha.addedFilm("Film3");
        afisha.addedFilm("Film4");
        afisha.addedFilm("Film5");
        afisha.addedFilm("Film6");
        afisha.addedFilm("Film7");
        afisha.addedFilm("Film8");
        afisha.addedFilm("Film9");
        afisha.addedFilm("Film10");

        String[] actual = afisha.findAll();
        String[] expexted = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7", "Film8", "Film9", "Film10"};
        Assertions.assertArrayEquals(expexted, actual);
    }

    @Test
    public void findLastFilm() {
        afisha.addedFilm("Film1");
        afisha.addedFilm("Film2");
        afisha.addedFilm("Film3");
        afisha.addedFilm("Film4");
        afisha.addedFilm("Film5");
        afisha.addedFilm("Film6");
        afisha.addedFilm("Film7");
        afisha.addedFilm("Film8");
        afisha.addedFilm("Film9");
        afisha.addedFilm("Film10");

        String[] actual = afisha.findLast();
        String[] expexted = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(expexted, actual);

    }

    @Test
    public void lastFilmBelowLimit() {
        afisha.addedFilm("Film1");
        afisha.addedFilm("Film2");
        afisha.addedFilm("Film3");
        afisha.addedFilm("Film4");
        afisha.addedFilm("Film5");
        afisha.addedFilm("Film6");
        afisha.addedFilm("Film7");
        afisha.addedFilm("Film8");
        afisha.addedFilm("Film9");

        String[] actual = afisha.findLast();
        String[] expexted = {"Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(expexted, actual);

    }

    @Test
    public void lastFilmOnLimit() {
        afisha.addedFilm("Film1");
        afisha.addedFilm("Film2");
        afisha.addedFilm("Film3");
        afisha.addedFilm("Film4");
        afisha.addedFilm("Film5");
        afisha.addedFilm("Film6");
        afisha.addedFilm("Film7");
        afisha.addedFilm("Film8");
        afisha.addedFilm("Film9");
        afisha.addedFilm("Film10");

        String[] actual = afisha.findLast();
        String[] expexted = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(expexted, actual);
    }

    @Test
    public void lastFilmOverLimit() {
        afisha.addedFilm("Film1");
        afisha.addedFilm("Film2");
        afisha.addedFilm("Film3");
        afisha.addedFilm("Film4");
        afisha.addedFilm("Film5");
        afisha.addedFilm("Film6");
        afisha.addedFilm("Film7");
        afisha.addedFilm("Film8");
        afisha.addedFilm("Film9");
        afisha.addedFilm("Film10");
        afisha.addedFilm("Film11");


        String[] actual = afisha.findLast();
        String[] expexted = {"Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2",};
        Assertions.assertArrayEquals(expexted, actual);
    }
}
