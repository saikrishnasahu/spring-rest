package com.example.demo.model;

import java.util.Objects;

public class Parent {
    protected String a;
    protected String b;

    public Parent a(String a) {
        this.a = a;
        return this;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return a.equals(parent.a) &&
                b.equals(parent.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "a='" + a + '\'' + ", b='" + b + '\'';
    }
}
