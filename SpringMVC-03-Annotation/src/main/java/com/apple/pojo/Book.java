package com.apple.pojo;

/**
 * @Author Double_apple
 * @Date 2022/1/22 2:04
 * @Version 1.0
 */
public class Book {
    private String name;
    private int id;

    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
