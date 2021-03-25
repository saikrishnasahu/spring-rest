package com.example.demo.model;

public class ModelName {
    private String model1;
    private String model;
//    private SubModelName subModel;

    public String getModel1() {
        return model1;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public String getModel2() {
        return model;
    }

    public void setModel(String model2) {
        this.model = model2;
    }

//    public SubModelName getSubModel() {
//        return subModel;
//    }
//
//    public void setSubModel(SubModelName subModel) {
//        this.subModel = subModel;
//    }

    @Override
    public String toString() {
        return "model.ModelName{" +
                "model1='" + model1 + '\'' +
                ", model2='" + model + '\'' +
//                ", subModel='" + subModel + '\'' +
                '}';
    }
}
