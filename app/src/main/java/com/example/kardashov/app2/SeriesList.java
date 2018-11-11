package com.example.kardashov.app2;

import java.util.ArrayList;
import java.util.List;

public class SeriesList {
    List<String> getListTv (String spinner) {
        List<String> list = new ArrayList<>();
        if(spinner.equals("Комедия"))
            list.add("Друзья");

        if(spinner.equals("Фентези"))
            list.add("Игра пристолов");

        if(spinner.equals("Фентези"))
            list.add("Игра пристолов");

        if(spinner.equals("Ужасы"))
            list.add("Ходячие мертвецы");

        if(spinner.equals("Фантастика"))
            list.add("Футурама");

        if(spinner.equals("Криминал")) {
            list.add("Во все тяжкие");
            list.add("Металлист");
        }

        return list;
    }
}


