package Entities;

import java.util.Objects;

public class Book {

    private int id;

    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Book)) return false;
        if (!super.equals(object)) return false;
        Book book = (Book) object;
        return getId() == book.getId() &&
                java.util.Objects.equals(getName(), book.getName());
    }

    public int hashCode() {

        return Objects.hash(super.hashCode(), getId(), getName());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}