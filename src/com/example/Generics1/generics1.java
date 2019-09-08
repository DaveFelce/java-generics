package com.example.Generics1;

import java.util.ArrayList;
import java.util.List;

class Mouse {
}

class Bear {
}

class Generics1<G> {
    G trapped;
    List<G> trappedList = new ArrayList<G>();
    private String name;

    public void snare(G trapped) {
        this.trapped = trapped;
    }

    public void snareAll(List<G> list) {
        G theName = list.get(0);
        System.out.println(theName.getName());
    }

    public G release() {
        return trapped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
