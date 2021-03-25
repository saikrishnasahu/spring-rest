package com.example.demo.model;

import java.util.Objects;

public class ChildA extends Parent {
    private String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChildA childA = (ChildA) o;
        return c.equals(childA.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), c);
    }

    @Override
    public String toString() {
        return "ChildA{" +
                super.toString() +
                ", c='" + c + '\'' +
                '}';
    }
}
