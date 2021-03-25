package com.example.demo.mymodel;


public class Model {
    private String model1;
    private String model2;
    private SubModel subModel;

    public String getModel1() {
        return model1;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public String getModel2() {
        return model2;
    }

    public void setModel2(String model2) {
        this.model2 = model2;
    }

    public SubModel getSubModel() {
        return subModel;
    }

    public void setSubModel(SubModel subModel) {
        this.subModel = subModel;
    }

    @Override
    public String toString() {
        return "mymodel.Model{" +
                "model1='" + model1 + '\'' +
                ", model2='" + model2 + '\'' +
                ", subModel='" + subModel + '\'' +
                '}';
    }
}
