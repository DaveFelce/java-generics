package com.example.Generics1;

import java.util.ArrayList;
import java.util.List;

public class runGenerics1 {
    public static void main(String args[]) {
        // Mouse
        Animal<Mouse> mouseGenerics1 = new Animal<Mouse>();
        mouseGenerics1.setName("Frederik");
        List mouseList = new ArrayList();
        mouseList.add(mouseGenerics1);
        mouseGenerics1.snareAll(mouseList);
        mouseGenerics1.snare(new Mouse());
        Mouse mouse = mouseGenerics1.release();

        // Bear
        Animal<Bear> bearGenerics1 = new Animal<Bear>();
        bearGenerics1.snare(new Bear());
        Bear bear = bearGenerics1.release();
    }
}
